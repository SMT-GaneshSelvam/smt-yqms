package com.yqms.serviceimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yqms.dto.ImportData;
import com.yqms.model.ImportMaster;
import com.yqms.repository.ImportMasterRepository;
import com.yqms.service.ImportDataService;

@Service
public class ImportDataServiceImpl implements ImportDataService {

	@Autowired
	ImportMasterRepository importMasterRepository;

	@Override
	@Transactional
	public ImportData saveMasterData(ImportData importData) throws Exception {

		String tableName = importData.getTableName();
		List<Map<String,String>> data = importData.getData();

		Optional<ImportMaster> importMaster = importMasterRepository.findById(tableName);

		if (importMaster.isEmpty()) {
			throw new Exception("Incorrect Table/ Table Not Exist For Import");
		}

		List<String> importColumns = Arrays.asList(importMaster.get().getImportColumns().split(","));

		Set<String> importColumnsRequest = data.get(0).keySet();		
		
		importColumnsRequest = importColumnsRequest.stream().map(s -> s.replace(" ", "_")).collect(Collectors.toCollection(HashSet::new));
		
		System.out.println(importColumns.toString());
		System.out.println(importColumnsRequest.toString());
		
		if (!new HashSet(importColumns).equals(importColumnsRequest)) {			
			
			throw new Exception("Incorrect Columns Imported");
		}		

		List<Object[]> records = importMasterRepository.getRecords(tableName, importMaster.get().getImportColumns());

		for (Map<String,String> importRow : data) {

			Boolean recordExist = false;
			Boolean matched = true;

			for (Object[] record : records) {

				if (importRow.get(importColumns.get(0)).equalsIgnoreCase(record[0].toString())) {

					recordExist = true;

					String updateColumns = "";

					for (String field : importRow.keySet()) {
						
						Object obj = record[importColumns.indexOf(field.replace(" ", "_"))];
						
						String str= obj!=null?obj.toString():"";

						if (!importRow.get(field).equalsIgnoreCase(str)) {

							matched = false;

							updateColumns = updateColumns + field.replace(" ", "_") + "='" + importRow.get(field) + "',";

						}

					}

					if (!matched) {

						importMasterRepository.updateRecord(tableName,
								updateColumns.substring(0, updateColumns.length() - 1), importRow.get(importColumns.get(0)));						
					}
					
					break;

				}

			}

			if (!recordExist) {

				String insertColumn = "";
				String insertValue = "";

				for (String field : importRow.keySet()) {

					insertColumn = insertColumn + field.replace(" ", "_") + ",";
					insertValue = insertValue + "'" + importRow.get(field) + "',";

				}

				importMasterRepository.addRecord(tableName, insertColumn.substring(0, insertColumn.length() - 1),
						insertValue.substring(0, insertValue.length() - 1));
			}

			if (recordExist && matched) {

				importRow.put("Import Status","No Change");
				System.out.println("SMT" + "No Change");

			} else if (recordExist && !matched) {

				importRow.put("Import Status","Updated");
				System.out.println("SMT" + "Updated");

			} else if (!recordExist) {

				importRow.put("Import Status","Added");
				System.out.println("SMT" + "Added");

			}

		}
		
		return importData;
	}

}

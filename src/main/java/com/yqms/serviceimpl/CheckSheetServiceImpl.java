package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.yqms.dto.CheckSheetFilter;
import com.yqms.model.CheckSheet;
import com.yqms.repository.CheckSheetRepository;
import com.yqms.service.CheckSheetService;

@Service
public class CheckSheetServiceImpl implements CheckSheetService {
	
    @Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Autowired
	CheckSheetRepository checkSheetRepository;

	@Override
	public List<CheckSheet> getAllCheckSheets(CheckSheetFilter checkSheetFilter) {

		List<CheckSheet> checksheetList  = filterCheckSheets(buildQuery(checkSheetFilter));	
		return checksheetList;
		
	}
	
	public String buildQuery(CheckSheetFilter checkSheetFilter) {
		
		String query = "";
		
		String systemList = null;
		
		if (checkSheetFilter.getSystem().get(0)!="ALL") {
			systemList = String.join("','", checkSheetFilter.getSystem());
			systemList = "'" + systemList + "'";
		}
		
		if (systemList!=null) {
			query =  " WHERE " + "C.SYSTEM_REF IN (" + systemList + ")";
		}
		
		return query;
	}

	public List<CheckSheet> filterCheckSheets(String query) {
		
		return jdbcTemplate.query("SELECT * FROM CHECKSHEET C " + query,  new BeanPropertyRowMapper(CheckSheet.class));
		
	}

}

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
		
		String query = null;		
		String unitList = null;
		String systemList = null;
		String subSystemList = null;
		String locationList = null;
		String areaList = null;
		String subAreaList = null;
		String contractorList = null;
		String typeList = null;
		String subTypeList = null;
		String tagGroupList = null;
		String checkSheetTypeList = null;
		String disciplineList = null;
		String checkSheetRefList = null;
		
		if (checkSheetFilter.getUnit().size()>=1 && !checkSheetFilter.getUnit().get(0).equalsIgnoreCase("ALL")) {
			unitList = String.join("','", checkSheetFilter.getUnit());
			unitList = "'" + unitList + "'";
			query = "C.UNIT_REF IN (" + unitList + ") ";
			
		}
		
		if (checkSheetFilter.getSystem().size()>=1 && !checkSheetFilter.getSystem().get(0).equalsIgnoreCase("ALL")) {
			systemList = String.join("','", checkSheetFilter.getSystem());
			systemList = "'" + systemList + "'";
			
			if (query==null) {
				query = "C.SYSTEM_REF IN (" + systemList + ") ";
			}else {
				query = query + "AND C.SYSTEM_REF IN (" + systemList + ") ";
			}
			
		}
		
		if (checkSheetFilter.getSubSystem().size()>=1 && !checkSheetFilter.getSubSystem().get(0).equalsIgnoreCase("ALL")) {
			subSystemList = String.join("','", checkSheetFilter.getSubSystem());
			subSystemList = "'" + subSystemList + "'";
			
			if (query==null) {
				query = "C.SUBSYSTEM_REF IN (" + subSystemList + ") ";
			}else {
				query = query + "AND C.SUBSYSTEM_REF IN (" + subSystemList + ") ";
			}
			
		}
		
		if (checkSheetFilter.getLocation().size()>=1 && !checkSheetFilter.getLocation().get(0).equalsIgnoreCase("ALL")) {
			locationList = String.join("','", checkSheetFilter.getLocation());
			locationList = "'" + locationList + "'";
			
			if (query==null) {
				query = "C.LOCATION_REF IN (" + locationList + ") ";
			}else {
				query = query + "AND C.LOCATION_REF IN (" + locationList + ") ";
			}
			
		}
		
		if (checkSheetFilter.getArea().size()>=1 && !checkSheetFilter.getArea().get(0).equalsIgnoreCase("ALL")) {
			areaList = String.join("','", checkSheetFilter.getArea());
			areaList = "'" + areaList + "'";
			
			if (query==null) {
				query = "C.AREA_REF IN (" + areaList + ") ";
			}else {
				query = query + "AND C.AREA_REF IN (" + areaList + ") ";
			}
			
		}		
		
		if (checkSheetFilter.getSubArea().size()>=1 && !checkSheetFilter.getSubArea().get(0).equalsIgnoreCase("ALL")) {
			subAreaList = String.join("','", checkSheetFilter.getSubArea());
			subAreaList = "'" + subAreaList + "'";
			
			if (query==null) {
				query = "C.SUBAREA_REF IN (" + subAreaList + ") ";
			}else {
				query = query + "AND C.SUBAREA_REF IN (" + subAreaList + ") ";
			}
			
		}	
		
		if (checkSheetFilter.getContractor().size()>=1 && !checkSheetFilter.getContractor().get(0).equalsIgnoreCase("ALL")) {
			contractorList = String.join("','", checkSheetFilter.getContractor());
			contractorList = "'" + contractorList + "'";
			
			if (query==null) {
				query = "C.CONTRACTOR IN (" + contractorList + ") ";
			}else {
				query = query + "AND C.CONTRACTOR IN (" + contractorList + ") ";
			}
			
		}	
		
		if (checkSheetFilter.getType().size()>=1 && !checkSheetFilter.getType().get(0).equalsIgnoreCase("ALL")) {
			typeList = String.join("','", checkSheetFilter.getType());
			typeList = "'" + typeList + "'";
			
			if (query==null) {
				query = "C.TYPE IN (" + typeList + ") ";
			}else {
				query = query + "AND C.TYPE IN (" + typeList + ") ";
			}
			
		}	
		
		if (checkSheetFilter.getSubType().size()>=1 && !checkSheetFilter.getSubType().get(0).equalsIgnoreCase("ALL")) {
			subTypeList = String.join("','", checkSheetFilter.getSubType());
			subTypeList = "'" + subTypeList + "'";
			
			if (query==null) {
				query = "C.SUB_TYPE IN (" + subTypeList + ") ";
			}else {
				query = query + "AND C.SUB_TYPE IN (" + subTypeList + ") ";
			}
			
		}			
		
		if (checkSheetFilter.getTagGroup().size()>=1 && !checkSheetFilter.getTagGroup().get(0).equalsIgnoreCase("ALL")) {
			tagGroupList = String.join("','", checkSheetFilter.getTagGroup());
			tagGroupList = "'" + tagGroupList + "'";
			
			if (query==null) {
				query = "C.TAG_GROUP IN (" + tagGroupList + ") ";
			}else {
				query = query + "AND C.TAG_GROUP IN (" + tagGroupList + ") ";
			}
			
		}	
		
		
		
		if (checkSheetFilter.getCheckSheetType().size()>=1 && !checkSheetFilter.getCheckSheetType().get(0).equalsIgnoreCase("ALL")) {
			checkSheetTypeList = String.join("','", checkSheetFilter.getCheckSheetType());
			checkSheetTypeList = "'" + checkSheetTypeList + "'";
			
			if (query==null) {
				query = "C.CHECK_TYPE IN (" + checkSheetTypeList + ") ";
			}else {
				query = query + "AND C.CHECK_TYPE IN (" + checkSheetTypeList + ") ";
			}
			
		}	
		
		
		if (checkSheetFilter.getDiscipline().size()>=1 && !checkSheetFilter.getDiscipline().get(0).equalsIgnoreCase("ALL")) {
			disciplineList = String.join(",", checkSheetFilter.getDiscipline());
			disciplineList = "'" + disciplineList + "'";
			
			if (query==null) {
				query = "C.TAG_DISCIPLINE IN (" + disciplineList + ") ";
			}else {
				query = query + "AND C.TAG_DISCIPLINE IN (" + disciplineList + ") ";
			}
			
		}
		
		if (checkSheetFilter.getCheckSheetRef().size()>=1 && !checkSheetFilter.getCheckSheetRef().get(0).equalsIgnoreCase("ALL")) {
			checkSheetRefList = String.join(",", checkSheetFilter.getCheckSheetRef());
			checkSheetRefList = "'" + checkSheetRefList + "'";
			
			if (query==null) {
				query = "C.CHECKSHEET IN (" + checkSheetRefList + ") ";
			}else {
				query = query + "AND C.CHECKSHEET IN (" + checkSheetRefList + ") ";
			}
			
		}
		
		if (query!=null) {
			query = "WHERE " + query;
		}else {
			query = "";
		}
		
		return query;
	}

	public List<CheckSheet> filterCheckSheets(String query) {
		
		return jdbcTemplate.query("SELECT * FROM CHECKSHEET C " + query,  new BeanPropertyRowMapper(CheckSheet.class));
		
	}

}

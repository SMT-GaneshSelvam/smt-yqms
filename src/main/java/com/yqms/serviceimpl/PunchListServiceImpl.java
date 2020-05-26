package com.yqms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.yqms.dto.PunchListFilter;
import com.yqms.model.PunchList;
import com.yqms.service.PunchListService;

@Service
public class PunchListServiceImpl implements PunchListService {
	
    @Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<PunchList> getAllPunchLists(PunchListFilter punchListFilter) {

		List<PunchList> punchListList  = filterPunchLists(buildQuery(punchListFilter));	
		return punchListList;
		
	}
	
	public String buildQuery(PunchListFilter punchListFilter) {
		
		String query = null;	
		String unitList = null;
		String systemList = null;
		String subSystemList = null;
		String locationList = null;
		String areaList = null;
		String subAreaList = null;		
		String categoryList = null;
		String defectTypeList = null;
		String priorityList = null;
		String disciplineList = null;
		String responsibleGroupList = null;
		String workpackTypeList = null;
		
		if (punchListFilter.getPunchListNumber()!=null) {
			query = "P.PUNCHLIST_NO = " + punchListFilter.getPunchListNumber() + " ";
			
		}
		
		if (punchListFilter.getUnit().size()>=1 && !punchListFilter.getUnit().get(0).equalsIgnoreCase("ALL")) {
			unitList = String.join("','", punchListFilter.getUnit());
			unitList = "'" + unitList + "'";
			
			if (query==null) {
				query = "P.UNIT_REF IN (" + unitList + ") ";
			}else {
				query = query + "AND P.UNIT_REF IN (" + unitList + ") ";
			}
			
		}
		
		if (punchListFilter.getSystem().size()>=1 && !punchListFilter.getSystem().get(0).equalsIgnoreCase("ALL")) {
			systemList = String.join("','", punchListFilter.getSystem());
			systemList = "'" + systemList + "'";
			
			if (query==null) {
				query = "P.SYSTEM_REF IN (" + systemList + ") ";
			}else {
				query = query + "AND P.SYSTEM_REF IN (" + systemList + ") ";
			}
			
		}
		
		if (punchListFilter.getSubSystem().size()>=1 && !punchListFilter.getSubSystem().get(0).equalsIgnoreCase("ALL")) {
			subSystemList = String.join("','", punchListFilter.getSubSystem());
			subSystemList = "'" + subSystemList + "'";
			
			if (query==null) {
				query = "P.SUBSYSTEM_REF IN (" + subSystemList + ") ";
			}else {
				query = query + "AND P.SUBSYSTEM_REF IN (" + subSystemList + ") ";
			}
			
		}
		
		if (punchListFilter.getLocation().size()>=1 && !punchListFilter.getLocation().get(0).equalsIgnoreCase("ALL")) {
			locationList = String.join("','", punchListFilter.getLocation());
			locationList = "'" + locationList + "'";
			
			if (query==null) {
				query = "P.LOCATION_REF IN (" + locationList + ") ";
			}else {
				query = query + "AND P.LOCATION_REF IN (" + locationList + ") ";
			}
			
		}
		
		if (punchListFilter.getArea().size()>=1 && !punchListFilter.getArea().get(0).equalsIgnoreCase("ALL")) {
			areaList = String.join("','", punchListFilter.getArea());
			areaList = "'" + areaList + "'";
			
			if (query==null) {
				query = "P.AREA_REF IN (" + areaList + ") ";
			}else {
				query = query + "AND P.AREA_REF IN (" + areaList + ") ";
			}
			
		}		
		
		if (punchListFilter.getSubArea().size()>=1 && !punchListFilter.getSubArea().get(0).equalsIgnoreCase("ALL")) {
			subAreaList = String.join("','", punchListFilter.getSubArea());
			subAreaList = "'" + subAreaList + "'";
			
			if (query==null) {
				query = "P.SUBAREA_REF IN (" + subAreaList + ") ";
			}else {
				query = query + "AND P.SUBAREA_REF IN (" + subAreaList + ") ";
			}
			
		}	
		
		if (punchListFilter.getCategory().size()>=1 && !punchListFilter.getCategory().get(0).equalsIgnoreCase("ALL")) {
			categoryList = String.join("','", punchListFilter.getCategory());
			categoryList = "'" + categoryList + "'";
			
			if (query==null) {
				query = "P.CATEGORY IN (" + categoryList + ") ";
			}else {
				query = query + "AND P.CATEGORY IN (" + categoryList + ") ";
			}
			
		}	
		
		if (punchListFilter.getDefectType().size()>=1 && !punchListFilter.getDefectType().get(0).equalsIgnoreCase("ALL")) {
			defectTypeList = String.join("','", punchListFilter.getDefectType());
			defectTypeList = "'" + defectTypeList + "'";
			
			if (query==null) {
				query = "P.DEFECT_TYPE IN (" + defectTypeList + ") ";
			}else {
				query = query + "AND P.DEFECT_TYPE IN (" + defectTypeList + ") ";
			}
			
		}	
		
		if (punchListFilter.getPriority().size()>=1 && !punchListFilter.getPriority().get(0).equalsIgnoreCase("ALL")) {
			priorityList = String.join("','", punchListFilter.getPriority());
			priorityList = "'" + priorityList + "'";
			
			if (query==null) {
				query = "P.PRIORITY IN (" + priorityList + ") ";
			}else {
				query = query + "AND P.PRIORITY IN (" + priorityList + ") ";
			}
			
		}			
		
		if (punchListFilter.getDiscipline().size()>=1 && !punchListFilter.getDiscipline().get(0).equalsIgnoreCase("ALL")) {
			disciplineList = String.join("','", punchListFilter.getDiscipline());
			disciplineList = "'" + disciplineList + "'";
			
			if (query==null) {
				query = "P.PUNCHLIST_DISCIPLINE IN (" + disciplineList + ") ";
			}else {
				query = query + "AND P.PUNCHLIST_DISCIPLINE IN (" + disciplineList + ") ";
			}
			
		}			
			
		if (punchListFilter.getResponsibleGroup().size()>=1 && !punchListFilter.getResponsibleGroup().get(0).equalsIgnoreCase("ALL")) {
			responsibleGroupList = String.join("','", punchListFilter.getResponsibleGroup());
			responsibleGroupList = "'" + responsibleGroupList + "'";
			
			if (query==null) {
				query = "P.RESPONSIBLE_GROUP IN (" + responsibleGroupList + ") ";
			}else {
				query = query + "AND P.RESPONSIBLE_GROUP IN (" + responsibleGroupList + ") ";
			}
			
		}			
		
		if (punchListFilter.getWorkpack().size()>=1 && !punchListFilter.getWorkpack().get(0).equalsIgnoreCase("ALL")) {
			workpackTypeList = String.join(",", punchListFilter.getWorkpack());
			workpackTypeList = "'" + workpackTypeList + "'";
			
			if (query==null) {
				query = "P.WORKPACK IN (" + workpackTypeList + ") ";
			}else {
				query = query + "AND P.WORKPACK IN (" + workpackTypeList + ") ";
			}
			
		}
		
		if (query!=null) {
			query = "WHERE " + query;
		}else {
			query = "";
		}
		
		return query;
	}

	public List<PunchList> filterPunchLists(String query) {
		
		return jdbcTemplate.query("SELECT * FROM PUNCHLIST P " + query,  new BeanPropertyRowMapper(PunchList.class));
		
	}

}

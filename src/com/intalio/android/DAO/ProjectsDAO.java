package com.intalio.android.DAO;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class ProjectsDAO extends SqlMapClientDaoSupport {
	
	public List getProjects(int offset, int limit) { 
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new LinkedHashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		return super.getSqlMapClientTemplate().queryForList("getProjects",
				QueryData);
	}
	
	public List getProjectByIDMain(String id) 
	{ 
		Map QueryData = new LinkedHashMap();
		QueryData.put("id",id);
		return super.getSqlMapClientTemplate().queryForList("getProjectByIDMain",
				QueryData);
	}
	
	public List getProjectByIDStandard(String id) 
	{ 
		Map QueryData = new LinkedHashMap();
		QueryData.put("id",id);
		return super.getSqlMapClientTemplate().queryForList("getProjectByIDStandard",
				QueryData);
	}
	
	public List getProjectByIDSpecific(String id) 
	{ 
		Map QueryData = new LinkedHashMap();
		QueryData.put("id",id);
		return super.getSqlMapClientTemplate().queryForList("getProjectByIDSpecific",
				QueryData);
	}

}

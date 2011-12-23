package com.intalio.android.DAO;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TasksDAO extends SqlMapClientDaoSupport {
	
	public List getTasks(int offset, int limit) { 
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new LinkedHashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		return super.getSqlMapClientTemplate().queryForList("getTasks",
				QueryData);
	}
	
	public List getTaskByIDMain(String id) 
	{ 
		Map QueryData = new LinkedHashMap();
		QueryData.put("id",id);
		return super.getSqlMapClientTemplate().queryForList("getTaskByIDMain",
				QueryData);
	}
	
	public List getTaskByIDStandard(String id) 
	{ 
		Map QueryData = new LinkedHashMap();
		QueryData.put("id",id);
		return super.getSqlMapClientTemplate().queryForList("getTaskByIDStandard",
				QueryData);
	}
	
	public List getTaskByIDSpecific(String id) 
	{ 
		Map QueryData = new LinkedHashMap();
		QueryData.put("id",id);
		return super.getSqlMapClientTemplate().queryForList("getTaskByIDSpecific",
				QueryData);
	}

}

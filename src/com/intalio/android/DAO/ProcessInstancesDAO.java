package com.intalio.android.DAO;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class ProcessInstancesDAO extends SqlMapClientDaoSupport {
	
	public List getProcessInstances(int offset, int limit) { 
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new LinkedHashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		return super.getSqlMapClientTemplate().queryForList("getProcessInstances",
				QueryData);
	}
	
	public List getProcessInstanceByIDMain(String id) 
	{ 
		Map QueryData = new LinkedHashMap();
		QueryData.put("id",id);
		return super.getSqlMapClientTemplate().queryForList("getProcessInstanceByIDMain",
				QueryData);
	}
	
	public List getProcessInstanceByIDStandard(String id) 
	{ 
		Map QueryData = new LinkedHashMap();
		QueryData.put("id",id);
		return super.getSqlMapClientTemplate().queryForList("getProcessInstanceByIDStandard",
				QueryData);
	}
	
	public List getProcessInstanceByIDSpecific(String id) 
	{ 
		Map QueryData = new LinkedHashMap();
		QueryData.put("id",id);
		return super.getSqlMapClientTemplate().queryForList("getProcessInstanceByIDSpecific",
				QueryData);
	}

}

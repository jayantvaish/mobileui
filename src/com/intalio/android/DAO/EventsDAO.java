package com.intalio.android.DAO;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class EventsDAO extends SqlMapClientDaoSupport {
	
	public List getEvents(int offset, int limit) { 
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new LinkedHashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		return super.getSqlMapClientTemplate().queryForList("getEvents",
				QueryData);
	}
	
	public List getEventByIDMain(String id) 
	{ 
		Map QueryData = new LinkedHashMap();
		QueryData.put("id",id);
		return super.getSqlMapClientTemplate().queryForList("getEventByIDMain",
				QueryData);
	}
	
	public List getEventByIDStandard(String id) 
	{ 
		Map QueryData = new LinkedHashMap();
		QueryData.put("id",id);
		return super.getSqlMapClientTemplate().queryForList("getEventByIDStandard",
				QueryData);
	}
	
	public List getEventByIDSpecific(String id) 
	{ 
		Map QueryData = new LinkedHashMap();
		QueryData.put("id",id);
		return super.getSqlMapClientTemplate().queryForList("getEventByIDSpecific",
				QueryData);
	}
}

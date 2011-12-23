package com.intalio.android.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * DAO class for Leads.
 * 
 * @author ankit
 */

public class LeadsDAO extends SqlMapClientDaoSupport {
	public List getLeads(int offset, int limit) {
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new HashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		return super.getSqlMapClientTemplate().queryForList("getLeads",
				QueryData);
	}

	public List getLeadsByIDMain(String leadid) {
		Map QueryData = new HashMap();
		QueryData.put("id", leadid);
		return super.getSqlMapClientTemplate().queryForList("getLeadsByIDMain",
				QueryData);
	}

	public List getLeadsByIDStandard(String leadid) {
		Map QueryData = new HashMap();
		QueryData.put("id", leadid);
		return super.getSqlMapClientTemplate().queryForList(
				"getLeadsByIDStandard", QueryData);
	}

	public List getLeadsByIDSpecific(String leadid) {
		Map QueryData = new HashMap();
		QueryData.put("id", leadid);
		return super.getSqlMapClientTemplate().queryForList(
				"getLeadsByIDSpecific", QueryData);
	}
}
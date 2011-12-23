package com.intalio.android.DAO;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * DAO class for Pages.
 * 
 * @author ankit
 */

public class PagesDAO extends SqlMapClientDaoSupport {
	public List getPages(int offset, int limit) {
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new LinkedHashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		return super.getSqlMapClientTemplate().queryForList("getPages",
				QueryData);
	}

	public List getPagesOnIDMain(String id) {
		Map QueryData = new LinkedHashMap();
		QueryData.put("id", id);
		return super.getSqlMapClientTemplate().queryForList("getPagesByIDMain",
				QueryData);
	}

	public List getPagesOnIDStandard(String id) {
		Map QueryData = new LinkedHashMap();
		QueryData.put("id", id);
		return super.getSqlMapClientTemplate().queryForList(
				"getPagesByIDStandard", QueryData);
	}

	public List getPagesOnIDSpecific(String id) {
		Map QueryData = new LinkedHashMap();
		QueryData.put("id", id);
		return super.getSqlMapClientTemplate().queryForList(
				"getPagesByIDSpecific", QueryData);
	}

	public List getPagesOnAccountID(long xid, int offset, int limit) {
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new LinkedHashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		QueryData.put("id", xid);
		return super.getSqlMapClientTemplate().queryForList(
				"getPagesByAccountID", QueryData);
	}

}
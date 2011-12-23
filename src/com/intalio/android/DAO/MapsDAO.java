package com.intalio.android.DAO;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * DAO class for Maps.
 * 
 * @author ankit
 */

public class MapsDAO extends SqlMapClientDaoSupport {
	public List getMaps(int offset, int limit) {
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new LinkedHashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		return super.getSqlMapClientTemplate().queryForList("getMaps",
				QueryData);
	}

	public List getMapsOnIDMain(String id) {
		Map QueryData = new LinkedHashMap();
		QueryData.put("id", id);
		return super.getSqlMapClientTemplate().queryForList("getMapsByIDMain",
				QueryData);
	}

	public List getMapsOnIDStandard(String id) {
		Map QueryData = new LinkedHashMap();
		QueryData.put("id", id);
		return super.getSqlMapClientTemplate().queryForList(
				"getMapsByIDStandard", QueryData);
	}

	public List getMapsOnIDSpecific(String id) {
		Map QueryData = new LinkedHashMap();
		QueryData.put("id", id);
		return super.getSqlMapClientTemplate().queryForList(
				"getMapsByIDSpecific", QueryData);
	}

	public List getMapsOnAccountID(long xid, int offset, int limit) {
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new LinkedHashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		QueryData.put("id", xid);
		return super.getSqlMapClientTemplate().queryForList(
				"getMapsByAccountID", QueryData);
	}

}
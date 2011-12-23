package com.intalio.android.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * DAO class for Competitors.
 * 
 * @author ankit
 */

public class CompetitorsDAO extends SqlMapClientDaoSupport {
	public List getCompetitors(int offset, int limit) {
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new HashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		return super.getSqlMapClientTemplate().queryForList("getCompetitors",
				QueryData);
	}

	public List getCompetitorsByID(String productID) {
		Map QueryData = new HashMap();
		QueryData.put("id", productID);
		return super.getSqlMapClientTemplate().queryForList(
				"getCompetitorsByID", QueryData);
	}
}
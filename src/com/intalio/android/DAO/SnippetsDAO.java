package com.intalio.android.DAO;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * DAO class for Snippets.
 * 
 * @author ankit
 */

public class SnippetsDAO extends SqlMapClientDaoSupport {
	public List getSnippets(int offset, int limit) {
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new LinkedHashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		return super.getSqlMapClientTemplate().queryForList("getSnippets",
				QueryData);
	}

	public List getSnippetsOnIDMain(String id) {
		Map QueryData = new LinkedHashMap();
		QueryData.put("id", id);
		return super.getSqlMapClientTemplate().queryForList(
				"getSnippetsByIDMain", QueryData);
	}

	public List getSnippetsOnIDStandard(String id) {
		Map QueryData = new LinkedHashMap();
		QueryData.put("id", id);
		return super.getSqlMapClientTemplate().queryForList(
				"getSnippetsByIDStandard", QueryData);
	}

	public List getSnippetsOnIDSpecific(String id) {
		Map QueryData = new LinkedHashMap();
		QueryData.put("id", id);
		return super.getSqlMapClientTemplate().queryForList(
				"getSnippetsByIDSpecific", QueryData);
	}

	public List getSnippetsOnAccountID(long xid, int offset, int limit) {
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new LinkedHashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		QueryData.put("id", xid);
		return super.getSqlMapClientTemplate().queryForList(
				"getSnippetsByAccountID", QueryData);
	}

}
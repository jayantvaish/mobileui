package com.intalio.android.DAO;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * DAO class for Folders.
 * 
 * @author ankit
 */

public class FoldersDAO extends SqlMapClientDaoSupport {
	public List getFolders(int offset, int limit) {
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new LinkedHashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		return super.getSqlMapClientTemplate().queryForList("getFolders",
				QueryData);
	}

	public List getFoldersByIDMain(String accountid) {
		Map QueryData = new LinkedHashMap();
		QueryData.put("id", accountid);
		return super.getSqlMapClientTemplate().queryForList(
				"getFoldersByIDMain", QueryData);
	}

	public List getFoldersByIDStandard(String accountid) {
		Map QueryData = new LinkedHashMap();
		QueryData.put("id", accountid);
		return super.getSqlMapClientTemplate().queryForList(
				"getFoldersByIDStandard", QueryData);
	}

	public List getFoldersByIDSpecific(String accountid) {
		Map QueryData = new LinkedHashMap();
		QueryData.put("id", accountid);
		return super.getSqlMapClientTemplate().queryForList(
				"getFoldersByIDSpecific", QueryData);
	}
}
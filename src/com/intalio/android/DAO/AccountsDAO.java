package com.intalio.android.DAO;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * DAO class for Accounts.
 * 
 * @author ankit
 */

public class AccountsDAO extends SqlMapClientDaoSupport {
	public List getAccounts(int offset, int limit) {
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new LinkedHashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		return super.getSqlMapClientTemplate().queryForList("getAccounts",
				QueryData);
	}

	public List getAccountsByIDMain(String accountid) {
		Map QueryData = new LinkedHashMap();
		QueryData.put("id", accountid);
		return super.getSqlMapClientTemplate().queryForList(
				"getAccountByIDMain", QueryData);
	}

	public List getAccountsByIDStandard(String accountid) {
		Map QueryData = new LinkedHashMap();
		QueryData.put("id", accountid);
		return super.getSqlMapClientTemplate().queryForList(
				"getAccountByIDStandard", QueryData);
	}

	public List getAccountsByIDSpecific(String accountid) {
		Map QueryData = new LinkedHashMap();
		QueryData.put("id", accountid);
		return super.getSqlMapClientTemplate().queryForList(
				"getAccountByIDSpecific", QueryData);
	}
}
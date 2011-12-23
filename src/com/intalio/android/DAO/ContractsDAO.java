package com.intalio.android.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * DAO class for Contracts.
 * 
 * @author ankit
 */

public class ContractsDAO extends SqlMapClientDaoSupport {
	public List getContracts(int offset, int limit) {
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new HashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		return super.getSqlMapClientTemplate().queryForList("getContracts",
				QueryData);
	}

	public List getContractsOnIDMain(String id) {
		Map QueryData = new HashMap();
		QueryData.put("id", id);
		return super.getSqlMapClientTemplate().queryForList(
				"getContractsOnIDMain", QueryData);
	}

	public List getContractsOnIDStandard(String id) {
		Map QueryData = new HashMap();
		QueryData.put("id", id);
		return super.getSqlMapClientTemplate().queryForList(
				"getContractsOnIDStandard", QueryData);
	}

	public List getContractsOnIDSpecific(String id) {
		Map QueryData = new HashMap();
		QueryData.put("id", id);
		return super.getSqlMapClientTemplate().queryForList(
				"getContractsOnIDSpecific", QueryData);
	}

	public List getContractsOnAccountID(long xid, int offset, int limit) {
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new HashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		QueryData.put("id", xid);
		return super.getSqlMapClientTemplate().queryForList(
				"getContractsOnAccountID", QueryData);
	}
}
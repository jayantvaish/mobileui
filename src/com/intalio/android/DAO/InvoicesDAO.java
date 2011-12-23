package com.intalio.android.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * DAO class for Invoices.
 * 
 * @author ankit
 */

public class InvoicesDAO extends SqlMapClientDaoSupport {
	public List getInvoices(int offset, int limit) {
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new HashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		return super.getSqlMapClientTemplate().queryForList("getInvoices",
				QueryData);
	}

	public List getInvoicesOnIDMain(String id) {
		Map QueryData = new HashMap();
		QueryData.put("id", id);
		return super.getSqlMapClientTemplate().queryForList(
				"getInvoicesOnIDMain", QueryData);
	}

	public List getInvoicesOnIDStandard(String id) {
		Map QueryData = new HashMap();
		QueryData.put("id", id);
		return super.getSqlMapClientTemplate().queryForList(
				"getInvoicesOnIDStandard", QueryData);
	}

	public List getInvoicesOnIDSpecific(String id) {
		Map QueryData = new HashMap();
		QueryData.put("id", id);
		return super.getSqlMapClientTemplate().queryForList(
				"getInvoicesOnIDSpecific", QueryData);
	}

	public List getInvoicesOnAccountID(long xid, int offset, int limit) {
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new HashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		QueryData.put("id", xid);
		return super.getSqlMapClientTemplate().queryForList(
				"getInvoicesOnAccountID", QueryData);
	}
}
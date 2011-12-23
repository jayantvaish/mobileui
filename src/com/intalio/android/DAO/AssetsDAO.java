package com.intalio.android.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * DAO class for Assets.
 * 
 * @author ankit
 */

public class AssetsDAO extends SqlMapClientDaoSupport {
	public List getAssets(int offset, int limit) {
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new HashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		return super.getSqlMapClientTemplate().queryForList("getAssets",
				QueryData);
	}

	public List getAssetsOnIDMain(String id) {
		Map QueryData = new HashMap();
		QueryData.put("id", id);
		return super.getSqlMapClientTemplate().queryForList(
				"getAssetsOnIDMain", QueryData);
	}

	public List getAssetsOnIDStandard(String id) {
		Map QueryData = new HashMap();
		QueryData.put("id", id);
		return super.getSqlMapClientTemplate().queryForList(
				"getAssetsOnIDStandard", QueryData);
	}

	public List getAssetsOnIDSpecific(String id) {
		Map QueryData = new HashMap();
		QueryData.put("id", id);
		return super.getSqlMapClientTemplate().queryForList(
				"getAssetsOnIDSpecific", QueryData);
	}

	public List getAssetsOnAccountID(long xid, int offset, int limit) {
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new HashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		QueryData.put("id", xid);
		return super.getSqlMapClientTemplate().queryForList(
				"getAssetsOnAccountID", QueryData);
	}
}
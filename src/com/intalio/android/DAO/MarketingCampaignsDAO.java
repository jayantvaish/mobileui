package com.intalio.android.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * DAO class for MarketingCampaigns.
 * 
 * @author ankit
 */

public class MarketingCampaignsDAO extends SqlMapClientDaoSupport {
	public List getMarketingCampaigns(int offset, int limit) {
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new HashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		return super.getSqlMapClientTemplate().queryForList(
				"getMarketingCampaigns", QueryData);
	}

	public List getMarketingCampaignsOnIDMain(String id) {
		Map QueryData = new HashMap();
		QueryData.put("id", id);
		return super.getSqlMapClientTemplate().queryForList(
				"getMarketingCampaignsOnIDMain", QueryData);
	}

	public List getMarketingCampaignsOnIDStandard(String id) {
		Map QueryData = new HashMap();
		QueryData.put("id", id);
		return super.getSqlMapClientTemplate().queryForList(
				"getMarketingCampaignsOnIDStandard", QueryData);
	}

	public List getMarketingCampaignsOnIDSpecific(String id) {
		Map QueryData = new HashMap();
		QueryData.put("id", id);
		return super.getSqlMapClientTemplate().queryForList(
				"getMarketingCampaignsOnIDSpecific", QueryData);
	}

	public List getMarketingCampaignsOnAccountID(long xid, int offset, int limit) {
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new HashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		QueryData.put("id", xid);
		return super.getSqlMapClientTemplate().queryForList(
				"getMarketingCampaignsOnAccountID", QueryData);
	}
}
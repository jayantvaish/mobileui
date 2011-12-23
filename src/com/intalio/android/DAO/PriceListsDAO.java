package com.intalio.android.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * DAO class for PriceLists.
 * 
 * @author ankit
 */
public class PriceListsDAO extends SqlMapClientDaoSupport {
	public List getPriceLists(int offset, int limit) {
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new HashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		return super.getSqlMapClientTemplate().queryForList("getPriceLists",
				QueryData);
	}

	public List getPriceListsByID(String pricelistID) {
		Map QueryData = new HashMap();
		QueryData.put("id", pricelistID);
		return super.getSqlMapClientTemplate().queryForList(
				"getPriceListsByID", QueryData);
	}

	public List getPriceListsByProductID(long productID, int offset, int limit) {
		int rowsfrom = offset - 1;
		int rowsto = limit - rowsfrom;
		Map QueryData = new HashMap();
		QueryData.put("startFrom", rowsfrom);
		QueryData.put("upto", rowsto);
		QueryData.put("id", productID);
		return super.getSqlMapClientTemplate().queryForList(
				"getPriceListsByProductID", QueryData);
	}
}
package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;
import com.intalio.android.DAO.PriceListsDAO;

/**
 * Main Business Object class for Products
 * 
 * @author ankit
 * 
 */

public class PriceListsBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private PriceListsDAO pricelistsDAO;

	public PriceListsDAO getPricelistsDAO() {
		return pricelistsDAO;
	}

	public void setPricelistsDAO(PriceListsDAO pricelistsDAO) {
		this.pricelistsDAO = pricelistsDAO;
	}

	/**
	 * Returns pricelists
	 */
	public List getPriceLists(int offset, int limit) {
		try {
			return getPricelistsDAO().getPriceLists(offset, limit);
		} catch (Exception e) {
			logger.error("Error while getting pricelists", e);
		}
		return null;
	}

	/**
	 * Returns detail of pricelists on id
	 */
	public List getPriceListsByID(String pricelistsid) {
		try {
			return getPricelistsDAO().getPriceListsByID(pricelistsid);
		} catch (Exception e) {
			logger.error("Error while getting pricelists by id", e);
		}
		return null;
	}

	/**
	 * Returns associated pricelists on product-id
	 */
	public List getPriceListsByProductID(long productsid, int offset, int limit) {
		try {
			return getPricelistsDAO().getPriceListsByProductID(productsid,
					offset, limit);
		} catch (Exception e) {
			logger.error("Error while getting pricelists by product id", e);
		}
		return null;
	}

}

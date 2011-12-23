package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.intalio.android.DAO.MarketingListsDAO;

/**
 * TODO :: what does this class do?
 * 
 * @author ankit
 * 
 */

public class MarketingListsBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private MarketingListsDAO marketingListsDAO;

	public MarketingListsDAO getMarketingListsDAO() {
		return marketingListsDAO;
	}

	public void setMarketingListsDAO(MarketingListsDAO marketingListsDAO1) {
		this.marketingListsDAO = marketingListsDAO1;
	}

	/**
	 * Returns MarketingLists
	 */
	public List getMarketingLists(int from, int to) {
		try {
			return getMarketingListsDAO().getMarketingLists(from, to);
		} catch (Exception e) {
			logger.error("Error while getting MarketingLists", e);
		}
		return null;
	}

	/**
	 * Returns invoice Details on its id
	 */
	public List getMarketingListsByIDMain(String invoiceid) {
		try {
			return getMarketingListsDAO().getMarketingListsOnIDMain(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Main MarketingLists by id", e);
		}
		return null;
	}

	public List getMarketingListsByIDStandard(String invoiceid) {
		try {
			return getMarketingListsDAO().getMarketingListsOnIDStandard(
					invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Standard MarketingLists by id", e);
		}
		return null;
	}

	public List getMarketingListsByIDSpecific(String invoiceid) {
		try {
			return getMarketingListsDAO().getMarketingListsOnIDSpecific(
					invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Specific MarketingLists by id", e);
		}
		return null;
	}

	/**
	 * Returns invoice Details on its id
	 */
	public List getMarketingListsByAccountID(long accountid, int from, int to) {
		try {
			return getMarketingListsDAO().getMarketingListsOnAccountID(
					accountid, from, to);
		} catch (Exception e) {
			logger.error("Error while getting MarketingLists by id", e);
		}
		return null;
	}
}

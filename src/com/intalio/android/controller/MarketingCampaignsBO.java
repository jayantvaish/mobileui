package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.intalio.android.DAO.MarketingCampaignsDAO;

/**
 * TODO :: what does this class do?
 * 
 * @author ankit
 * 
 */

public class MarketingCampaignsBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private MarketingCampaignsDAO MarketingCampaignsDAO;

	public MarketingCampaignsDAO getMarketingCampaignsDAO() {
		return MarketingCampaignsDAO;
	}

	public void setMarketingCampaignsDAO(
			MarketingCampaignsDAO MarketingCampaignsDAO1) {
		this.MarketingCampaignsDAO = MarketingCampaignsDAO1;
	}

	/**
	 * Returns MarketingCampaigns
	 */
	public List getMarketingCampaigns(int from, int to) {
		try {
			return getMarketingCampaignsDAO().getMarketingCampaigns(from, to);
		} catch (Exception e) {
			logger.error("Error while getting MarketingCampaigns", e);
		}
		return null;
	}

	/**
	 * Returns invoice Details on its id
	 */
	public List getMarketingCampaignsByIDMain(String invoiceid) {
		try {
			return getMarketingCampaignsDAO().getMarketingCampaignsOnIDMain(
					invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Main MarketingCampaigns by id", e);
		}
		return null;
	}

	public List getMarketingCampaignsByIDStandard(String invoiceid) {
		try {
			return getMarketingCampaignsDAO()
					.getMarketingCampaignsOnIDStandard(invoiceid);
		} catch (Exception e) {
			logger.error(
					"Error while getting Standard MarketingCampaigns by id", e);
		}
		return null;
	}

	public List getMarketingCampaignsByIDSpecific(String invoiceid) {
		try {
			return getMarketingCampaignsDAO()
					.getMarketingCampaignsOnIDSpecific(invoiceid);
		} catch (Exception e) {
			logger.error(
					"Error while getting Specific MarketingCampaigns by id", e);
		}
		return null;
	}

	/**
	 * Returns invoice Details on its id
	 */
	public List getMarketingCampaignsByAccountID(long accountid, int from,
			int to) {
		try {
			return getMarketingCampaignsDAO().getMarketingCampaignsOnAccountID(
					accountid, from, to);
		} catch (Exception e) {
			logger.error("Error while getting MarketingCampaigns by id", e);
		}
		return null;
	}
}

package com.intalio.android.controller;

import java.util.List;
import org.apache.log4j.Logger;
import com.intalio.android.DAO.OpportunitiesDAO;

/**
 * TODO :: what does this class do?
 * 
 * @author ankit
 * 
 */

public class OpportunitiesBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private OpportunitiesDAO opportunityDAO;

	public OpportunitiesDAO getOpportunitiesDAO() {
		return opportunityDAO;
	}

	public void setOpportunitiesDAO(OpportunitiesDAO opportunityDAO1) {
		this.opportunityDAO = opportunityDAO1;
	}

	/**
	 * Returns opportunities
	 */

	public List getOpportunities(int offset, int limit) {
		try {
			return getOpportunitiesDAO().getOpportunities(offset, limit);
		} catch (Exception e) {
			logger.error("Error while getting opportunities", e);
		}
		return null;
	}

	/**
	 * Returns details of opportunity on id
	 */
	public List getOpportunitiesByIDMain(String oppID) {
		try {
			return getOpportunitiesDAO().getOpportunitiesByIDMain(oppID);
		} catch (Exception e) {
			logger.error("Error while getting opportunities on id", e);
		}
		return null;
	}

	public List getOpportunitiesByIDStandard(String oppID) {
		try {
			return getOpportunitiesDAO().getOpportunitiesByIDStandard(oppID);
		} catch (Exception e) {
			logger.error("Error while getting opportunities on id", e);
		}
		return null;
	}

	public List getOpportunitiesByIDSpecific(String oppID) {
		try {
			return getOpportunitiesDAO().getOpportunitiesByIDSpecific(oppID);
		} catch (Exception e) {
			logger.error("Error while getting opportunities on id", e);
		}
		return null;
	}

	/**
	 * Returns details of opportunity on Account id
	 */
	public List getOpportunitiesByAccountID(long acctid, int offset, int limit) {
		try {
			return getOpportunitiesDAO().getOpportunitiesByAccountID(acctid,
					offset, limit);
		} catch (Exception e) {
			logger.error("Error while getting opportunities on Account id", e);
		}
		return null;
	}

}

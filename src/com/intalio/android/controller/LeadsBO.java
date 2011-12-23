package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;
import com.intalio.android.DAO.LeadsDAO;

/**
 * TODO :: what does this class do?
 * 
 * @author ankit
 * 
 */

public class LeadsBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private LeadsDAO leadsDAO;

	public LeadsDAO getLeadsDAO() {
		return leadsDAO;
	}

	public void setLeadsDAO(LeadsDAO leadsDAO1) {
		this.leadsDAO = leadsDAO1;
	}

	/**
	 * Returns leads
	 */
	public List getLeads(int offset, int limit) {
		try {
			return getLeadsDAO().getLeads(offset, limit);
		} catch (Exception e) {
			logger.error("Error while getting leads", e);
		}
		return null;
	}

	/**
	 * Returns detail of lead on id
	 */
	public List getLeadsByIDMain(String leadsID) {
		try {
			return getLeadsDAO().getLeadsByIDMain(leadsID);
		} catch (Exception e) {
			logger.error("Error while getting Main-leads by id", e);
		}
		return null;
	}

	public List getLeadsByIDStandard(String leadsID) {
		try {
			return getLeadsDAO().getLeadsByIDStandard(leadsID);
		} catch (Exception e) {
			logger.error("Error while getting Standard leads by id", e);
		}
		return null;
	}

	public List getLeadsByIDSpecific(String leadsID) {
		try {
			return getLeadsDAO().getLeadsByIDSpecific(leadsID);
		} catch (Exception e) {
			logger.error("Error while getting Specific leads by id", e);
		}
		return null;
	}

}

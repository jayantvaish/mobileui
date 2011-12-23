package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;
import com.intalio.android.DAO.CasesDAO;

/**
 * TODO :: what does this class do?
 * 
 * @author ankit
 * 
 */

public class CasesBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private CasesDAO casesDAO;

	public CasesDAO getCasesDAO() {
		return casesDAO;
	}

	public void setCasesDAO(CasesDAO casesDAO1) {
		this.casesDAO = casesDAO1;
	}

	/**
	 * Returns Cases
	 */
	public List getCases(int from, int to) {
		try {
			return getCasesDAO().getCases(from, to);
		} catch (Exception e) {
			logger.error("Error while getting Cases", e);
		}
		return null;
	}

	/**
	 * Returns invoice Details on its id
	 */
	public List getCasesByIDMain(String invoiceid) {
		try {
			return getCasesDAO().getCasesOnIDMain(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Main Cases by id", e);
		}
		return null;
	}

	public List getCasesByIDStandard(String invoiceid) {
		try {
			return getCasesDAO().getCasesOnIDStandard(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Standard Cases by id", e);
		}
		return null;
	}

	public List getCasesByIDSpecific(String invoiceid) {
		try {
			return getCasesDAO().getCasesOnIDSpecific(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Specific Cases by id", e);
		}
		return null;
	}

	/**
	 * Returns invoice Details on its id
	 */
	public List getCasesByAccountID(long accountid, int from, int to) {
		try {
			return getCasesDAO().getCasesOnAccountID(accountid, from, to);
		} catch (Exception e) {
			logger.error("Error while getting Cases by id", e);
		}
		return null;
	}
}

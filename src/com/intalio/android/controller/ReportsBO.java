package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.intalio.android.DAO.ReportsDAO;

/**
 * TODO :: what does this class do?
 * 
 * @author ankit
 * 
 */

public class ReportsBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private ReportsDAO reportsDAO;

	public ReportsDAO getReportsDAO() {
		return reportsDAO;
	}

	public void setReportsDAO(ReportsDAO reportsDAO1) {
		this.reportsDAO = reportsDAO1;
	}

	/**
	 * Returns Reports
	 */
	public List getReports(int from, int to) {
		try {
			return getReportsDAO().getReports(from, to);
		} catch (Exception e) {
			logger.error("Error while getting Reports", e);
		}
		return null;
	}

	/**
	 * Returns invoice Details on its id
	 */
	public List getReportsByIDMain(String invoiceid) {
		try {
			return getReportsDAO().getReportsOnIDMain(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Main Reports by id", e);
		}
		return null;
	}

	public List getReportsByIDStandard(String invoiceid) {
		try {
			return getReportsDAO().getReportsOnIDStandard(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Standard Reports by id", e);
		}
		return null;
	}

	public List getReportsByIDSpecific(String invoiceid) {
		try {
			return getReportsDAO().getReportsOnIDSpecific(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Specific Reports by id", e);
		}
		return null;
	}

	/**
	 * Returns invoice Details on its id
	 */
	public List getReportsByAccountID(long accountid, int from, int to) {
		try {
			return getReportsDAO().getReportsOnAccountID(accountid, from, to);
		} catch (Exception e) {
			logger.error("Error while getting Reports by id", e);
		}
		return null;
	}
}

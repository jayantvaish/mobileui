package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.intalio.android.DAO.KPIDAO;

/**
 * TODO :: what does this class do?
 * 
 * @author ankit
 * 
 */

public class KPIBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private KPIDAO KPIDAO;

	public KPIDAO getKPIDAO() {
		return KPIDAO;
	}

	public void setKPIDAO(KPIDAO KPIDAO1) {
		this.KPIDAO = KPIDAO1;
	}

	/**
	 * Returns KPI
	 */
	public List getKPI(int from, int to) {
		try {
			return getKPIDAO().getKPI(from, to);
		} catch (Exception e) {
			logger.error("Error while getting KPI", e);
		}
		return null;
	}

	/**
	 * Returns invoice Details on its id
	 */
	public List getKPIByIDMain(String invoiceid) {
		try {
			return getKPIDAO().getKPIOnIDMain(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Main KPI by id", e);
		}
		return null;
	}

	public List getKPIByIDStandard(String invoiceid) {
		try {
			return getKPIDAO().getKPIOnIDStandard(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Standard KPI by id", e);
		}
		return null;
	}

	public List getKPIByIDSpecific(String invoiceid) {
		try {
			return getKPIDAO().getKPIOnIDSpecific(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Specific KPI by id", e);
		}
		return null;
	}

	/**
	 * Returns invoice Details on its id
	 */
	public List getKPIByAccountID(long accountid, int from, int to) {
		try {
			return getKPIDAO().getKPIOnAccountID(accountid, from, to);
		} catch (Exception e) {
			logger.error("Error while getting KPI by id", e);
		}
		return null;
	}
}

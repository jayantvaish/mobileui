package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.intalio.android.DAO.SLADAO;

/**
 * TODO :: what does this class do?
 * 
 * @author ankit
 * 
 */

public class SLABO {

	private Logger logger = Logger.getLogger(this.getClass());
	private SLADAO SLADAO;

	public SLADAO getSLADAO() {
		return SLADAO;
	}

	public void setSLADAO(SLADAO SLADAO1) {
		this.SLADAO = SLADAO1;
	}

	/**
	 * Returns SLA
	 */
	public List getSLA(int from, int to) {
		try {
			return getSLADAO().getSLA(from, to);
		} catch (Exception e) {
			logger.error("Error while getting SLA", e);
		}
		return null;
	}

	/**
	 * Returns invoice Details on its id
	 */
	public List getSLAByIDMain(String invoiceid) {
		try {
			return getSLADAO().getSLAOnIDMain(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Main SLA by id", e);
		}
		return null;
	}

	public List getSLAByIDStandard(String invoiceid) {
		try {
			return getSLADAO().getSLAOnIDStandard(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Standard SLA by id", e);
		}
		return null;
	}

	public List getSLAByIDSpecific(String invoiceid) {
		try {
			return getSLADAO().getSLAOnIDSpecific(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Specific SLA by id", e);
		}
		return null;
	}

	/**
	 * Returns invoice Details on its id
	 */
	public List getSLAByAccountID(long accountid, int from, int to) {
		try {
			return getSLADAO().getSLAOnAccountID(accountid, from, to);
		} catch (Exception e) {
			logger.error("Error while getting SLA by id", e);
		}
		return null;
	}
}

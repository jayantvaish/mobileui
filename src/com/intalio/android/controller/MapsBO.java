package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;
import com.intalio.android.DAO.MapsDAO;

/**
 * TODO :: what does this class do?
 * 
 * @author ankit
 * 
 */

public class MapsBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private MapsDAO mapDAO;

	public MapsDAO getMapsDAO() {
		return mapDAO;
	}

	public void setMapsDAO(MapsDAO mapDAO1) {
		this.mapDAO = mapDAO1;
	}

	/**
	 * Returns All Maps
	 */
	public List getMaps(int from, int to) {
		try {
			return getMapsDAO().getMaps(from, to);
		} catch (Exception e) {
			logger.error("Error while getting Maps", e);
		}
		return null;
	}

	/**
	 * Returns Contact Details on its id
	 */
	public List getMapsByIDMain(String contactid) {
		try {
			return getMapsDAO().getMapsOnIDMain(contactid);
		} catch (Exception e) {
			logger.error("Error while getting Main contact on id", e);
		}
		return null;
	}

	public List getMapsByIDStandard(String contactid) {
		try {
			return getMapsDAO().getMapsOnIDStandard(contactid);
		} catch (Exception e) {
			logger.error("Error while getting Standard contact on id", e);
		}
		return null;
	}

	public List getMapsByIDSpecific(String contactid) {
		try {
			return getMapsDAO().getMapsOnIDSpecific(contactid);
		} catch (Exception e) {
			logger.error("Error while getting Specific contact on id", e);
		}
		return null;
	}

	/**
	 * Returns all Maps against an Account
	 */
	public List getMapsByAccount(long accountid, int from, int to) {
		try {
			return getMapsDAO().getMapsOnAccountID(accountid, from, to);
		} catch (Exception e) {
			logger.error("Error while getting Maps on account", e);
		}
		return null;
	}
}

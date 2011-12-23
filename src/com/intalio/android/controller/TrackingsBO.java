package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;
import com.intalio.android.DAO.TrackingsDAO;

/**
 * TODO :: what does this class do?
 * 
 * @author ankit
 * 
 */

public class TrackingsBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private TrackingsDAO trackingDAO;

	public TrackingsDAO getTrackingsDAO() {
		return trackingDAO;
	}

	public void setTrackingsDAO(TrackingsDAO trackingDAO1) {
		this.trackingDAO = trackingDAO1;
	}

	/**
	 * Returns Trackings
	 */
	public List getTrackings(int from, int to) {
		try {
			return getTrackingsDAO().getTrackings(from, to);
		} catch (Exception e) {
			logger.error("Error while getting Trackings", e);
		}
		return null;
	}

	/**
	 * Returns invoice Details on its id
	 */
	public List getTrackingsByIDMain(String invoiceid) {
		try {
			return getTrackingsDAO().getTrackingsOnIDMain(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Main Trackings by id", e);
		}
		return null;
	}

	public List getTrackingsByIDStandard(String invoiceid) {
		try {
			return getTrackingsDAO().getTrackingsOnIDStandard(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Standard Trackings by id", e);
		}
		return null;
	}

	public List getTrackingsByIDSpecific(String invoiceid) {
		try {
			return getTrackingsDAO().getTrackingsOnIDSpecific(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Specific Trackings by id", e);
		}
		return null;
	}

	/**
	 * Returns invoice Details on its id
	 */
	public List getTrackingsByAccountID(long accountid, int from, int to) {
		try {
			return getTrackingsDAO().getTrackingsOnAccountID(accountid, from,
					to);
		} catch (Exception e) {
			logger.error("Error while getting Trackings by id", e);
		}
		return null;
	}
}

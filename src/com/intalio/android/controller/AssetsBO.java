package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;
import com.intalio.android.DAO.AssetsDAO;

/**
 * TODO :: what does this class do?
 * 
 * @author ankit
 * 
 */

public class AssetsBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private AssetsDAO assetDAO;

	public AssetsDAO getAssetsDAO() {
		return assetDAO;
	}

	public void setAssetsDAO(AssetsDAO assetDAO1) {
		this.assetDAO = assetDAO1;
	}

	/**
	 * Returns Assets
	 */
	public List getAssets(int from, int to) {
		try {
			return getAssetsDAO().getAssets(from, to);
		} catch (Exception e) {
			logger.error("Error while getting Assets", e);
		}
		return null;
	}

	/**
	 * Returns invoice Details on its id
	 */
	public List getAssetsByIDMain(String invoiceid) {
		try {
			return getAssetsDAO().getAssetsOnIDMain(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Main assets by id", e);
		}
		return null;
	}

	public List getAssetsByIDStandard(String invoiceid) {
		try {
			return getAssetsDAO().getAssetsOnIDStandard(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Standard assets by id", e);
		}
		return null;
	}

	public List getAssetsByIDSpecific(String invoiceid) {
		try {
			return getAssetsDAO().getAssetsOnIDSpecific(invoiceid);
		} catch (Exception e) {
			logger.error("Error while getting Specific assets by id", e);
		}
		return null;
	}

	/**
	 * Returns invoice Details on its id
	 */
	public List getAssetsByAccountID(long accountid, int from, int to) {
		try {
			return getAssetsDAO().getAssetsOnAccountID(accountid, from, to);
		} catch (Exception e) {
			logger.error("Error while getting assets by id", e);
		}
		return null;
	}
}

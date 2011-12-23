package com.intalio.android.controller;

import java.util.List;
import org.apache.log4j.Logger;
import com.intalio.android.DAO.FoldersDAO;

/**
 * TODO :: what does this class do?
 * 
 * @author ankit
 * 
 */

public class FoldersBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private FoldersDAO folderDAO;

	public FoldersDAO getFoldersDAO() {
		return folderDAO;
	}

	public void setFoldersDAO(FoldersDAO folderDAO1) {
		this.folderDAO = folderDAO1;
	}

	/**
	 * Returns rows from offset to limit
	 */
	public List getFolders(int offset, int limit) {
		try {
			return getFoldersDAO().getFolders(offset, limit);
		} catch (Exception e) {
			logger.error("Error while getting Folders", e);
		}
		return null;
	}

	/**
	 * Returns details of a single Folders
	 */
	public List getFoldersByIDMain(String acctid) {
		try {
			return getFoldersDAO().getFoldersByIDMain(acctid);
		} catch (Exception e) {
			logger.error("Error while getting Main-Folders by id", e);
		}
		return null;
	}

	public List getFoldersByIDStandard(String acctid) {
		try {
			return getFoldersDAO().getFoldersByIDStandard(acctid);
		} catch (Exception e) {
			logger.error("Error while getting Standard-Folders by id", e);
		}
		return null;
	}

	public List getFoldersByIDSpecific(String acctid) {
		try {
			return getFoldersDAO().getFoldersByIDSpecific(acctid);
		} catch (Exception e) {
			logger.error("Error while getting Specific-Folders by id", e);
		}
		return null;
	}
}

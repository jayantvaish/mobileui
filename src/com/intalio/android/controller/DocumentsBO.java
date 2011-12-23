package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.intalio.android.DAO.DocumentsDAO;

/**
 * TODO :: what does this class do?
 * 
 * @author ankit
 * 
 */

public class DocumentsBO {

	private Logger logger = Logger.getLogger(this.getClass());
	private DocumentsDAO documentDAO;

	public DocumentsDAO getDocumentsDAO() {
		return documentDAO;
	}

	public void setDocumentsDAO(DocumentsDAO documentDAO1) {
		this.documentDAO = documentDAO1;
	}

	/**
	 * Returns All Documents
	 */
	public List getDocuments(int from, int to) {
		try {
			return getDocumentsDAO().getDocuments(from, to);
		} catch (Exception e) {
			logger.error("Error while getting Documents", e);
		}
		return null;
	}

	/**
	 * Returns Contact Details on its id
	 */
	public List getDocumentsByIDMain(String contactid) {
		try {
			return getDocumentsDAO().getDocumentsOnIDMain(contactid);
		} catch (Exception e) {
			logger.error("Error while getting Main contact on id", e);
		}
		return null;
	}

	public List getDocumentsByIDStandard(String contactid) {
		try {
			return getDocumentsDAO().getDocumentsOnIDStandard(contactid);
		} catch (Exception e) {
			logger.error("Error while getting Standard contact on id", e);
		}
		return null;
	}

	public List getDocumentsByIDSpecific(String contactid) {
		try {
			return getDocumentsDAO().getDocumentsOnIDSpecific(contactid);
		} catch (Exception e) {
			logger.error("Error while getting Specific contact on id", e);
		}
		return null;
	}

	/**
	 * Returns all Documents against an Account
	 */
	public List getDocumentsByAccount(long accountid, int from, int to) {
		try {
			return getDocumentsDAO().getDocumentsOnAccountID(accountid, from,
					to);
		} catch (Exception e) {
			logger.error("Error while getting Documents on account", e);
		}
		return null;
	}
}

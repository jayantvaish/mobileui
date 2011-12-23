package com.intalio.android.controller;

import java.util.List;
import com.intalio.android.DAO.GenericDAO;

/**
 * This is generic class for performing operations which are generic to all
 * Objects
 * 
 * @author veresh
 */

public class GenericBO {
	private GenericDAO genericDAO;

	public GenericDAO getGenericDAO() {
		return genericDAO;
	}

	public void setGenericDAO(GenericDAO genericDAO) {
		this.genericDAO = genericDAO;
	}

	/**
	 * @param objectName
	 * @return
	 */
	public List getObjectCount() {
		return this.genericDAO.getObjectCount();
	}
}

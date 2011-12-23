package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.intalio.android.DAO.ProjectsDAO;
import com.intalio.android.DAO.TasksDAO;

public class ProjectsBO {
	
	private Logger logger = Logger.getLogger(this.getClass());
	private ProjectsDAO projectsDAO;
	
	public ProjectsDAO getProjectsDAO() {
		return projectsDAO;
	}
	
	public void setProjectsDAO(ProjectsDAO projectsDAO) {
		this.projectsDAO = projectsDAO;
	}
	
	/**
	 * Returns rows from offset to limit
	 */
	public List getProjects(int offset, int limit) {
		try {
			return getProjectsDAO().getProjects(offset, limit);
		} catch (Exception e) {
			logger.error("Error while getting Project", e);
		}
		return null;
	}
	
	/**
	 * Returns details of a single project
	 */
	public List getProjectByIDMain(String id) 
	{
		try 
		{
			return getProjectsDAO().getProjectByIDMain(id);
		} 
		catch (Exception e) 
		{
			logger.error("Error while getting Main-Project by id", e);
		}
		return null;
	}
	
	public List getProjectByIDStandard(String id) 
	{
		try 
		{
			return getProjectsDAO().getProjectByIDStandard(id);
		} 
		catch (Exception e) 
		{
			logger.error("Error while getting Standard-Project by id", e);
		}
		return null;
	}
	
	public List getProjectByIDSpecific(String id) 
	{
		try 
		{
			return getProjectsDAO().getProjectByIDSpecific(id);
		} 
		catch (Exception e) 
		{
			logger.error("Error while getting Specific-Project by id", e);
		}
		return null;
	}
	
	

}

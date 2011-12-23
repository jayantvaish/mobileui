package com.intalio.android.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.intalio.android.DAO.TasksDAO;

public class TasksBO {
	
	private Logger logger = Logger.getLogger(this.getClass());
	private TasksDAO tasksDAO;
	
	public TasksDAO getTasksDAO() {
		return tasksDAO;
	}
	public void setTasksDAO(TasksDAO tasksDAO) {
		this.tasksDAO = tasksDAO;
	}
	
	/**
	 * Returns rows from offset to limit
	 */
	public List getTasks(int offset, int limit) {
		try {
			return getTasksDAO().getTasks(offset, limit);
		} catch (Exception e) {
			logger.error("Error while getting Tasks", e);
		}
		return null;
	}
	
	/**
	 * Returns details of a single task
	 */
	public List getTaskByIDMain(String id) 
	{
		try 
		{
			return getTasksDAO().getTaskByIDMain(id);
		} 
		catch (Exception e) 
		{
			logger.error("Error while getting Main-Task by id", e);
		}
		return null;
	}
	
	public List getTaskByIDStandard(String id) 
	{
		try 
		{
			return getTasksDAO().getTaskByIDStandard(id);
		} 
		catch (Exception e) 
		{
			logger.error("Error while getting Standard-Task by id", e);
		}
		return null;
	}
	
	public List getTaskByIDSpecific(String id) 
	{
		try 
		{
			return getTasksDAO().getTaskByIDSpecific(id);
		} 
		catch (Exception e) 
		{
			logger.error("Error while getting Specific-Task by id", e);
		}
		return null;
	}
	
	

}

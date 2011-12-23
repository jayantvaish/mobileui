package com.intalio.android.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class GenericDAO extends SqlMapClientDaoSupport {
	Logger log = Logger.getLogger(this.getClass());

	public List getObjectCount() {

		Map<String, String> params = new HashMap<String, String>();
		params.put("objname", "count");
		log.debug("Params are :: " + params);
		return super.getSqlMapClientTemplate().queryForList("getObjectCount",
				params);
	}
}

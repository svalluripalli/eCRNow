package com.drajer.sof.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.drajer.sof.dao.LaunchDetailsDao;
import com.drajer.sof.model.LaunchDetails;
import com.drajer.sof.service.LaunchService;

@Service
@Transactional
public class LaunchServiceImpl implements LaunchService{

	@Autowired
	LaunchDetailsDao authDetailsDao;
	
	public LaunchDetails saveOrUpdate(LaunchDetails authDetails) {
		authDetailsDao.saveOrUpdate(authDetails);
		return authDetails;
	}

	public LaunchDetails getAuthDetailsById(Integer id) {
		return authDetailsDao.getAuthDetailsById(id);
	}

}

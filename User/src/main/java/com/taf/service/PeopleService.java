package com.taf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taf.dao.IPeopleDao;
import com.taf.entity.People;
@Service
public class PeopleService {

	@Autowired
	IPeopleDao peopleDao;
	public People getPeople(){
		return peopleDao.getPeople();
	}
}

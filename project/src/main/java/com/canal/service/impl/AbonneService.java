package com.canal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canal.bean.Abonne;
import com.canal.dao.IAbonneDao;
import com.canal.service.IAbonneService;

@Service
public class AbonneService implements IAbonneService {
	
	@Autowired
    private IAbonneDao abonneDao;
	
	public Abonne getAbonneById(int id) {
		return abonneDao.getAbonneById(id);
	}

}

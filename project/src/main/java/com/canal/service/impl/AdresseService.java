package com.canal.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canal.bean.Adresse;
import com.canal.bean.Mouvement;
import com.canal.dao.IAdresseDao;
import com.canal.dao.IMouvementDao;
import com.canal.service.IAdresseService;

@Service
public class AdresseService implements IAdresseService {

	@Autowired
    private IAdresseDao adresseDao;
	
	@Autowired
	private IMouvementDao mouvementDao;
	
	public Adresse updateAdresse(Adresse adresseUpdate) {
		Adresse adresse = adresseDao.updateAdresse(adresseUpdate);
		int id = (int) Math.random();
		Mouvement mouvement = new Mouvement(id,"modification adresse", new Date(), adresseUpdate.getIdAdresse());
		mouvementDao.insertMouvement(mouvement);
		return adresse;
	}

	@Override
	public List<Adresse> getAdresseByIdAbonne(int idAbonne) {
		return adresseDao.getAdresseByIdAbonne(idAbonne);
	}
}

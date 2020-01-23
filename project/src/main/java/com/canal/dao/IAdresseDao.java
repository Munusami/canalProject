package com.canal.dao;

import java.util.List;

import com.canal.bean.Adresse;

public interface IAdresseDao {
	
	public Adresse updateAdresse(Adresse adresse);
	
	public List<Adresse> getAdresseByIdAbonne(int idAbonne);

}

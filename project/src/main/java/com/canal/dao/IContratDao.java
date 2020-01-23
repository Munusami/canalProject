package com.canal.dao;

import java.util.List;

import com.canal.bean.Contrat;

public interface IContratDao {
	public List<Contrat> getContratByIdAbonne(int idAbonne);
	
	public List<Contrat> getContratByIdAdresse(int idAdresse);

}

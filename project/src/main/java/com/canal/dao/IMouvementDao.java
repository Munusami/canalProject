package com.canal.dao;

import java.util.List;

import com.canal.bean.Mouvement;

public interface IMouvementDao {
	
	public int insertMouvement(Mouvement mouvement);
	
	public List<Mouvement> getMouvementByIdAdresse(int idAdresse);

}

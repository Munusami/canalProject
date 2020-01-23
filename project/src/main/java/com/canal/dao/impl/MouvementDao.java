package com.canal.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.canal.bean.Mouvement;
import com.canal.dao.IMouvementDao;

@Repository
public class MouvementDao extends Dao implements IMouvementDao {
	
	public int insertMouvement(Mouvement mouvement) {
		
		return jtm.update("INSERT INTO mouvement(typeModification, dateModification, id_adresse) VALUES(?,?)", 
				mouvement.getTypeModification(), mouvement.getDateModification(), mouvement.getIdAdresse());
	}
	
	public List<Mouvement> getMouvementByIdAdresse(int idAdresse){
		String sql = "SELECT * FROM mouvement WHERE id_adresse = ?";
        return jtm.query(sql,  new Object[]{idAdresse}, new BeanPropertyRowMapper<>(Mouvement.class));
	}

}

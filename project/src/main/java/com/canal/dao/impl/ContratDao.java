package com.canal.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.canal.bean.Contrat;
import com.canal.dao.IContratDao;

@Repository
public class ContratDao extends Dao implements IContratDao {
	
	@Override
	public List<Contrat> getContratByIdAbonne(int idAbonne) {
		String sql = "SELECT * FROM contrat WHERE id_abonne = ?";
        return jtm.query(sql,  new Object[]{idAbonne}, new BeanPropertyRowMapper<>(Contrat.class));
	}

	@Override
	public List<Contrat> getContratByIdAdresse(int idAdresse) {
		String sql = "SELECT * FROM contrat WHERE id_adresse = ?";
        return jtm.query(sql,  new Object[]{idAdresse}, new BeanPropertyRowMapper<>(Contrat.class));
	}

}

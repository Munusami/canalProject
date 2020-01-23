package com.canal.dao.impl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.canal.bean.Abonne;
import com.canal.dao.IAbonneDao;

@Repository
public class AbonneDao extends Dao implements IAbonneDao {
	 
	
	public Abonne getAbonneById(int idAbonne) {
		String sql = "SELECT * FROM Abonne WHERE id_abonne = ?";
        return jtm.queryForObject(sql, new Object[]{idAbonne},
                new BeanPropertyRowMapper<>(Abonne.class));
    }
	

}

package com.canal.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.canal.bean.Adresse;
import com.canal.dao.IAdresseDao;

@Repository
public class AdresseDao extends Dao implements IAdresseDao {
	
	public Adresse updateAdresse(Adresse adresse) {
		jtm.update("update adresse set active = ?, pays = ?, rue = ?, codePostal = ?, ville = ? where id_adresse = ?", adresse.isActive(),
		adresse.getPays(), adresse.getRue(), adresse.getCodePostal(), adresse.getVille(), adresse.getIdAdresse());
		return adresse;
	}

	@Override
	public List<Adresse> getAdresseByIdAbonne(int idAbonne) {
		String sql = "SELECT * FROM adresse WHERE id_abonne = ?";
        return jtm.query(sql,  new Object[]{idAbonne}, new BeanPropertyRowMapper<>(Adresse.class));

	}
	
	

}

package com.canal.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Mouvement {
	private int idMouvement;
	private String typeModification;
	private Date dateModification;
	private int idAdresse;
	
	public Mouvement() {
		
	}

	public Mouvement(int idMouvement, String typeModification, Date dateModification, int idAdresse) {
		super();
		this.idMouvement = idMouvement;
		this.typeModification = typeModification;
		this.dateModification = dateModification;
		this.idAdresse = idAdresse;
	}
	
	
	
	

}

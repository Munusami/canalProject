package com.canal.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contrat {
	
	private int idContrat;
	private String canal;
	private String condition;
	//permet de prendre en compte le cas où les abonnés ont des contrats avec des adresses différentes
	private int idAdresse;
	private int idAbonne;
	
	public Contrat() {
		
	}
	
	public Contrat(int idContrat, String canal, String condition, int idAdresse, int idAbonne) {
		this.idContrat = idContrat;
		this.canal = canal;
		this.condition = condition;
		this.idAdresse = idAdresse;
		this.idAbonne = idAbonne;
	}
	
	
	
	
	

}

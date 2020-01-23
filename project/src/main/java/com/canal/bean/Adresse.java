package com.canal.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Adresse {
	private int idAdresse;
	private boolean active;
	private String pays;
	private String rue;
	private String codePostal;
	private String ville;
	private int idAbonne;
	
	public Adresse() {
		
	}

	public Adresse(int id, boolean active, String pays, String rue, String codePostal, String ville, int idAbonne) {
		super();
		this.idAdresse = id;
		this.active = active;
		this.pays = pays;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.idAbonne = idAbonne;
	}
	
	
	
	


	
	
}

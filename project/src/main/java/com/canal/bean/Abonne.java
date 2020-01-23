package com.canal.bean;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Abonne implements Serializable {

	private int idAbonne;
	private String nom;
	private String prenom;
	
	public Abonne() {

	}

	public Abonne(int id, String nom, String prenom) {
		this.idAbonne = id;
		this.nom = nom;
		this.prenom = prenom;
	}
}

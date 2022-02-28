package com.company.oo;

public class Diplome {

    private String etablissement;
    private String nom;
    private TypeDiplome type;

    public Diplome(){}

    Diplome(String etablissement, String nom, TypeDiplome type){
        this.etablissement = etablissement;
        this.nom = nom;
        this.type = type;
    }

	public String getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public TypeDiplome getType() {
		return type;
	}

	public void setType(TypeDiplome type) {
		this.type = type;
	}
    
    

}

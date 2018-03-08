package com.agreotech.domaine;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 17/12/2017
 * @version 1.0
 * 
 * Cette classe dénommée "Produit" permettra
 * L'enregistrement et l'affichage du produit agricole utilisé
 * sur la parcelle agricole de l'utilsateur
 *
 */
public class Produit {
	
	/**
	 * Déclaration des propriétés
	 * "designation", "activite", "observation"
	 * tous de types String
	 */
	private int id;
	private String designation;
	private int prix;
	
	
	/**
	 * Déclaration du constructeur avec 2 paramètres
	 * @param designation
	 * @param prix
	 */
	public Produit() {
		super();
	}
	
	public Produit(String designation, int prix) {
		
		super();
		this.designation = designation;
		this.prix = prix;
		
		System.out.println(" (******** Votre produit a été enregistré avec succès *********) ");
	}
	
	public Produit(int id, String designation, int prix) {
		
		super();
		this.id = id;
		this.designation = designation;
		this.prix = prix;
		
		System.out.println(" (******** Votre produit a été enregistré avec succès *********) ");
	}


	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Déclaration de l'accesseur
	 * @return String
	 */
	public String getDesignation() {
		return designation;
	}


	/**
	 * Déclaration du mutateur
	 * @param designation
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}


	/**
	 * Déclaration de l'accesseur
	 * @return int
	 */
	public int getPrix() {
		return prix;
	}


	/**
	 * Déclaration du mutateur
	 * @param prix
	 */
	public void setPrix(int prix) {
		this.prix = prix;
	}


	@Override
	public String toString() {
		return "Produit [designation=" + designation + ", prix=" + prix + "]";
	}



}

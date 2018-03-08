package com.agreotech.domaine;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 17/12/2017
 * @version 1.0
 * 
 * Cette classe d�nomm�e "Produit" permettra
 * L'enregistrement et l'affichage du produit agricole utilis�
 * sur la parcelle agricole de l'utilsateur
 *
 */
public class Produit {
	
	/**
	 * D�claration des propri�t�s
	 * "designation", "activite", "observation"
	 * tous de types String
	 */
	private int id;
	private String designation;
	private int prix;
	
	
	/**
	 * D�claration du constructeur avec 2 param�tres
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
		
		System.out.println(" (******** Votre produit a �t� enregistr� avec succ�s *********) ");
	}
	
	public Produit(int id, String designation, int prix) {
		
		super();
		this.id = id;
		this.designation = designation;
		this.prix = prix;
		
		System.out.println(" (******** Votre produit a �t� enregistr� avec succ�s *********) ");
	}


	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * D�claration de l'accesseur
	 * @return String
	 */
	public String getDesignation() {
		return designation;
	}


	/**
	 * D�claration du mutateur
	 * @param designation
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}


	/**
	 * D�claration de l'accesseur
	 * @return int
	 */
	public int getPrix() {
		return prix;
	}


	/**
	 * D�claration du mutateur
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

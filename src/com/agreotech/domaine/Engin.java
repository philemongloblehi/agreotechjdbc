package com.agreotech.domaine;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 08/03/2018
 * @version 1.1
 * 
 * Cette classe dénommée "Engin" permettra
 * L'enregistrement et l'affichage d'un engin mécanique
 * utilisé sur la parcelle agricole de l'utilsateur
 *
 */
public class Engin {
	
	/**
	 * Déclaration des propriétés
	 */	
	private int id;
	private String designation;
	private String etat;
	private int consoEssenceJour;
	private int prixEssence;
	private int coutTotalEssence;
	

	/**
	 * Déclaration du constructeur avec 3 paramètres
	 * @param designation
	 * @param etat
	 * @param consoEssanceJour
	 */	
	public Engin() {
		super();
		System.out.println(" (******* VOTRE ENGIN a été enregistré avec succès ************) ");
	}
	
	public Engin(String designation, String etat, int consoEssanceJour, int prixEssence, int coutTotalEssence) {
		
		super();
		this.designation = designation;
		this.etat = etat;
		this.consoEssenceJour = consoEssanceJour;
		this.prixEssence = prixEssence;
		this.coutTotalEssence = coutTotalEssence;
		
		System.out.println(" (******* VOTRE ENGIN a été enregistré avec succès ************) ");
	}

	public Engin(int id,String designation, String etat, int consoEssanceJour, int prixEssence, int coutTotalEssence) {
		
		super();
		this.id = id;
		this.designation = designation;
		this.etat = etat;
		this.consoEssenceJour = consoEssanceJour;
		this.prixEssence = prixEssence;
		this.coutTotalEssence = coutTotalEssence;
		
		System.out.println(" (******* VOTRE ENGIN a été enregistré avec succès ************) ");
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
	 * @return String
	 */
	public String getEtat() {
		return etat;
	}

	/**
	 * Déclaration du mutateur
	 * @param etat
	 */
	public void setEtat(String etat) {
		this.etat = etat;
	}

	/**
	* Déclaration de l'accesseur
	 * @return int
	 */
	public int getConsoEssenceJour() {
		return consoEssenceJour;
	}

	/**
	 * Déclaration du mutateur
	 * @param consoEssenceJour
	 */
	public void setConsoEssenceJour(int consoEssenceJour) {
		this.consoEssenceJour = consoEssenceJour;
	}
	
	public int getPrixEssence() {
		return prixEssence;
	}
	
	public void setPrixEssence(int prixEssence) {
		this.prixEssence = prixEssence;
	}
	
	public int getCoutTotalEssence() {
		return coutTotalEssence;
	}
	
	public void setCoutTotalEssence(int coutTotalEssence) {
		this.coutTotalEssence = coutTotalEssence;
	}
	
	@Override
	public String toString() {
		return "Engin [designation=" + designation + ", etat=" + etat + ", consoEssenceJour=" + consoEssenceJour
				+ ", prixEssence=" + prixEssence+ ", coutTotalEssence=" + coutTotalEssence + "]";
	}


}

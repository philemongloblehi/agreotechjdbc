package com.agreotech.domaine;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 08/03/2018
 * @version 1.1
 * 
 * Cette classe d�nomm�e "Engin" permettra
 * L'enregistrement et l'affichage d'un engin m�canique
 * utilis� sur la parcelle agricole de l'utilsateur
 *
 */
public class Engin {
	
	/**
	 * D�claration des propri�t�s
	 */	
	private int id;
	private String designation;
	private String etat;
	private int consoEssenceJour;
	private int prixEssence;
	private int coutTotalEssence;
	

	/**
	 * D�claration du constructeur avec 3 param�tres
	 * @param designation
	 * @param etat
	 * @param consoEssanceJour
	 */	
	public Engin() {
		super();
		System.out.println(" (******* VOTRE ENGIN a �t� enregistr� avec succ�s ************) ");
	}
	
	public Engin(String designation, String etat, int consoEssanceJour, int prixEssence, int coutTotalEssence) {
		
		super();
		this.designation = designation;
		this.etat = etat;
		this.consoEssenceJour = consoEssanceJour;
		this.prixEssence = prixEssence;
		this.coutTotalEssence = coutTotalEssence;
		
		System.out.println(" (******* VOTRE ENGIN a �t� enregistr� avec succ�s ************) ");
	}

	public Engin(int id,String designation, String etat, int consoEssanceJour, int prixEssence, int coutTotalEssence) {
		
		super();
		this.id = id;
		this.designation = designation;
		this.etat = etat;
		this.consoEssenceJour = consoEssanceJour;
		this.prixEssence = prixEssence;
		this.coutTotalEssence = coutTotalEssence;
		
		System.out.println(" (******* VOTRE ENGIN a �t� enregistr� avec succ�s ************) ");
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
	 * @return String
	 */
	public String getEtat() {
		return etat;
	}

	/**
	 * D�claration du mutateur
	 * @param etat
	 */
	public void setEtat(String etat) {
		this.etat = etat;
	}

	/**
	* D�claration de l'accesseur
	 * @return int
	 */
	public int getConsoEssenceJour() {
		return consoEssenceJour;
	}

	/**
	 * D�claration du mutateur
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

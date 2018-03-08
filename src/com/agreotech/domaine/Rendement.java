package com.agreotech.domaine;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 08/03/2018
 * @version 1.1
 * 
 * Cette classe d�nomm�e "Rendement" permettra
 * L'enregistrement et l'affichage du rendement
 * de l'utilsateur sur la parcelle agricole
 *
 */
public class Rendement {
	
	/**
	 * D�claration des propri�t�s
	 */	
	private int id;
	private String designation;
	private String annee;
	private double totalRecolte;

	
	/**
	 * D�claration du constructeur avec 3 param�tres
	 * @param designation
	 * @param annee
	 * @param totalRecolte
	 */
	public Rendement() {
		super();
	}
	
	public Rendement(String designation, String annee, double totalRecolte) {
		
		super();
		this.designation = designation;
		this.annee = annee;
		this.totalRecolte = totalRecolte;
		
		System.out.println(" (******** Votre rendement a �t� enregistr� avec succ�s *********) ");
	}
	
	public Rendement(int id, String designation, String annee, double totalRecolte) {
		
		super();
		this.id = id;
		this.designation = designation;
		this.annee = annee;
		this.totalRecolte = totalRecolte;
		
		System.out.println(" (******** Votre rendement a �t� enregistr� avec succ�s *********) ");
	}

	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getAnnee() {
		return annee;
	}


	public void setAnnee(String annee) {
		this.annee = annee;
	}


	public double getTotalRecolte() {
		return totalRecolte;
	}


	public void setTotalRecolte(double totalRecolte) {
		this.totalRecolte = totalRecolte;
	}


	@Override
	public String toString() {
		return "Rendement [designation=" + designation + ", annee=" + annee + ", totalRecolte=" + totalRecolte + "]";
	}



}

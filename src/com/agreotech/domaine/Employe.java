package com.agreotech.domaine;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 08/03/2018
 * @version 1.1
 * 
 * Cette classe dénommée "Employe" permettra
 * L'enregistrement et l'affichage de l'employe
 * de la parcelle agricole ou ferme de l'utilsateur
 *
 */
public class Employe {
	
	/**
	 * Déclaration des propriétés
	 */
	private int id;
	private String matricule;
	private String nom;
	private String prenom;
	private int horaireDeTravail;
	private int tarifHoraire;
	private String fonction;
	private double salaire;

	
	/**
	 * Déclaration du constructeur
	 * @param id
	 * @param matricule
	 * @param nom
	 * @param prenom
	 * @param horaireDeTravail
	 * @param tarifHoraire
	 * @param fonction
	 * @param salaire
	 */
	public Employe() {
		super();
	}
	
	public Employe(String matricule, String nom, String prenom, int horaireDeTravail, int tarifHoraire, String fonction, double salaire ) {
		
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.horaireDeTravail = horaireDeTravail;
		this.tarifHoraire = tarifHoraire;
		this.fonction = fonction;
		this.salaire = salaire;
		
		System.out.println(" (******* Votre employé a été enregistré avec succès ************) ");
		
		
	}
	
public Employe(int id, String matricule, String nom, String prenom, int horaireDeTravail, int tarifHoraire, String fonction, double salaire ) {
		
		super();
		this.id = id;
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.horaireDeTravail = horaireDeTravail;
		this.tarifHoraire = tarifHoraire;
		this.fonction = fonction;
		this.salaire = salaire;
		
		System.out.println(" (******* Votre employé a été enregistré avec succès ************) ");
		
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMatricule() {
		return matricule;
	}


	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public int getHoraireDeTravail() {
		return horaireDeTravail;
	}


	public void setHoraireDeTravail(int horaireDeTravail) {
		this.horaireDeTravail = horaireDeTravail;
	}


	public int getTarifHoraire() {
		return tarifHoraire;
	}


	public void setTarifHoraire(int tarifHoraire) {
		this.tarifHoraire = tarifHoraire;
	}


	public String getFonction() {
		return fonction;
	}


	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	
	public double getSalaire() {
		return salaire;
	}
	
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	


	@Override
	public String toString() {
		return "Employe [id=" + id + ", matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom
				+ ", horaireDeTravail=" + horaireDeTravail + ", tarifHoraire=" + tarifHoraire + ", fonction=" + fonction
				+ ", salaire=" + salaire + "]";
	}

	public void afficher() {
		
		System.out.println("Matricule " + getMatricule() + "\nNom " + getNom() + "\nPrenom " + getPrenom() + "\nFonction " + getFonction() + "\nTarif horaire " + getTarifHoraire() + "\nhoraire de travail " + getHoraireDeTravail() +  "\nsalaire " + getSalaire() + "\n\n");

		
	}
	
	
	public void calculerSalaire(int horaireTravail, int tarifHoraire) {
		
		System.out.println("Son salaire est de " +  horaireTravail * tarifHoraire + " XOF");
	}
	
	

}

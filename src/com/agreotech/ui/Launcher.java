package com.agreotech.ui;

import java.util.Scanner;

import com.agreotech.domaine.Employe;
import com.agreotech.domaine.Engin;
import com.agreotech.domaine.Parcelle;
import com.agreotech.domaine.Produit;
import com.agreotech.domaine.Rendement;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 08/03/2018
 * @version 1.1
 * 
 * APPLICATION DE GESTION DE PARCELLE AGRICOLE
 * 
 * Cette application permettra:
 * 		1- l'enregistrement de l'activité pratiquée et les observations sur la parcelle
 * 		2- la saisie, l'enregistrement des controleurs et manoeuvres ainsi que le calcul salarial
 * 		3- la saisie, l'enregistrement des produits utilisés sur la parcelle
 * 		4- la saisie, l'enregistrement des engins mécanique utilsés et le calcul de leur consommation d'essence ainsi que le cout total annuel
 * 		5- la saisie, l'enregistrement des rendements par année de production
 *
 */
public class Launcher {

	public static void main(String[] args) {
		
		
		/**
		 * Déclaration et instanciation de l'objet sc
		 * de la classe Scanner
		 */
		Scanner sc = new Scanner(System.in);
		
		/**
		 * Déclaration de mes propriétés de boucles et itérations
		 */
		int choixRubrique = 0;
		int choixSousRubrique = 0;
		char continuer;
		char reprendreRubrique;
		int choixFonctionEmploye;
		
		/**
		 * Déclaration des propriétés globales
		 */
		String designation;
		String activite;
		String observation;
		int prix;
		String matricule;
		String nom;
		String prenom;
		int horaireDeTravail = 0;
		int tarifHoraire = 0;
		String etat;
		int consoEssenceJour;
		String annee;
		double totalRecolte;
		double salaire;
		
		/**
		 * Déclaration des Collections
		 */
		List<Parcelle> listeParcelle = new LinkedList<>();
		List<Produit> listeProduit = new LinkedList<>();
		List<Employe> listeEmploye = new LinkedList<>();
		List<Employe> listeControleur = new LinkedList<>();
		List<Employe> listeManoeuvre = new LinkedList<>();
		List<Engin> listeEngin = new LinkedList<>();
		List<Rendement> listeRendement = new LinkedList<>();
		
		
		

		
		System.out.println("          *************************************");
		System.out.println("          *                                   *");
		System.out.println("          *          AGREO-TECH               *");
		System.out.println("          *                                   *");
		System.out.println("          * L'application de gestion agricole *");
		System.out.println("          *                                   *");
		System.out.println("          *                                   *");
		System.out.println("          *************************************\n\n");
		
		
		/**
		 * Boucle permettant de demander a l'utilisateur s'il compte rester dans l'application
		 * et revenir au menu principal pour une autre opération ou quitter celui ci
		 */		
		do {			

		
		System.out.println("                <---------| MENU |----------->\n");
		System.out.println("                       1- Parcelle");
		System.out.println("                       2- Produit");
		System.out.println("                       3- Employé");
		System.out.println("                       4- Engin");
		System.out.println("                       5- Rendement\n");

		

		
		/**
		 * Boucle permettant l'affichage des rubriques(menu) de l'application a l'utilisateur
		 * et la vérification de sa saisie concernant le menu des rubriques
		 */
		do {
			
			System.out.println("Veuillez sélectionner votre rubrique svp ?");
			choixRubrique = sc.nextInt();
			sc.nextLine();
			
			if (choixRubrique != 1 && choixRubrique != 2 && choixRubrique != 3 && choixRubrique != 4 && choixRubrique != 5){
				
				System.out.println("Oups, désolé...! Veuillez saisir un chiffre parmi les rubriques proposés.\nMerci de bien vouloir recommencer");
			}
			
		} while (choixRubrique != 1 && choixRubrique != 2 && choixRubrique != 3 && choixRubrique != 4 && choixRubrique != 5);		
		
		
		/**
		 * Condition permettant l'accès a la rubrique sélectionné
		 * et afficher les traitements qui y sont a l'utilisateur
		 */
		switch (choixRubrique) {
		case 1:
			
			/**
			 * Boucle permattant de réafficher la rubrique Parcelle à l'utlisateur
			 * si reponse est oui
			 */
			do {
				
				/**
				 * Boucle permattant de verifier la sélection de l'utilisateur
				 * concernant le menu des sous rubriques de l'application
				 */
				do {
					
					System.out.println("\n         **** Bienvenue dans la rubrique destinée à la gestion des parcelles agricole ****\n");
									
					System.out.println("                (*******| MENU GESTION PARCELLE |********\n)");
					System.out.println("                       1- Enregistrer");
					System.out.println("                       2- Afficher");
					
					System.out.println("Entrer votre sous rubrique ");
					choixSousRubrique = sc.nextInt();
					sc.nextLine();
					
				} while (choixSousRubrique != 1 && choixSousRubrique != 2);
						
				
				
				/**
				 * Condition permettant de saisir la parcelle si choix = 1
				 * et d'afficher la parcelle si choix = 2
				 */
				if (choixSousRubrique == 1) {
					
						
						System.out.println("Entrer la désignation de la parcelle");
						designation = sc.nextLine();
						
						System.out.println("Entrer l'activité exercée");
						activite = sc.nextLine();
						
						System.out.println("Entrer une observation");
						observation = sc.nextLine();
						
						Parcelle maParcelle = new Parcelle(designation, activite, observation);
						listeParcelle.add(maParcelle);
					
					
				}  if(choixSousRubrique == 2) {
					
					System.out.println(" (********| AFFICHAGE DE MES PARCELLES |*********\n) ");
					for (Parcelle maParcelle : listeParcelle) {
			            
						maParcelle.afficher();
						System.out.println("--------");
			            
			        }

				}
				
				System.out.println("Voulez vous réenregistrer ou afficher vos parcelle ? (O/N)");
				reprendreRubrique = sc.nextLine().charAt(0);
				
			} while (reprendreRubrique == 'O');
			
			
			break;
			
		case 2:
			
			/**
			 * Boucle permattant de réafficher la rubrique Produit à l'utlisateur
			 * si reponse est oui
			 */
			do {
				
				/**
				 * Boucle permattant de verifier la sélection de l'utilisateur
				 * concernant le menu des sous rubriques de l'application
				 */
				do {
					
					System.out.println("\n         **** Bienvenue dans la rubrique destinée à la gestion des produits agricole ****\n");
									
					System.out.println("                (*******| MENU GESTION PRODUITS |********)\n");
					System.out.println("                       1- Enregistrer");
					System.out.println("                       2- Afficher");
					
					System.out.println("Entrer votre sous rubrique ");
					choixSousRubrique = sc.nextInt();
					sc.nextLine();
					
				} while (choixSousRubrique != 1 && choixSousRubrique != 2);
						
				
				
				/**
				 * Condition permettant de saisir le produit si choix = 1
				 * et d'afficher le produit si choix = 2
				 */
				if (choixSousRubrique == 1) {
					
						
						System.out.println("Entrer la désignation du produit");
						designation = sc.nextLine();
						
						System.out.println("Entrer son prix");
						
						while (! sc.hasNextInt()) {
							
							System.out.println("Le prix n'est pas valide, réessayer svp");
							sc.next();
							
						}
						
						prix = sc.nextInt();
						sc.nextLine();
						
						
						Produit monProduit = new Produit(designation, prix);
						listeProduit.add(monProduit);
					
					
				}  if(choixSousRubrique == 2) {
					
					System.out.println(" (********| AFFICHAGE DE MES PRODUITS |*********) \n");
					for (Produit monProduit : listeProduit) {
			            
						monProduit.afficher();
						System.out.println("--------");
			            
			        }

				}
				
				System.out.println("Voulez vous réenregistrer ou afficher vos produits ? (O/N)");
				reprendreRubrique = sc.nextLine().charAt(0);
				
			} while (reprendreRubrique == 'O');
			

			
			break;

		case 3:
			
			/**
			 * Boucle permattant de réafficher la rubrique employé à l'utlisateur
			 * si reponse est oui
			 */
			do {
				
				/**
				 * Boucle permattant de verifier la sélection de l'utilisateur
				 * concernant le menu des sous rubriques de l'application
				 */
				do {
					
					System.out.println("\n         **** Bienvenue dans la rubrique destinée à la gestion des employés agricole ****\n");
									
					System.out.println("                (*******| MENU GESTION EMPLOYE |********)\n");
					System.out.println("                       1- Enregistrer");
					System.out.println("                       2- Afficher");
					
					System.out.println("Entrer votre sous rubrique ");
					choixSousRubrique = sc.nextInt();
					sc.nextLine();
					
				} while (choixSousRubrique != 1 && choixSousRubrique != 2);
						
				/**
				 * Condition permettant de saisir un controleur si choix = 1
				 * et de saisir un manoeuvre si choix = 2
				 */
				if (choixSousRubrique == 1) {
					
					/**
					 * Boucle permattant de verifier la sélection de l'utilisateur
					 * concernant le choix de la fonction de l'employé de l'application
					 */
					do {
						
						System.out.println("                (*******| MENU FONCTION |********)\n");
						System.out.println("                       1- Controleur");
						System.out.println("                       2- Manoeuvre");
						
						System.out.println("Entrer votre choix");
						choixFonctionEmploye = sc.nextInt();
						sc.nextLine();
						
					} while (choixFonctionEmploye != 1 && choixFonctionEmploye != 2);
					
					
					/**
					 * Condition permettant de traiter l'enregistrement des informations
					 * pour le controleur si choix = 1 ou manoeuvre si choix = 2
					 */
					switch (choixFonctionEmploye) {
					case 1:
						
						System.out.println("Entrer le matricule du controleur");
						matricule = sc.nextLine();
						
						System.out.println("Entrer son nom");
						nom = sc.nextLine();
							
						System.out.println("Entrer son prénom");
						prenom = sc.nextLine();
							
						System.out.println("Entrer son horaire de travail (exemple: tapez 2 pour 2h)");
						
						while (! sc.hasNextInt()) {
							
							System.out.println("L'horaire saisi n'est pas valide réessayer svp)");
							sc.next();
							
						}
						
						 horaireDeTravail = sc.nextInt();
						 sc.nextLine();
						 
						 System.out.println("Entrer son tarif horaire");
						 
						 while (! sc.hasNextInt()) {
							 
							 System.out.println("le tarif saisi n'est pas valide réessayer svp");
							 sc.next();
							
						}
						 
						 tarifHoraire = sc.nextInt();
						 sc.nextLine();
						 
						 salaire = horaireDeTravail * tarifHoraire;
						 
							
						Employe monControleur = new Employe(matricule, nom, prenom, horaireDeTravail, tarifHoraire, "Controleur", salaire);
						listeEmploye.add(monControleur);
						listeControleur.add(monControleur);

						
						break;

					case 2:
						
						System.out.println("Entrer le matricule du manoeuvre");
						matricule = sc.nextLine();
						
						System.out.println("Entrer son nom");
						nom = sc.nextLine();
							
						System.out.println("Entrer son prénom");
						prenom = sc.nextLine();
							
						System.out.println("Entrer son horaire de travail (exemple: tapez 2 pour 2h)");
						
						while (! sc.hasNextInt()) {
							
							System.out.println("L'horaire saisi n'est pas valide réessayer svp)");
							sc.next();
							
						}
						
						 horaireDeTravail = sc.nextInt();
						 sc.nextLine();
						 
						 System.out.println("Entrer son tarif horaire");
						 
						 while (! sc.hasNextInt()) {
							 
							 System.out.println("Le tarif saisi n'est pas valide réessayer svp");
							 sc.next();
							
						}
						 
						 tarifHoraire = sc.nextInt();
						 sc.nextLine();
						 
						 salaire = horaireDeTravail * tarifHoraire;
							
						Employe monManoeuvre = new Employe(matricule, nom, prenom, horaireDeTravail, tarifHoraire, "Manoeuvre", salaire);
						listeEmploye.add(monManoeuvre);
						listeManoeuvre.add(monManoeuvre);

						
						break;
					}
					
					
					
				}else if(choixSousRubrique == 2) {
					
					/**
					 * Boucle permattant d'afficher la sélection de l'utilisateur
					 * concernant le choix de la fonction de l'employé de l'application
					 */
					do {
						
						System.out.println("                (*******| MENU FONCTION |********)\n");
						System.out.println("                       1- Controleur");
						System.out.println("                       2- Manoeuvre");
						System.out.println("                       3- Tous les employés");
						
						System.out.println("Entrer votre choix");
						choixFonctionEmploye = sc.nextInt();
						sc.nextLine();
						
					} while (choixFonctionEmploye != 1 && choixFonctionEmploye != 2 && choixFonctionEmploye != 3);
					
					/**
					 * Condition permettant d'afficher les informations
					 * pour le controleur si choix = 1 ou manoeuvre si choix = 2
					 * et tous les employés si choix = 3
					 */
					switch (choixFonctionEmploye) {
					case 1:
						
						System.out.println(" (********| AFFICHAGE DE MES CONTROLEURS |*********\n) ");
						for (Employe controleur : listeControleur) {
				            controleur.afficher();
				            controleur.calculerSalaire(horaireDeTravail, tarifHoraire);
				            System.out.println("--------");

				        }					
						break;

					case 2:
						
						System.out.println(" (********| AFFICHAGE DE MES MANOEUVRES |*********\n) ");
						for (Employe manoeuvre : listeManoeuvre) {
				            manoeuvre.afficher();
				            manoeuvre.calculerSalaire(horaireDeTravail, tarifHoraire);
				            System.out.println("--------");

				        }	
						
						break;

					case 3:
						
						System.out.println(" (********| AFFICHAGE DE TOUS MES EMPLOYES |*********\n) ");
						for (Employe employe : listeEmploye) {
				            employe.afficher();
				            employe.calculerSalaire(horaireDeTravail, tarifHoraire);
				            System.out.println("--------");

				        }	
						
						break;

					}					
					

				}
				
				System.out.println("Voulez vous réenregistrer ou afficher vos employés ? (O/N)");
				reprendreRubrique = sc.nextLine().charAt(0);
				
			} while (reprendreRubrique == 'O');	
			

			
			break;

		case 4:
			
			/**
			 * Boucle permattant de réafficher la rubrique engin à l'utlisateur
			 * si reponse est oui
			 */
			do {
				
				/**
				 * Boucle permattant de verifier la sélection de l'utilisateur
				 * concernant le menu des sous rubriques de l'application
				 */
				do {
					
					System.out.println("\n         **** Bienvenue dans la rubrique destinée à la gestion des engins agricole ****\n");
									
					System.out.println("                (*******| MENU GESTION ENGIN |********)\n");
					System.out.println("                       1- Enregistrer");
					System.out.println("                       2- Afficher");
					
					System.out.println("Entrer votre sous rubrique ");
					choixSousRubrique = sc.nextInt();
					sc.nextLine();
					
				} while (choixSousRubrique != 1 && choixSousRubrique != 2);
						
				
				
				/**
				 * Condition permettant de saisir l'engin si choix = 1
				 * et d'afficher l'engin si choix = 2
				 */
				if (choixSousRubrique == 1) {
					
						
						System.out.println("Entrer la désignation de l'engin");
						designation = sc.nextLine();
						
						System.out.println("Entrer son état (Neuf/Ancien/En panne/Marche)");
						etat = sc.nextLine();
						
						System.out.println("Entrer sa consommation d'essence par jour (exemple 20 pour 20 Litres)");
						
						while (! sc.hasNextInt()) {
							
							System.out.println("La consommation saisie n'est pas valide réessayer svp");
							sc.next();
							
						}
						
						consoEssenceJour = sc.nextInt();
						sc.nextLine();
						
						Engin monEngin = new Engin(designation, etat, consoEssenceJour);
						listeEngin.add(monEngin);
					
					
				}  if(choixSousRubrique == 2) {
					
					System.out.println(" (******** AFFICHAGE DE MON ENGIN *********)\n ");
					for (Engin monEngin : listeEngin) {
			            
						monEngin.afficher();
						System.out.println("--------");
			            
			        }

				}
				
				System.out.println("Voulez vous réenregistrer ou afficher vos engins ? (O/N)");
				reprendreRubrique = sc.nextLine().charAt(0);
				
			} while (reprendreRubrique == 'O');
			

			
			break;
			
		case 5:
			
			/**
			 * Boucle permattant de réafficher la rubrique rendement des années à l'utlisateur
			 * si reponse est oui
			 */
			do {
				
				/**
				 * Boucle permattant de verifier la sélection de l'utilisateur
				 * concernant le menu des sous rubriques de l'application
				 */
				do {
					
					System.out.println("\n         **** Bienvenue dans la rubrique destinée à la gestion des rendements agricole ****\n");
									
					System.out.println("                (*******| MENU GESTION RENDEMENT |********)\n");
					System.out.println("                       1- Enregistrer");
					System.out.println("                       2- Afficher");
					
					System.out.println("Entrer votre sous rubrique ");
					choixSousRubrique = sc.nextInt();
					sc.nextLine();
					
				} while (choixSousRubrique != 1 && choixSousRubrique != 2);
						
				
				
				/**
				 * Condition permettant de saisir le rendement si choix = 1
				 * et d'afficher le rendement si choix = 2
				 */
				if (choixSousRubrique == 1) {
					
						
						System.out.println("Entrer la désignation du rendement");
						designation = sc.nextLine();
						
						System.out.println("Entrer l'année)");
						annee = sc.nextLine();
						
						System.out.println("Entrer le total de la production en tonne");
						
						while (! sc.hasNextDouble()) {
							
							System.out.println("La production saisie n'est pas un nombre valide réessayer svp");
							sc.next();
							
						}
						
						totalRecolte = sc.nextDouble();
						sc.nextLine();
						
						Rendement monRendement = new Rendement(designation, annee, totalRecolte);
						listeRendement.add(monRendement);
					
					
				}  if(choixSousRubrique == 2) {
					
					System.out.println(" (******** AFFICHAGE DE MON RENDEMENT *********)\n ");
					for (Rendement monRendement : listeRendement) {
			            
						monRendement.afficher();
						System.out.println("--------");
			            
			        }

				}
				
				System.out.println("Voulez vous réenregistrer ou afficher vos rendements ? (O/N)");
				reprendreRubrique = sc.nextLine().charAt(0);
				
			} while (reprendreRubrique == 'O');
			


			
			break;


		}
		
		do {
			
			System.out.println("\n\nVoulez vous revenir au menu principal ou quitter le programme ? (O/N)");
			continuer = sc.nextLine().charAt(0);
			
		} while (continuer != 'O' && continuer != 'N');
		
	} while (continuer == 'O');
		
		
		/**
		 * Fin de l'utilisation de l'application
		 * Message de fin...
		 */
		System.out.println("Au revoir et merci d'avoir utiliser notre application\n");
		System.out.println("*************************************");
		System.out.println("*                                   *");
		System.out.println("*          AGREO-TECH               *");
		System.out.println("*                                   *");
		System.out.println("*     L'innovation du futur         *");
		System.out.println("*                                   *");
		System.out.println("*                                   *");
		System.out.println("*************************************");		
		
		
		
		sc.close();


	}

}

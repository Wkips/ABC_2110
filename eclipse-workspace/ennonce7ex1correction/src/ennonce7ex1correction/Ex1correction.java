package ennonce7ex1correction;

import java.util.Scanner;

public class Ex1correction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaration des variable
		
		String compris;
		String clair;
		
		// SAISIE 
		
		
		//affichage 1ere action
		//ecrire "lecture attentive
		System.out.println("lire attentivement");
		
		//ecrire "avez vous compris ? oui/non"
		
		System.out.println("avez vous compris ? oui /non");
		//creation du scanner
		
		Scanner sc = new Scanner (System.in);
		
		//lire compris
		compris = sc.next();
		
		//traitement
		
		//si compris egal non
		
		if (compris.equals("non")) {
		//alors	
		System.out.println("relecture");
		System.out.println("Est-ce clair?");
		clair = sc.next();
		//Fin si
		
		//si clair egal non
		if (clair.equals("non")) {
		//alors
		System.out.println("renseignment complemantaire");
		//fin si
		
		
		}}
		System.out.println("commencer le travail" + " " + "pseudo code" + " " + "Verifier" + " " + "Ecrire programme" + " " + "Jeu essaie" + " " +  "test");
	}
	
	

	}



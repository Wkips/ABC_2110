package d7ex2;

import java.util.Scanner;

public class d7ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//declaration des variable
		
		String compris;
		String clair;
		
		// SAISIE 
		
		System.out.println("lire attentivement");
		System.out.println("avez vous compris ?");
		Scanner sc = new Scanner (System.in);
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
	



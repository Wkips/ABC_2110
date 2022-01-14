package jaloncoiffeur;

import java.util.Scanner;

public class jaloncoiffeur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaration des variables		
		String etudiant;
		String mercredi;
		String jeudi;

		System.out.println("Etes vous etudiants   oui / non ");
		Scanner sc = new Scanner (System.in);
		etudiant = sc.next();

		if  (etudiant.equals("oui")) {

			System.out.println("sommes nous mercredi  oui / non ");
			mercredi = sc.next();

			if (mercredi.equals("oui")){
				System.out.println("Vouas avez 50%");
			}
			else if (mercredi.equals("non")){
				System.out.println("vous avez pas reduction");}




			System.out.println("sommes nous jeudi  oui / non ");
			jeudi = sc.next(); 
			if (jeudi.equals("oui"))

				System.out.println("vous avez  20%");

			else if (jeudi.equals("non")){
				System.out.println("vous avez pas reduction");}

		}

	

	System.out.println("sortez la CB");
}
}



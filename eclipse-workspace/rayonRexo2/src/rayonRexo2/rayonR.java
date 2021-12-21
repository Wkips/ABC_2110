package rayonRexo2;

import java.util.Scanner;

public class rayonR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//declaration des variables

		//reel : rayon: "r"
		float rayon;
		//reel : aire;
		double aire;
		//reel volume
		double volume;
		
		
		// SAISIE
		
		//ecrire: "entrer r svp"
		System.out.println("entrez svp le rayon r:");
		//lire r
		Scanner sc = new Scanner(System.in);
		rayon=sc.nextFloat();
		
		
		
		//TRAITEMENT
		
		aire = 4*Math.PI*Math.pow(rayon, 2);//cast
		volume = 4d/3*Math.PI*Math.pow(rayon, 3);
		
		
		//AFFICHAGE
		System.out.println("la valeur de l'aire est: "+aire);
		System.out.println("la valeur du volume est :"+volume);
	}		

}

package banqueexo4;

import java.util.Scanner;

public class banqueexo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARATION DES VARIABLES
		float sommeInit;
		float interet;
		float nbrAnnee;
		double valeuracquisesimple;
		double valeuracquisecompose;

		//SAISIE
		//ecrire somme initial 
		System.out.println("Donnez moi svp la somme initial");
		//lire somme initial
		Scanner sc = new Scanner(System.in);
		sommeInit=sc.nextFloat();
		//System.out.println("vous avez saisie : somme initiale"+sommeInit);
		//ecrire interet 
		System.out.println("Donnez moi svp les interet");
		//lire interet 
		interet = sc.nextFloat();
		//System.out.println("Vous avez saisie les interets :"+interet);
		//ecrire nombre annee 
		System.out.println("Donnez moi svp le nombre d'annee");
		//lire nombre d annee 
		nbrAnnee = sc.nextFloat();
		//System.out.println("vous avez saisie le nombre d annee  :"+nbrAnnee);


		//TRAITEMENT

		valeuracquisesimple = (sommeInit*(1+nbrAnnee*interet));

		valeuracquisecompose = sommeInit*Math.pow((1+interet),nbrAnnee);

		System.out.println("la valeur acquise simple est "+valeuracquisesimple);
		System.out.println("la valeur acquise compose est "+valeuracquisecompose);

	}
}

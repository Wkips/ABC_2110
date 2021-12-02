import java.util.Scanner;

public class AireSecteurCirculaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration des variables
		//reel rayon
		double rayon;
		//reel angle
		double angle;
		//resultat airesecteurcirculaire
		double secteurcirculaire;

		//SAISIE
		//ecrire entrez rayon

		System.out.println("Donnez moi le rayon SVP:");

		//lire rayon
		Scanner sc = new Scanner(System.in);
		rayon=sc.nextFloat();
		System.out.println("Vous avez saisie rayon = "+rayon);

		//ecrire entrez angle

		System.out.println("Donnez moi l'angle SVP:");

		//lire angle
		angle = sc.nextDouble() ;
		System.out.println("Vous avez saisie angle = "+angle);

		//TRAITEMENT
		secteurcirculaire = (Math.PI*Math.pow(rayon, 2)*(angle/360));

		//AFFICHAGE
		System.out.println("l'aire du secteur circulaire est :"+secteurcirculaire);
	}

}

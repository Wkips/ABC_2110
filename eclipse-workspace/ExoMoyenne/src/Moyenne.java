import java.util.Scanner;

public class Moyenne {
	public static void main(String[] args) {
		// declarations des variables
		// reel nombre1
		float nombre1;
		// reel nombre 2
		float nombre2;
		
		//reel moyenne
		float moyenne;
		
		//SAISIE
		//ecrire "donnez moi svp le premier nombre"
		System.out.println("Donnez moi svp le premir nombre:");
		//lire "nombre 1 "
		Scanner sc = new Scanner(System.in);
		nombre1=sc.nextFloat();
		System.out.println("Vous avez saisie nombre 1 = "+nombre1);
		
		//ecrire "donnez moi svp nombre2" 
		System.out.println("Donnez moi svp le deuxieme nombre:");
		//lire "nombre 2"
		
		nombre2 = sc.nextFloat();
		System.out.println("Vous avez saisie nombre 2 = "+nombre2);
		
		//traitement
		
		moyenne =(nombre1+nombre2)/2;
		
		//affichage
		
		//ecrire "la valeur de la moyenne est : ",moyenne
		System.out.println("La valeur de la moyenne est : "+moyenne);
		
		
	} 
	

}

import java.util.Scanner;

public class moyenneif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Declaration des variables 
		
		float nombre1;
		float nombre2;
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
		
		//Si (moyenne >=10) Alors
		if (moyenne>=10) {
			//
		}
		//SINON
		else {moyenne = moyenne + 1;
		//FINSI
		}
		
		if (moyenne <10) {
			moyenne = moyenne +1;
		}
		//affichage
				
		//ecrire "la valeur de la moyenne est : ",moyenne
		System.out.println("La valeur de la moyenne est : "+moyenne);
	}

}

package bisextille;

import java.util.Scanner;

public class bissextille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	




	
		//Lire une ann�e A. 

		//D�terminer si l'ann�e A est bissextile. Si A n'est pas divisible par 4, l'ann�e n'est pas bissextile.

		//Si A est divisible par 4, l'ann�e est bissextile sauf si A est divisible par 100 et pas par 400.

		//Ecrire un message "Bissextile" ou "Non bissextile suivant le cas"

		//D�terminer la valeur absolue d'un nombre r�el 
			
	Scanner sc= new Scanner (System.in);
	int annee1 ;

	System.out.println("veuillez entree  annee1");
	annee1 = sc.nextInt();
	if (annee1%4==0) {
		
	
	
	if (annee1%100==0 || annee1 % 400 != 0) 
		System.out.println("l'ann�e est bissextille");
	
	}
	else {
		System.out.println("L'ann�e n' est pas Bissextile");
		
	}
	}}
	
	
	
	
	
	

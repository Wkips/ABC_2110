package mmebovary;

import java.util.Scanner;

public class bovary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);

		//Declaration des variables

		String beau;
		String trouvermb;
		String dispomb;
		String vfonctionne;
		String reparation;


		//Saisie 

		System.out.println("fait il beau ? oui/non");

		beau = sc.next();
		if (beau.equals("oui")) {

			System.out.println("votre velo fonctionne? oui/non");
			vfonctionne = sc.next();
			if (vfonctionne.equals("oui")) {
				System.out.println("ballade a velo");	
			}
			else {
				System.out.println("allez chez le garagiste"); 

				System.out.println("la reparation est elle imediate ? oui/non");
			}
			reparation = sc.next();
			if (reparation.equals("oui"))  
			{
				System.out.println("ballade a velo"); 
			}
			else {
				System.out.println("allez cueillir des joncs");
			}
		}
		else  {System.out.println("je vais lire un livre");
		System.out.println("retrouver mme bovary a la maison oui/non");
		trouvermb = sc.next();
		if (trouvermb.equals("oui")) {
			System.out.println("s'installer dans le fauteuil et commencer à lire");	
		}
		else {System.out.println("Aller à la bibliotheque");
		System.out.println("Mme Bovary est il disponible oui/non");

		}

		dispomb = sc.next();
		if (dispomb.equals("oui")) {
			System.out.println("Empruntez mme bovary rentrer a la maison s'installer dans le fauteuil commencer a lire");

		}
		else {System.out.println("Empruntez un livre policier rentrer a la maison s'installer dans le fauteuil et commencer a lire");
		System.out.println("s'installer dans le fauteuil et commencer à lire");
		}


		}



	}
}





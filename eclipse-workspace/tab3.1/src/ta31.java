import java.util.Scanner;

public class ta31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Soitun tableau de nombres tri�s par ordre croissant.Chercher si un nombre donn� Nfigure parmi les �l�ments. Si oui, indiquer la valeur de l'indice
		correspondant.Sinon, indiquer �Non trouve"*/

		int [] nombres	= {1, 2, 3, 4};
		int nbSaisie;

		Scanner sc = new Scanner(System.in);


		boolean finded = false;
		do {
			System.out.println("Veuillez saisir un nombre");
			nbSaisie=sc.nextInt();
			int i = 0;
			while (i<nombres.length && !finded)	{
			
	
	
				
				if (nbSaisie == nombres[i]) {
					finded = true;
				}
				i++;
				
			}
			if (!finded) {
				System.out.println("Non trouv�");
			} else {
				System.out.println("trouv�");
			}
		} while(!finded);
	}
}
import java.util.Scanner;

public class ta31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Soitun tableau de nombres triés par ordre croissant.Chercher si un nombre donné Nfigure parmi les éléments. Si oui, indiquer la valeur de l'indice
		correspondant.Sinon, indiquer «Non trouve"*/

		int [] nombres	= {1, 2, 3, 4};
		int nbSaisie;

		Scanner sc = new Scanner(System.in);





		for  (int i=0; i<nombres.length; i++)	{
			//System.out.println(nombres[i]);	


			System.out.println("Veuillez saisir un nombre");
			nbSaisie=sc.nextInt();
			if (nbSaisie == nombres[i++]) {
				System.out.println("correspondant");
			}
			else {
				System.out.println("Non trouve");
			}
		}
	}
}
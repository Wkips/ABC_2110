package nombreParfait;

import java.util.Scanner;

public class nombreParfait {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int combien;
		int nombre;
		int somme = 0;


		System.out.println("Combien de nombres voulez vous afficher");
		combien = sc.nextInt();
		for (int i = 0;i<=combien;i++) 		
		{

			

		nombre = sc.nextInt();
		for (i=1; i<nombre;i++) 
		{

			if (nombre%i==0) 
			{
				System.out.println(i);
			}

			}
		}

	}
}


/*On souhaite �crire un programme de calcul des Npremiers nombres parfaits.
 *  Un nombre est dit parfait s�il est �gal � la somme de ses diviseurs, 1 compris.  
 *  Exemple:6= 1+2+3 6estun nombre parfait.  
 *  L'algorithme  retenu  contiendra  deux  boucles  imbriqu�es. 
 *   Une  boucle  de  comptage  des  nombres  parfaits  
 *  qui s'arr�tera lorsque le d�compte sera atteint,
 *   la boucle interne ayant vocation � calculer tous les diviseurs du
 *   nombre examin� d'en faire la somme puis detester l'�galit� entre cette somme et le nombre.   
 *   
 *   Ecrivez le programme complet qui afficheles N premiers nombres parfaits.Exemple d�affichage en mode Console:Programme de
 *    recherche des nombresparfaits.Combien de nombre parfaits souhaitez-vous afficher?4  
 */
package nombreParfait;

import java.util.Scanner;

public class nombreParfait {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int combien;
		int nombre;



		System.out.println("Combien de nombres voulez vous afficher");
		combien = sc.nextInt();
		for (int i = 0;i<=combien;i++) {		
		System.out.println(i);


		nombre = sc.nextInt();
		for (i=1; i<nombre;i++) 

		{	int somme = sc.nextInt();



		if (nombre%i==0) 
		{


		}
		}
		}
	}
}





/*On souhaite écrire un programme de calcul des N premiers nombres parfaits.
 *  Un nombre est dit parfait s’il est égal à la somme de ses diviseurs, 1 compris.  
 *  Exemple:6= 1+2+3 6estun nombre parfait.  
 *  L'algorithme  retenu  contiendra  deux  boucles  imbriquées. 
 *   Une  boucle  de  comptage  des  nombres  parfaits  
 *  qui s'arrêtera lorsque le décompte sera atteint,
 *   la boucle interne ayant vocation à calculer tous les diviseurs du
 *   nombre examiné d'en faire la somme puis de tester l'égalité entre cette somme et le nombre.   
 *   
 *   Ecrivez le programme complet qui afficheles N premiers nombres parfaits.Exemple d’affichage en mode Console:Programme de
 *    recherche des nombresparfaits.Combien de nombre parfaits souhaitez-vous afficher?4  
 */
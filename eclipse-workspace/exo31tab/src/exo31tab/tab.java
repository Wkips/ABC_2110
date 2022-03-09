package exo31tab;

import java.util.Scanner;

public class tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] tableau = new int [ ] {3,7,9,14,22};
		int indice = 0;
		int nbN;
		int valeurIndice =-1;
		Scanner sc = new Scanner(System.in);
		nbN = sc.nextInt();
		for (int valeur : tableau )    {
			if (nbN == valeur) {
				System.out.println("le nombre recherche est a l'indice" + indice);
				
				valeurIndice = indice;
			}
			indice++;
			
			}
		if (valeurIndice == -1) {
			System.out.println("Nombre non trouvé");
		}
			
				
		

		
	}
	

}

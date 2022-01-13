package dowhile;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner test = new Scanner (System.in);
		
		int solde;
		
		do {
			System.out.println("quel est votre solde");
			solde = test.nextInt();
		if (solde >=0);
		else System.out.println("Remettre de l'argent avant d'etre dans la m***e ;) ");
			
		} while (solde <=0);
		System.out.println("parfait");
		
	}
	

}

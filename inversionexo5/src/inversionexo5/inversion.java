package inversionexo5;

import java.util.Scanner;

public class inversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//DECLARTION VARIABLE
		int nbr1 = 4, nbr2 = 2;
		int  temp;
	
	//SAISIE
		
		System.out.println("Donnez moi svp le nombre 1 ");
		Scanner sc = new Scanner(System.in);
		nbr1=sc.nextInt();
		
		
		System.out.println("Donnez moi svp le nombre 2 ");
		nbr2 = sc.nextInt();
		//Traitement 
		
		temp = nbr1;
		nbr1 = nbr2;
		nbr2 = temp;
		
		System.out.println("nbr1= " + nbr1 + " nbr2 = " + nbr2);

	}

}

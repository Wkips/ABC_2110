package inversionexo5;

import java.util.Scanner;

public class inversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//DECLARTION VARIABLE
		float nbr1 = 4, nbr2 = 2;
		float  temp;
	
	//SAISIE
		
		System.out.println("Donnez moi svp le nombre 1 ");
		Scanner sc = new Scanner(System.in);
		nbr1=sc.nextFloat();
		
		
		System.out.println("Donnez moi svp le nombre 2 ");
		nbr2 = sc.nextFloat();
		//Traitement 
		
		temp = nbr1;
		nbr1 = nbr2;
		nbr2 = temp;
		
		System.out.println(" le nombre 1 est: " + nbr1 );
		System.out.println(" le nombre 2 est: " + nbr2);
	}

}

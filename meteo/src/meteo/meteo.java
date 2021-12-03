package meteo;

import java.util.Scanner;

public class meteo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t ;
		
		
		//Saisie
		
		System.out.println("donnez moi svp la temperature");
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		
		// Traitement
		
		if (t<2)  {System.out.println("risque de verglas");}
		
			
		else {System.out.println("tous vas bien");
		}
		

	}
	}

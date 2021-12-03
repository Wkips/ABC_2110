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
		if (t>=2) {System.out.println("Il fait bon");}
		if (t>30) {System.out.println("il fait trop chaud");}
			
		else if (t>1) {System.out.println("tous vas bien");
		}
		

	}
	}

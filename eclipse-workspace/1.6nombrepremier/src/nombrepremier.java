import java.util.Scanner;

public class nombrepremier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Lire un nombre N et déterminer s’il est un nombre premier.
		
		Scanner sc= new Scanner (System.in);
		
		int nombre1;
		int somme;
		boolean premier;
		
		System.out.println("Veuillez entrer un nombre");
		nombre1= sc.nextInt();
		
		if (nombre1<=2) {
			System.out.println( "1 est un nombre premier");
			
			
		}
		else {
		premier=true;
			
		for (int i = 2; i <= nombre1-1; i++) {
			
			if(nombre1 % i==0)
			{
				
				premier=false;
				System.out.println(i);
				break;
				
			}
			
			
		}
		
		if (premier==true) { System.out.println( nombre1 +" : c'est un nombre premier!");
			
		} else { 
			
			System.out.println( nombre1+": Ce n'est pas un nombre premier!");

		}
			
			
			
			
		}
			
			
			
	}
	
}




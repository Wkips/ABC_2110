import java.util.Scanner;

public class nombrepremier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Lire un nombre N et déterminer s’il est un nombre premier.
		
		Scanner sc= new Scanner (System.in);
		
		int nombre1;
		
		System.out.println("Veuillez entrer le nombre1");
		nombre1= sc.nextInt();
		
		if (nombre1<2) {
			System.out.println("nombre1 n'est pas un nombre premier");
			
		}
		else {
			System.out.println("nombre1 est un nombre permier");
		}
		//if (nombre1%nombre1==1) {
			//System.out.println("C'est un nombre premier");
			
		}
		//else {
		//	System.out.println("Ce n'este pas un nombre 1er ");
		

		}
	



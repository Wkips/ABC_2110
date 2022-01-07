package bouclewhile;

import java.util.Scanner;

public class ClassWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ilFaitBeau;
	    System.out.println("Est ce qu 'il fait beau? oui/non");
	    Scanner sc = new Scanner(System.in);
	    ilFaitBeau= sc.next();
	    while (ilFaitBeau.equals("oui"))
	    {
	        //traitement
	    	
	        System.out.println("je me promene ds le jardin");
	        System.out.println("Est ce qu 'il fait TOUJOURS beau? oui/non");
	        ilFaitBeau= sc.next();
	    }
	    System.out.println("je rentre à la maison");
	    sc.close();
	}

}

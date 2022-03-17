import java.util.Scanner;

public class jalon1suite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nombre;

		Scanner sc = new Scanner(System.in);

		System.out.println("ecrire un nombre entre 5 et 10");

		nombre = sc.nextInt();
		if (nombre<5){
			System.out.println("trop petit");
		}
		
		else if (nombre>10){
			System.out.println("trop grand");
		}
		
		else {
			
			System.out.println("ok");
		}
		sc.close(); 
	}
	}




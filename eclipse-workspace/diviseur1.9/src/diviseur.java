import java.util.Scanner;

public class diviseur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int i; 
		int nombre1;
		int nombre2;
		Scanner sc = new Scanner(System.in);

		//Afficher les nombres de 1 à 20 
		for (i =1; i<=20; i++) {
			System.out.println(i);
		}

		//Afficher les nombres de 20 à 0
		for (i=20; i>=0; i--) {
			System.out.println(i);

		}

		//Afficher lese nombres d'une plage utilisateur 
		System.out.println("Veuillez entrez le nombre 1 et le nombre2");
		nombre1 = sc.nextInt();
		nombre2 = sc.nextInt();

		for (i = nombre1; i <= nombre2; i++) {
			System.out.println(i);

		}
		/*Lire un nombre entier et déterminer tous ses diviseurs autres que 1 et lui-même.
		 * 
		 * 
		 */
		System.out.println("Veuillez entrer nombre1");
		nombre1= sc.nextInt();


		for (i=1; i<nombre1;i++) {

			if (nombre1%i==0) {
				System.out.println(i);
			} 
		}
	}}


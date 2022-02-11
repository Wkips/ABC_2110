import java.util.Scanner;

public class diviseur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int i; 
		int nombre1;
		int nombre2;
		int r;
		Scanner sc = new Scanner(System.in);

		/*Afficher les nombres de 1 à 20 */
		for (i =1; i<=20; i++) {
			System.out.println(i);
		}
		
		/*Afficher les nombres de 20 à 0*/
		for (i=20; i>=0; i--) {
			System.out.println(i);
			
		}
		
		/*Afficher lese nobres d'une plage utilisateur */
		System.out.println("Veuillez entrez le nombre 1 et le nombre2");
		nombre1 = sc.nextInt();
		nombre2 = sc.nextInt();
		
		for (nombre1=1; nombre2<=99; nombre1++) {
			System.out.println(+nombre1 +nombre2 );
		}
	


	}
}

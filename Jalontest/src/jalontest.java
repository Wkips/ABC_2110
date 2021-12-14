import java.util.Scanner;

public class jalontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int departement;
		String nom;
		String prenom;
		String email1;
		String email2;
		
		
		System.out.println("Veuillez entrer votre prenom");
		Scanner sc = new Scanner(System.in);
		prenom = sc.next();
		System.out.println("vous avez saisie " +prenom);
		
		System.out.println("Veuillez entrer votre nom");
		nom = sc.next();
		System.out.println("vous avez saisie " +nom);
		
		System.out.println("veuillez entrer votre departement ");
		departement = sc.nextInt();
		System.out.println("vous avez saisie " +departement);
		
		email1 = (prenom + "." + nom + departement + "@arfp.asso.fr");
		email2 =  (nom + departement + prenom + "@arfp.asso.fr");
		
		System.out.println("choisir entre " + email1 +" "+ email2);
	}

}

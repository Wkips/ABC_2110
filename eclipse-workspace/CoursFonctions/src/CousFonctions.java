import java.util.Scanner;

public class CousFonctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
helloWorld();// rappel de fonction affichage directe
helloName() ;// rappel de fonction affichage directe

/*int resultat= addition(1,2); //rappel de fonction affichage en fonction d'un calcul
System.out.println(resultat);*/

System.out.println("Veuillez saisir un nombre svp");
int resultat = addition (sc.nextInt(), sc.nextInt());
System.out.println(resultat);
	}
	// pas de retour fonctions fixes
public static void helloWorld() {
	System.out.println("hello World");
}
public static void helloName() {
	System.out.println("paul");
}
// retour de la fonction

public static int addition ( int a, int b) {
	System.out.println("Faire addition");
return a+b;
}
}

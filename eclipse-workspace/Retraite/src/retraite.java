import java.util.Scanner;

public class retraite {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int age;
		Scanner sc = new Scanner (System.in);
		System.out.println("veuillez saisir votre age");
		age = sc.nextInt();
		
		// getRetired recupere le resultat du calcul/fonction 
		String resultat= getRetired(age);
		System.out.println(resultat);
	}
	//creer la classe


	public static String getRetired(int ageActuel){		
		//traitement calcul
		if (ageActuel>60){
			int differenceAge = (ageActuel-60);
			return"vous etes a la retraite depuis" + differenceAge + "annee";
		}
		if (ageActuel==60) {
			return "vous etes a la retraite";
		}
		if (ageActuel<0) {
			return " vous etes pas né";
		}
		else {
			int resteATravailler=(60-ageActuel);
			return "vous devez encore travailer"+resteATravailler+"annee";
		}
		
	}

}




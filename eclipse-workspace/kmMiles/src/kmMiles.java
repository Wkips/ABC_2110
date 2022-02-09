import java.util.Scanner;

public class kmMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String saisie;
		String [] tableauDeConversion;
		String uniteDeMesure;
		int valeur;
		double conversion;
		Scanner sc = new Scanner(System.in);


		System.out.println("Entrez une valeur suivie de MI ou KM");

		saisie = sc.nextLine(); //"12 mi"

		tableauDeConversion = saisie.split(" ");
		valeur = Integer.valueOf(tableauDeConversion[0]);

		if (tableauDeConversion.length >1) {
			uniteDeMesure = tableauDeConversion[1];
		}
		else {
			uniteDeMesure ="km";
		}
		uniteDeMesure = uniteDeMesure.toLowerCase();

		if (uniteDeMesure.equals("km")) {
			conversion = (valeur/1.609); 
			System.out.println(valeur+ " km egal " +conversion +" miles" );
		}
		else {
			conversion = (valeur*1.609);
			System.out.println( valeur +" miles egal " +conversion +" km");
		}

		sc.close();
	}
}


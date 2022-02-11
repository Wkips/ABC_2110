import java.util.Scanner;

public class correction213 {





		/**
		 * 1) récupérer les valeurs
		 * 2) stocker chaque valeur + unité dans le tableau tableauDeConversion
		 * 3) so l'utilisateur saisit GO --> affichage des conversions
		 * @param args
		 */
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			/** @var String saisie en cours */
			String valeurAConvertir;
			String[] tableauDeConversion;
			Boolean go = false;
			int index = 0;

			tableauDeConversion = new String[100];

			do {

				System.out.println("Veuillez saisir une valeur à convertir");

				valeurAConvertir = sc.nextLine();

				if(valeurAConvertir.equals("go")) {
					go = true;
				}
				else {
					tableauDeConversion[index] = valeurAConvertir;
					index++;
				}

			} while(go == false);

			/* 1) Parcourir tableauDeConversion
			 * 2) pour chaque valeur du tableau ,effectuer la conversion
			 */

			for(int i = 0; i < index; i++) {
				String val = tableauDeConversion[i];
				convertirUneValeur(val);
			}

			System.out.println("Programme terminé");

			sc.close();

		} // fin du main

		public static void convertirUneValeur(String valeur)
		{
			String[] valeurEtUnite = valeur.split(" ");
			String unite;
			String uniteResultat;
			double conversion;

			if(valeurEtUnite.length > 1) {
				unite = valeurEtUnite[1];
			} else {
				unite = "km";
			}

			conversion = Double.parseDouble(valeurEtUnite[0]);

			if(unite.equals("km")) {
				conversion =  conversion / 1.609;
				uniteResultat = "mi";
			}
			else {
				conversion =  conversion * 1.609;
				uniteResultat = "km";
			}

			System.out.println(
				valeur + " = " + conversion + " " + uniteResultat
			);
		}

	} // fin de Programme
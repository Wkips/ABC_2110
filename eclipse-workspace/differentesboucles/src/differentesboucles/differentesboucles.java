

import java.util.Scanner;


public class DifferentesBoucles {
	
	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    //tant que
    /*
    Chaine ilFaitBeau
    ecrire "Est ce qu 'il fait beau? oui/non"
    lire ilFaitBeau
    tantque (ilFaitBeau == "oui") faire
        ecrire  "je me promene ds le jardin"
        ecrire "Est ce qu 'il fait toujours beau? oui/non"
        lire ilFaitBeau
    fintantque
    ecrire "je rentre à la maison"
    */
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
    //faire jusqu'à
    /*do
    {
        //traitement
    }
    while (condition);*/
    //---------------repeter de 1 à n avec un pas de 1 --------------
    /*
    1 + 1 -> 2 (n)
    //une premiere fois 0
    //une deuxieme fois 2 (n) avce un pas de 1
    0 + 1 ->1 + 1 -> 2
    //repeter de 1 à 6 avec un pas de 1
    1
    1 + 1 -> 2
    2 + 1 -> 3
    3 + 1 -> 4
    4 + 1 -> 5
    5 + 1 -> 6
    //repeter de 1 à 11 avec un pas de 2
    1
    1 + 2 -> 3
    3 + 2 -> 5
    5 + 2 -> 7
    7 + 2 -> 9
    9 + 2 -> 11
    11 + 2 -> 13
    */
    //PSEUDO CODE
    /*
    Entier i
    pour i de 1 à 3 par 1
    faire
      // claquer une fois dans les mains
    finpour
    */
    // JAVA
    int i;
    for( i=1 ; i<=3 ; i++){
        System.out.println("claquer une fois dans les mains");
    }
    /*
    Entier i
    pour i de 1 à 3 par 1
    faire
        // aller au fond de la salle
        //revenir du fond de la salle
    finpour
    */
    
    }
    
}
import java.util.Scanner;

public class ennonce9ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nombre1;
		float nombre2;
		
	
		
		System.out.println("Entrez svp le premier nombre");
		Scanner sc= new Scanner(System.in);
		nombre1=sc.nextFloat();
		System.out.println("Entrez svp le deuxieme nombre");
		nombre2=sc.nextFloat();
	
		if (nombre1<nombre2){
			System.out.println("nombre1" +nombre1 < "nombre2" +nombre2);
		}
		else if (+nombre1>nombre2) {
			System.out.println("nombre1" +nombre1 > "nombre2" +nombre2);
		}
		else if (nombre1==nombre2) {
			System.out.println("nombre1" +nombre1 == "nombre2" +nombre2);
			
		}
		

		
		
		
		
		

	}

}

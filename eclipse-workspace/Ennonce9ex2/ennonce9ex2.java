import java.util.Scanner;

public class ennonce9ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nombre1; 
		float nombre2;
		float nombre3;
		
		
		System.out.println("veuillez svp entrer le nombre1");
		Scanner sc= new Scanner(System.in);
		nombre1=sc.nextFloat();
		System.out.println("veuillez svp entrer le nombre2");
		nombre2=sc.nextFloat();
		System.out.println("veuillez svp entrer le nombre3");
		nombre3=sc.nextFloat();
		
		if  (nombre1>nombre2 && nombre2>nombre3){
			System.out.println("nombre1>nombre2>nombre3");
		}
		//ok
		else if (nombre3>nombre2 && nombre2>nombre1) {
			System.out.println("nombre3>nombre2>nombre1");
		
		}
		
		else if (nombre2>nombre1 && nombre1>nombre3) {
				System.out.println("nombre2>nombre1>nombre3");
				
		}
		else if (nombre2>nombre3 && nombre3>nombre1) {
			System.out.println("nombre2>nombre3>nombre1");
			
		}
		
		else if (nombre3>nombre1 && nombre1>nombre2) {
			System.out.println("nombre3>nombre1>nombre2");
		}
		else if (nombre1>nombre3 && nombre3>nombre2) {
			System.out.println("nombre1>nombre3>nombre2");
		}
		
	
	}
}
	
	



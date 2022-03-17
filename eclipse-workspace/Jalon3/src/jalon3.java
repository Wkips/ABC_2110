import java.util.Scanner;

public class jalon3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pswd;
		int tries =0;
		boolean pswdok = false;
		Scanner sc = new Scanner(System.in);
		String ps ="formation" ;

		do {
			System.out.println("veuillez entrer le mot de passe");
			pswd = sc.nextLine();
			tries++;

			/*if(pswd.equals("Bonjour"))  {
				pswdok = true;	
			}*/

			pswdok = pswd.equals("Bonjour");

		}
		while (!pswdok && (tries<3));

		if (pswdok) { 
			System.out.println("vous etes connecte");

		}
		else {
			System.out.println("vous n'etes pas connecte");
		}
		
		
		if  (!pswdok)
		{
			System.out.println("entrer votre phrase secrete");
			ps = sc.next();
			
			if (ps.equals("formation" )) {
				System.out.println("vous etes co");
			}
				
				else { System.out.println("acces denied");
				}
			}
			
		}
		
		
	}
















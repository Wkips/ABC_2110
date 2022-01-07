package malade;

import java.util.Scanner;

public class maladeclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float temp ;
		System.out.println("quel est votre temperature ? ");
		Scanner sc = new Scanner (System.in);
		temp = sc.nextFloat();
		while (temp<=38)
			
		{
			
			System.out.println("je vais bien");
			System.out.println("ma temperature est de combien ?");
			temp=sc.nextFloat();
			
			
			
		}
		System.out.println("au lit");
		sc.close();
	}

}

public class Program {

	public static void main(String[] args) {
				
		Animal toto = new Animal("Canard");
		
		Animal tata;
		tata = new Animal("Taupe");
		
		System.out.println("Tata est un(e) " + tata.getEspece());
		
		tata.manger();
		
		
		chat garfield = new chat();
		
		garfield.manger();
		
		
	}

}
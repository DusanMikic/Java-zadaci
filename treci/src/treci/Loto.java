package treci;
import java.util.Random;
import java.util.Scanner;

public class Loto {

	public static void main(String[] args) {
		
	
		try(Scanner  Ulaz =  new Scanner(System.in)) {
			Random broj = new Random();		
			int n1 = broj.nextInt (51);
		    	System.out.println("Generisani broj je: " + n1);
		    
		       		System.out.print("Unesi neki broj od 1 do 50: ");
		       			int x = Ulaz.nextInt();
	       					if ((x>51) && (x<0)) 
		        	 
	       						System.out.println("Broj je van opsega");
	       					else {
	       					if (n1 == x) 
	       							System.out.println("Pogodak");
	       					else 
	       						if (n1-x>Math.abs(5)) 
	       								System.out.println("vise srece drugi put");
	       							}
		}     				
	}
}

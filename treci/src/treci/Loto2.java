package treci;
import java.util.Random;
import java.util.Scanner;

public class Loto2 {

	public static void main(String[] args) {
		
	
		try(Scanner  Ulaz =  new Scanner(System.in)) {                   // skener otvoren + try
			Random broj = new Random();		                             // random broj   
				int n1 = broj.nextInt (51);                                  // random u opsegu 0-50 
		    		        
		       		System.out.print("Unesi neki broj od 1 do 50: ");
		       			int x = Ulaz.nextInt();
	       					if ((x>51) || (x<0)) 
		        	 
	       						System.out.println("Broj je van opsega");
	       					else {
	       					if (n1 == x) 
	       							System.out.println("Pogodak");
	       					else 
	       						if (Math.abs((n1-x))>5) 
	       								System.out.println("Vise srece drugi put");
	       						else System.out.println("Blizu ste");
	       							}
	       					System.out.println("Generisani broj je: " + n1);		
		}     				
	}
}

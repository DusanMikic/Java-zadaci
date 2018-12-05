package endava;

import java.util.Scanner;


public class digitronac {

	public static void main(String[] args) {
		System.out.println("Unesi dva cela broja i znak operacije ");
			try(Scanner  Ulaz =  new Scanner(System.in)) {
				int x = Ulaz.nextInt();
				int y = Ulaz.nextInt();
			    char c = Ulaz.next().charAt(0);
					System.out.println("brojevi su " +x +" i " +y + " a znak je " + +c);
					
				int zbir;
					if (c == 's')	{
					zbir = x + y;
						System.out.println("Zbir je " +zbir);
					}
				int razlika;
					if (c == 'o')	{
					razlika = x - y;
						System.out.println("Razlika je " +razlika);
					}
				int proizvod;
					if (c == 'p')	{
					proizvod = x * y;
						System.out.println("Proizvod je " +proizvod);
					}
				float kolicnik;
					if ((c == 'k') && (y!=0))	{
					kolicnik = x/y;
						System.out.println("Kolicnik je " +kolicnik);
					}	
					else
						System.out.println("Niste uneli validan podatak ");
					
			}
	}
}

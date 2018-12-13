package predavanje2;
import java.util.Scanner;
import java.util.Arrays;

public class Zadatak5 {


		public static void main(String[] args) {
			try (Scanner Ulaz = new Scanner (System.in)) {
						
				System.out.print("Unesite velicinu niza ");
				 int n = Ulaz.nextInt();
				 int[] Niz = new int[n];
					for (int i=0; i<Niz.length; i++) {
						System.out.print("Unesite " + (i+1) + ". clan niza ");
						Niz[i] = Ulaz.nextInt();
					}
					
					int b;
			        for (int i = 1; i < n ; i++) {
			            for (int j = i-1; j >=0 && Niz[j] > Niz[j+1]; j--) {				// 	sortiranje niza
			                    b = Niz[j];
			                    Niz[j] = Niz[j+1];
			                    Niz[j+1] = b;
			                	System.out.println();
			            }
			        }    
			    	
					System.out.print("Sortiran niz je: ");                      		   // ispisivanje sortiranog niza
					for (int i=0; i<n; i++) {
						
					System.out.print(Niz[i]+ " ");
					}
						System.out.println();
					
			    	System.out.print("Unesite broj x: ");									
			    	int x = Ulaz.nextInt();
			    															
			    		boolean broj = false;												//ispitivanje broja x
			    			for (int i=0; i<n; i++) {					
		    					if (Niz[i] == x)
		    						broj = true;
			    			}
					if (broj==true)	
						System.out.println("Niz sadrzi broj x ");							
					else
						System.out.println("Niz ne sadrzi broj x ");				
					
					
			    	System.out.print("Prvih 5 clanova niza su ");							// prvih 5 clanova niza
						for (int i=0; i<5 && i<Niz.length; i++) {					
							System.out.print(Niz[i]+" ");
						}
			}
		}
}

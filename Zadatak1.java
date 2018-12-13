package predavanje2;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		System.out.println("Unesi dva cela broja (prvo manji pa veci): ");
			try (Scanner Ulaz = new Scanner (System.in)) {						//Scanner
				
				int x = Ulaz.nextInt();											//x					
				int y = Ulaz.nextInt();											//y
				
					while (x<y-2)  {
						
						if (x % 2 !=0) { 										//neparan +1
							x=x+1;
								System.out.println(x);
						}	
						else {
							x=x+2;												//paran +2
								System.out.println(x);
						}					
			      	}								
			}
	}
}
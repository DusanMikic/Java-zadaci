package predavanje2;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		int i;
		int max=0;
		int Ocena=0;
		String Student="";
		String najbolji ="";
		
			try (Scanner Ulaz = new Scanner (System.in)) {	
				System.out.println("Unesi broj studenata ");
				int brojStudenata = Ulaz.nextInt();
				for (i=0; i<brojStudenata; i++	 ) {
					System.out.println("Unesi ime "+(i+1)+". studenta");
					Student = Ulaz.next();
						System.out.println("Unesi ocenu studenta");
						 Ocena = Ulaz.nextInt();
						 if (Ocena > max) {
							 max = Ocena;
							 najbolji = Student;
						 }
				}	
					System.out.println("Najvecu ocenu "+ max+" dobio je "+ najbolji);					
		}	
	}
}

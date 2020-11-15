/*Prepraviti zadatak sa pocetka casa (oduzimanje) na sljedeci nacin:
  Ukoliko korisnik unese tacan odgovor, program mu cestita i zavrsava s radom. 
  Ukoliko korisnik unese pogresan odgovor, program ispisuje da je odgovor pogresan te 
  postavlja pitanje sve dok korisnik ne unese tacan odgovor. 
*/
import java.util.Scanner;
public class Lekcija4_3 {

	public static void main(String[] args) {
		int c=-1,razlika;
		int a=(int) (Math.random()*10);
		int b=(int) (Math.random()*10);
		Scanner scan=new Scanner(System.in);
		if(a>=b) {
			razlika=a-b;
		}
		else {
			razlika=b-a;
		}
		
		while(razlika!=c) {
			if(a>=b) {
			razlika=a-b;
			System.out.println("Koliko je "+a+" - "+b);
			c=scan.nextInt();
		}
		else {
			razlika=b-a;
			System.out.println("Koliko je "+b+" - "+a);
			c=scan.nextInt();
		}
		
		if(razlika==c) {
			System.out.println("Odgovor koji ste unijeli je tacan. Svaka cast!");
		}	
	}
		scan.close();
  }
}

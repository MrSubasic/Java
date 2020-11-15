/*Napisati program koji pita korisnika da unese neku vrijednost.
Nakon sto je korisnik unijeo vrijednost, program izracunava stopu PDV-a 
te ispisuje korisniku orginalnu vrijednost + PDV. Korisnik unese 10, program vrati 11.7.*/
import java.util.Scanner;
public class Lekcija2_1 {
	public static void main(String[] args) {
		double vrijednost;
		double pdv;
		Scanner scan= new Scanner(System.in);
		System.out.println("Unesite neku vrijednost : ");
		vrijednost = scan.nextDouble();
		pdv=vrijednost*0.17;
		System.out.println(" Vrijednost + PDV je : "+(vrijednost+pdv));
		scan.close();
		
	}
}

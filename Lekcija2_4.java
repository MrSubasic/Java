/*Napisati program koji ucitava od korisnika temperaturu u Celsiusima (double tip podataka).
 Nakon što je program ucitao temperaturu od strane korisnika, pretvara istu u Fahrenheite i
 ispisuje rezultat nazad korisniku.*/
import java.util.Scanner;
public class Lekcija2_4 {
	public static void main(String[] args) {
		double fer,cel;
		Scanner scan = new Scanner(System.in);
		System.out.print("Unesite temperaturu u Celsiusima : ");
		cel=scan.nextDouble();
		fer=(9.0 / 5) * cel + 32;
		System.out.println("Unesena temperatura u Fahrenheitima je : "+fer);
		scan.close();

	}
}

/*Napisati program koji pita korisnika da unese rezultat zbira 2 nasumicno generisana, jednocifrena broja.
 Program treba da pita korisnika pitanje tipa “Koliko je 3 + 4?” gdje su 3 i 4 nasumicno generisani brojevi. 
 Nakon sto korisnik unese odgovor, program provjerava da li je uneseni odgovor tacan. 
 Ukoliko je korisnik unio tacan odgovor, program ispisuje „Odgovor koji ste unijeli je tacan. Svaka cast!“. 
 Ukoliko korisnik nije unio tacan odgovor, program ispisuje „Odgovor koji ste unijeli nije tacan. 
 Tacan odgovor je ODGOVOR“
*/
import java.util.Scanner;
public class Lekcija3_4 {

	public static void main(String[] args) {
		int a=(int) (Math.random()*10);
		int b=(int) (Math.random()*10);
		int c,zbir;
		zbir=a+b;
		Scanner scan=new Scanner(System.in);
		System.out.println("Koliko je "+a+" + "+b);
		c=scan.nextInt();
		if(zbir==c) {
			System.out.println("Odgovor koji ste unijeli je tacan. Svaka cast!");
		}
		else {
			System.out.println("Odgovor koji ste unijeli nije tacan. Tacan odgovor je "+zbir);
		}
		scan.close();
		
	}

}

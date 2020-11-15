/*Napisati program koji generise dva cijela, nasumicna broja te trazi od korisnika da odgovori 
  pitanje tipa: “Koliko je 8 - 3?” gdje su 8 i 3 nasumicno generisani brojevi. Ispisati rezultat
  korisniku - ako je tacan, cestitati ako nije - ispisati tacan odgovor. Ukoliko je prvi generisani
  broj manji od drugog, program treba da im zamijeni pozicije - rezultat oduzimanja ne smije biti
  negativan broj. 
*/
import java.util.Scanner;
public class Lekcija4_1 {

	public static void main(String[] args) {
		int a=(int) (Math.random()*1000);
		int b=(int) (Math.random()*1000);
		int c,razlika;
		Scanner scan=new Scanner(System.in);
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
		else {
			System.out.println("Odgovor koji ste unijeli nije tacan. Tacan odgovor je "+razlika);
		}
		scan.close();
	}

}

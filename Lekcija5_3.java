/*Napisati program koji pita korisnika da unese ocjenu  kao slovo (A, B, C, D ili F) i 
  ispisuje mu odgovarajucu numericku ocjenu (5, 4, 3, 2 ili 1).
*/
import java.util.Scanner;
public class Lekcija5_3 {

	public static void main(String[] args) {
		char ocjena;
		Scanner scan=new Scanner(System.in);
		System.out.println("Unesite ocjenu kao (A,B,C,D ili F) :");
	    ocjena=scan.next().charAt(0);
		if(ocjena=='A') {
			System.out.println("Numericka vrijednost ocjene je 5");
		}
		else {
			if(ocjena=='B') {
				System.out.println("Numericka vrijednost ocjene je 4");
			}
			else {
				if(ocjena=='C') {
					System.out.println("Numericka vrijednost ocjene je 3");
				}
				else {
					if(ocjena=='D') {
						System.out.println("Numericka vrijednost ocjene je 2");
					}
					else
						if(ocjena=='F') {
							System.out.println("Numericka vrijednost ocjene je 1");
						}
						else {System.out.println("Greska. Unos je pogresan!");}
				}
			}
		}
		scan.close();

	}

}

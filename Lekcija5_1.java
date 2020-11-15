/*Napisati program koji pita korisnika da unese neki cijeli broj. Kada je korisnik unijeo broj,
  program ispisuje sve brojeve djeljive sa 13. 
 	Unesite cijeli broj kao gornju granicu: 100
	Brojevi djeljivi sa 13 u rasponu od 1 do 100 su: 
	13 26 39 52 65 78 91 
*/
import java.util.Scanner;
public class Lekcija5_1 {

	public static void main(String[] args) {
		int broj;
		Scanner scan=new Scanner(System.in);
		System.out.print("Unesite gornju granicu: ");
		broj=scan.nextInt();
		for(int i=1;i<=broj;i++) {
			if(i%13==0) {
				System.out.print(i+" ");
			}
		}
		scan.close();
	}

}

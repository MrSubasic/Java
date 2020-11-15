/*Napisati program koji generise cijeli, nasumican broj u rasponu od 0 do 10 te pita korisnika 
  da pogodi koji je broj generisan. Ukoliko korisnik unese veci broj od generisanog, program
  ispisuje da je broj veci te pita korisnika da pokusa ponovo sa manjim brojem. Ukoliko unese manji
  - pokusaj ponovo sa vecim brojem. Kada korisnik pogodi broj, program mu cestita i zavrsava sa radom. 
*/
import java.util.Scanner;
public class Lekcija4_5 {

	public static void main(String[] args) {
		int a;
		int b=(int)(Math.random()*11);
		/*System.out.println(b);   ---> Sluzilo mi za provjeru*/
		Scanner scan=new Scanner(System.in);
		do {
			System.out.print("Unesite jedan broj od 0-10 : ");
			a=scan.nextInt();
			if(a<b) {
				System.out.println("Pokusaj ponovno sa vecim brojem!");
			}
			else {
				if(b<a) {
				System.out.println("Pokusaj ponovno sa manjim brojem!");
			    }
				else {
					System.out.println("Uneseni broj je tacan broj!");	
				}
			}
		} while (a!=b);
		scan.close();

	}

}

/*Napisati program koji pita korisnika da unese godinu. Nakon sto korisnik unese godinu,
 program provjerava da li je unijeta godina prestupna te ispisuje korisniku da li je godina prestupna.*/
import java.util.Scanner;
public class Lekcija3_5 {

	public static void main(String[] args) {
		int god;
		Scanner scan=new Scanner(System.in);
		System.out.print("Unesite godinu :");
		god=scan.nextInt();
		if((god%4==0 && god%100!=0)||god%400==0 ) {
			System.out.print("Unesena godina je prestupna!");
		}
		else {
			System.out.print("Unesena godina nije prestupna");
		}
		scan.close();

	}

}

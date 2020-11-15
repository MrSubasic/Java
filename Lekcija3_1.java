/*Napisati program koji pita korisnika da unese neki iznos u funtama.
 Nakon sto korisnik unese iznos u funtama, program ispisuje isti iznos u konvertibilnim markama.*/
import java.util.Scanner;
public class Lekcija3_1 {

	public static void main(String[] args) {
		double funta,bam;
		Scanner scan=new Scanner(System.in);
		System.out.print("Unesite iznos u funtama :");
		funta=scan.nextDouble();
		bam=funta*2.20;
		System.out.println("Uneseni iznos u konvertibilnim markama je :"+bam);
		scan.close();
		
	}
}



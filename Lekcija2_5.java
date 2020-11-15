//Napisati program koji ucitava broj stopa, konvertuje ih u metre te ispisuje rezultat.
import java.util.Scanner;
public class Lekcija2_5 {

	public static void main(String[] args) {
		double stop,met;
		Scanner scan = new Scanner(System.in);
		System.out.print("Unesite broj stopa : ");
		stop=scan.nextDouble();
		met=stop*0.305;
		System.out.println(stop+" stopa = "+met+" metara.");
		scan.close();
		

	}

}

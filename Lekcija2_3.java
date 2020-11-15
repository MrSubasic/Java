/*Napisati program koji pita korisnika da unese broj sekundi kao cijeli broj. 
Na osnovu broja kojeg korisnik unese, program ispisuje broj minuta i sekundi.*/
import java.util.Scanner;
public class Lekcija2_3 {

	public static void main(String[] args) {
		int a,sec,min;
		Scanner scan = new Scanner(System.in);
		System.out.print("Unesite broj sekundi : ");
		a=scan.nextInt();
		sec = a % 60;
		min= (a-sec)/60;
		System.out.println(a+" sekundi je "+min+" minuta i "+sec+" sekundi.");
		scan.close();
	}

}

/*Napisati metodu koja vraca broj dana u godini. 
		public static int brojDanaUGodini(int godina)
Poziv brojDanaUGodini(2000) vraca 366.
*/
import java.util.Scanner;
public class Lekcija6_6 {
	public static int brojdanaugod(int god) {
		int a=365,b=366;
		if((god%4==0 && god%100!=0)|| god%400==0) {
			return b;
		}
		else {
			return a;
		}
	}
	public static void main(String[] args) {
		int god;
		Scanner scan=new Scanner(System.in);
		System.out.print("Unesite zeljenu godinu: ");
		god=scan.nextInt();
		System.out.print("Unesena godina ima "+brojdanaugod(god)+" dana");
		scan.close();
		

	}

}

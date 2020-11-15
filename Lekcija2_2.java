/*Napisati program koji pita korisnika da unese tri broja. Nakon što je korisnik unijeo tri broja,
  program ispisuje njihov prosjek.*/
import java.util.Scanner;
public class Lekcija2_2 {

	public static void main(String[] args) {
	 double a,b,c,prosjek;
	 Scanner scan = new Scanner(System.in);
	 System.out.print("Unesite tri broja : ");
	 a=scan.nextDouble();
	 b=scan.nextDouble();
	 c=scan.nextDouble();
	 prosjek=(a+b+c)/3;
	 System.out.println("Prosjek unesena tri broja je: "+prosjek);
	 scan.close();
	 
	}

}

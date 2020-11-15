/*Napisati program koji pita korisnika da unese string, a zatim prolazi kroz taj string i 
  ispisuje svaki njegov karakter sa jednim spaceom razmaka.*/
import java.util.Scanner;
public class Lekcija5_4 {

	public static void main(String[] args) {
		int b;
		Scanner scan=new Scanner(System.in);
		System.out.println("Unesite vas string :");
		String recenica=scan.nextLine();
		b=recenica.length();
		for(int i=0;i<b;i++) {
			System.out.print(recenica.charAt(i)+" ");
		}
		scan.close();
	}

}

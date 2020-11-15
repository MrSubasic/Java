/*Napisati program koji trazi od korisnika da unese neki string, a zatim ispisuje duzinu unijetog
  stringa i njegov prvi karakter.*/
import java.util.Scanner;
public class Lekcija5_2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Unesite vas string:");
		String recenica = scan.nextLine();
		System.out.print("Duzina unesenog stringa je: "+ recenica.length()+"\nA njegov prvi karakter je: "
		+recenica.charAt(0));
		scan.close();

	}

}

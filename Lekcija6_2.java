/*Napisati metodu koja, na osnovu prosljedenog broja bodova, korisniku ispisuje koju je ocjenu dobio. */
import java.util.Scanner;
public class Lekcija6_2 {
	public static int ispisiOcjenu(int bodovi) {
		int rezultat=0;
		if(bodovi>=0 && bodovi<50) {
			rezultat=5;
		};
		if(bodovi>=50 && bodovi<60) {
			rezultat=6;
		};
		if(bodovi>=60 && bodovi<70) {
			rezultat=7;
		};
		if(bodovi>=70 && bodovi<80) {
			rezultat=8;
		};
		if(bodovi>=80 && bodovi<90) {
			rezultat=9;
		};
		if(bodovi>=90 && bodovi<=100) {
			rezultat=10;
		};
		return rezultat;
	}

	public static void main(String[] args) {
		int bodovi;
		Scanner scan=new Scanner(System.in);
		System.out.print("Unesite broj bodova (od 0 do 100):");
		bodovi=scan.nextInt();
		System.out.print("Vasa ocjena je: "+ispisiOcjenu(bodovi));
		scan.close();
	}

}

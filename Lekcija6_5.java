/*Napisati metodu koja ispisuje individualne karaktere u datom rasponu:
 		public static void ispisiKaraktere(char k1, char k2, int brojPoLiniji)
Metoda ispisuje sve karaktere u nizu izmedu k1 i k2 s tim da treci argument odreduje 
koliko karaktera treba ispisati po liniji.
*/
import java.util.Scanner;
public class Lekcija6_5 {
	public static void ispisikaraktere(char a,char b,int brln) {
		int br=-1;
		for(char i=a;i<b;i++) {
				    br++;
				    if (br<brln) {
				    System.out.print(i+" ");
					}
				    else {
				    System.out.print("\n");
				    System.out.print(i+" ");
				    br=0;
				    }
				};
	}
	public static void main(String[] args) {
		char a,b;
		int broj;
		Scanner scan=new Scanner(System.in);
		System.out.print("Unesite prvi karakter :");
		a = scan.next().charAt(0); 
		System.out.print("Unesite drugi karakter :");
		b = scan.next().charAt(0); 
		System.out.print("Unesite broj :");
		broj=scan.nextInt();
		ispisikaraktere(a,b,broj);
		scan.close();
		

	}

}

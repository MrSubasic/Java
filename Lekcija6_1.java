/*Napisati program vraca korisniku broj velikih i malih slova u nekom stringu koji unese korisnik.*/
import java.util.Scanner;
public class Lekcija6_1 {

	public static void main(String[] args) {
		int a,velika=0,mala=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Unesite vas string :");
		String recenica=scan.nextLine();
		a=recenica.length(); 
		for(int i=0;i<a;i++) {
			char b=recenica.charAt(i);
			if(b!=' ') {
	 
			if(Character.isUpperCase(b)) {
				velika++;	
			}
			else {
				mala++;
			}
			}
		}
		System.out.println("Broj velikih slova u unesenom stringu je :"+velika
				+"\nBroj malih slova u unesenom stringu je :"+mala);
		scan.close();
	}

	

}

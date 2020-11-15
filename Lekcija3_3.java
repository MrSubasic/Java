/*Prepraviti program koji vrsi konverziju funti u BAM tako da, ukoliko korisnike unese broj 
 funti manji od nule, program izbaci gresku. Ukoliko broj koji korisnik unese nije manji od 0, 
 program normalno izvrsava konverziju. 
*/

import java.util.Scanner;
public class Lekcija3_3 {

	public static void main(String[] args) {
		double funta,bam;
		Scanner scan=new Scanner(System.in);
		System.out.print("Unesite iznos u funtama :");
		funta=scan.nextDouble();
		if (funta<0) {
			System.out.print("Greska.Unijeli ste negativan iznos!");
		}
		else {
		bam=funta*2.20;
		System.out.println("Uneseni iznos u konvertibilnim markama je :"+bam);
		scan.close();
		}

	}

}

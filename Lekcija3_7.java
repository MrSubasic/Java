/*Napisati program koji generise nasumican broj izmedu 1 i 12 i na osnovu nasumicnog broja
  ispisuje mjesec u godini.*/
public class Lekcija3_7 {

	public static void main(String[] args) {
		int broj=(int)(Math.random()*12)+1;
		System.out.println("Nasumicni broj je "+broj);
		if(broj==1) {
			System.out.println("Januar");
		}
		if(broj==2) {
			System.out.println("Februar");
		}
		if(broj==3) {
			System.out.println("Mart");
		}
		if(broj==4) {
			System.out.println("April");
		}
		if(broj==5) {
			System.out.println("Maj");
		}
		if(broj==6) {
			System.out.println("Juni");
		}
		if(broj==7) {
			System.out.println("Juli");
		}
		if(broj==8) {
			System.out.println("August");
		}
		if(broj==9) {
			System.out.println("Septembar");
		}
		if(broj==10) {
			System.out.println("Oktobar");
		}
		if(broj==11) {
			System.out.println("Novembar");
		}
		if(broj==12) {
			System.out.println("Decembar");
		}
	}

}

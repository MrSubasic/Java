/*Napisati program koji ispisuje sve prestupne godine, 10 po liniji, u rasponu godina koje korisnik unese. 
  Program pita korisnika da unese pocetnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu.
  Razmak izmedu godina treba biti jedan space. 
*/
import java.util.Scanner;
public class Lekcija4_6 {

	public static void main(String[] args) {
		int br=-1,pocetnagod,krajnjagod;
		Scanner scan=new Scanner(System.in);
		System.out.print("Unesite pocetnu godinu :");
		pocetnagod=scan.nextInt();
		System.out.print("Unesite krajnju godinu :");
		krajnjagod=scan.nextInt();
		for(int i=pocetnagod;i<krajnjagod;i++) {
			if((i%4==0 && i%100!=0)||i%400==0 ) {
				    br++;
				    if (br<10) {
				    System.out.print(i+" ");
					}
				    else {
				    System.out.print("\n");
				    System.out.print(i+" ");
				    br=0;
				    }
				};
			
		}
	   scan.close();	
 
	}
}

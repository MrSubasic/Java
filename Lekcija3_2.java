/*Napisati program koji pita korisnika da unese broj bodova (od 0 d0 100) koje je dobio na testu. 
 Na osnovu broja bodova koje korisnik unese, program ispisuje ocjenu koju je korisnik zasluzio.*/
import java.util.Scanner;
public class Lekcija3_2{

	public static void main(String[] args) {
		int bodovi;
		Scanner scan=new Scanner(System.in);
		System.out.print("Unesite broj bodova :");
		bodovi=scan.nextInt();
		if(bodovi>=0 && bodovi<=100) {
			if(bodovi<50) {
				System.out.print("Korisnik nije polozio ispit!");
			}
			if(bodovi>=50 && bodovi<60) {
				System.out.print("Ocjena 6");
			}
			if(bodovi>=60 && bodovi<70) {
				System.out.print("Ocjena 7");
			}
			if(bodovi>=70 && bodovi<80) {
				System.out.print("Ocjena 8");
			}
			if(bodovi>=80 && bodovi<90) {
				System.out.print("Ocjena 9");
			}
			if(bodovi>=90 && bodovi<=100) {
				System.out.print("Ocjena 10");
			}
		}
		else {
			System.out.print("Niste dobro unijeli broj bodova! (bodovi moraju biti izmedju 0-100)");
		}
		scan.close();
		}

	}

/*Drugi nacin
  =import java.util.Scanner;
 
public class Lekcija3_2 {

	public static void main(String[] args) {
		int bodovi;
		Scanner scan=new Scanner(System.in);
		System.out.print("Unesite broj bodova :");
		bodovi=scan.nextInt();
		if(bodovi>=0 && bodovi<=100) {
			if(bodovi<50) {
				System.out.print("Korisnik nije polozio ispit!");
			}
			else {
				if(bodovi<60) {
					System.out.print("Ocjena 6");
				}
				else {
					if(bodovi<70) {
						System.out.print("Ocjena 7");
					}
					else {
						if(bodovi<80) {
							System.out.print("Ocjena 8");
						}
						else {
							if(bodovi<90) {
								System.out.print("Ocjena 9");
							}
							else {
								System.out.print("Ocjena 10");
							}
							}
						}
					}
				}
			}
		else {
			System.out.print("Niste dobro unijeli broj bodova! (bodovi moraju biti izmedju 0-100)");
		}
		scan.close();
		}

	}
*/


/*Napisati metode koja vraca rezultat sabiranja dva cijela ili decimalna broja. 
  Poziv metode sabiranje(2, 4) treba da vrati 6.
  Poziv metode sabiranje(2.0, 4.00) treba da vrati 6.0.
*/
public class Lekcija6_3 {
	public static int sabiranje(int broj1, int broj2) {
		return broj1+broj2;
	};
	public static double sabiranje(double broj1, double broj2) {
		return broj1+broj2;
	}
	public static void main(String[] args) {
		System.out.println(sabiranje(2,4));
		System.out.println(sabiranje(2.0,4.00));
	}

}

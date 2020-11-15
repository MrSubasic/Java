/*Napisati metodu koja ispisuje cijeli broj naopako. 
	public static void naopako(int broj)
	public static int naopako(int broj)
Pozive metode naopako(3456) treba da vrati vrijednost 6543.
*/
public class Lekcija6_4 {
	public static void naopako(int broj) {
		int rezultat,a,b,c,d;
		d=broj%10;
		c=(broj%100 - d)/10;
		b=(broj%1000-d-c*10)/100;
		a=(broj-b*100-c*10-d)/1000;
		rezultat=d*1000+c*100+b*10+a;
		System.out.print("Napopak broj unesenog broja je "+rezultat);
	}
	public static int naopako1(int broj) {
		int rezultat,a,b,c,d;
		d=broj%10;
		c=(broj%100 - d)/10;
		b=(broj%1000-d-c*10)/100;
		a=(broj-b*100-c*10-d)/1000;
		rezultat=d*1000+c*100+b*10+a;
		return rezultat;
	}
	public static void main(String[] args) {
		naopako(3456);
		System.out.print("\n"+naopako1(3456));

	}

}

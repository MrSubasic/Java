//Napisati program koji ucitava cijeli broj izmedu 0 i 999 te sabira sve cifre cijelog broja. 
import java.util.Scanner;
public class Lekcija2_6 {

	public static void main(String[] args) {
		int zbir,broj,a,b,c; /*abc format trocifrenog broja*/
		Scanner scan = new Scanner(System.in);
		System.out.print("Unesite trocifen broj :");
		broj = scan.nextInt();
		c=broj%10;
		b=(broj%100 - c)/10;
		a=(broj-c-b*10)/100;
		zbir=a+b+c;
		System.out.println("Zbir cifara unesenog trocifenog broja je : "+zbir);
		scan.close();
		
		
	}

}

import java.util.Scanner;
public class Lekcija4_2 {

	public static void main(String[] args) {
		int a=1;
		Scanner scan=new Scanner(System.in);
		while(a!=0) {
			System.out.println("Unesite cijeli broj (Za izlaz iz petlje unesite 0): ");
			a=scan.nextInt();	
		}
		scan.close();
	}
}

// Izracunavanje BMI-a
import java.util.Scanner;
public class Lekcija3_6 {

	public static void main(String[] args) {
		double tezina,visina,bmi;
		Scanner scan=new Scanner(System.in);
		System.out.print("Unesite visinu :");
		visina=scan.nextDouble();
		System.out.print("Unesite tezinu :");
		tezina=scan.nextDouble();
		bmi=(tezina/(visina*visina))*10000;
		if(bmi<18.5) {
			System.out.print("Pothranjenost");
		}
		else {
			if(bmi<25) {
				System.out.print("Normalan BMI");
			}
			else {
				if(bmi<30) {
					System.out.print("Gojaznost");
				}
				else {
					System.out.print("Pretilost");
				}
			}
		}
	   scan.close();
	}
	

}

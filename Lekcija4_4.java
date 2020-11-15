/*Napisati program koji simulira bacanje kovanice milion puta te ispisuje korisniku koliko puta je 
  novcic pao na glavu a koliko puta na pismo.*/
public class Lekcija4_4 {

	public static void main(String[] args) {
		int glava=0,pismo=0;
		for(int i=1;i<=1000000;i++) {
			int a=(int)(Math.random()*2);
			if (a==0) {glava++;};
			if (a==1) {pismo++;};
		}
	    System.out.print("Pismo "+pismo+". Glava "+glava+" .");
	}

}

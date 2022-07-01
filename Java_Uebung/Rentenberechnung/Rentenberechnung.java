import java.util.Scanner;
import java.lang.Math;
public class Rentenberechnung {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double sparbetrag;
		double dauer;
        double zins;
     double sparbetrag2;
     double betrag=0;
     double Ergebnis;
     sparbetrag=scan.nextDouble();
     dauer=scan.nextDouble();
     zins=scan.nextDouble();
     sparbetrag=sparbetrag*100;
     sparbetrag2=0;
     for(int i=1;i<=dauer;i++) {
         sparbetrag2=Math.round(sparbetrag+sparbetrag2);
    	 betrag=sparbetrag2*zins*0.01;
    	 sparbetrag2=Math.round(betrag+sparbetrag2);
     }
     sparbetrag2=sparbetrag2/100;
    System.out.println(sparbetrag2);
 
     
	}

}

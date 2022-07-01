import java.util.Scanner;
public class Aufgabe4c {
	public static void main(String[] args) {
		int k;
		int summe;
		summe = 0;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Geben Sie eine positive ganze Zahl k ein!");
		k = Scan.nextInt();
		if (k<0) {
			System.out.println("Falsche Eingabe für die Zahl k!");
		} else {
			for(int i=1;i<=k;i++) {
				summe=summe+2*i-1;
			}
			System.out.println("Die Summe beträgt: " + summe);
		}
	Scan.close();
	}
}

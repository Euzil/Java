import java.util.Scanner;
public class Aufgabe4amitWhileSchleife {
	public static void main(String[] args) {
		int m;
		int summe;
		int zaehler;
		summe = 0;
		zaehler = 1;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Geben Sie eine ungerade positive Zahl ein!");
		m = Scan.nextInt();
		if ((m<0)||(m%2==0)) {
			System.out.println("Falsche Eingabe für die Zahl m!");
		} else {
			while (zaehler<=m) {
				summe=summe+zaehler;
				zaehler=zaehler+2;
			}
			System.out.println("Die Summe beträgt: " + summe);
		}
	Scan.close();
	}
}

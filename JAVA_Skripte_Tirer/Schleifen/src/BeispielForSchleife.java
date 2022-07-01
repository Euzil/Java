import java.util.Scanner;
public class BeispielForSchleife {
/* Einfaches Beispiel für eine For Schleife */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int n;
		int Summe;
		System.out.println("Geben Sie eine natürliche Zahl ein!");
		n = Scan.nextInt();
		Summe = 0;
		for (int zaehler=1;zaehler <= n;zaehler++) {
			Summe = Summe + zaehler;
			}
		System.out.println("Die Summe der ersten " + n + " beträgt: " + Summe);
		Scan.close();
	}

}

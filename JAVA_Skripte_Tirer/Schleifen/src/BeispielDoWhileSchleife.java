import java.util.Scanner;
public class BeispielDoWhileSchleife {
/* Einfaches Beispiel für eine Do/While Schleife */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int n;
		int Summe;
		int zaehler;
		System.out.println("Geben Sie eine natürliche Zahl ein!");
		n = Scan.nextInt();
		Summe = 0;
		zaehler = 1;
		do {
			Summe = Summe + zaehler;
			zaehler = zaehler + 1;
		} while (zaehler <=n);
		System.out.println("Die Summe der ersten " + n + " beträgt: " + Summe);
		Scan.close();
	}

}

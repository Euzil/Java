import java.util.Scanner;
public class BeispielDoWhileSchleife {
/* Einfaches Beispiel f�r eine Do/While Schleife */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int n;
		int Summe;
		int zaehler;
		System.out.println("Geben Sie eine nat�rliche Zahl ein!");
		n = Scan.nextInt();
		Summe = 0;
		zaehler = 1;
		do {
			Summe = Summe + zaehler;
			zaehler = zaehler + 1;
		} while (zaehler <=n);
		System.out.println("Die Summe der ersten " + n + " betr�gt: " + Summe);
		Scan.close();
	}

}

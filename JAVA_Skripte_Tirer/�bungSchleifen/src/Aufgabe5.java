import java.util.Scanner;
public class Aufgabe5 {
	public static void main(String[] args) {
		int m;
		int summe;
		int z�hler;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Geben Sie eine positive ganze Zahl ein!");
		m = Scan.nextInt();
		summe = 0;
		z�hler = 1;
		if (m<=0) {
			System.out.println("Falsche Eingabe!");
		} else {
			while (z�hler<=m) {
				summe = summe + z�hler*z�hler;
				z�hler = z�hler +1;
			}
			System.out.println("Die Summe betr�gt: " + summe);
		}
	Scan.close();
	}
}

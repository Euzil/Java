import java.util.Scanner;
public class Aufgabe5 {
	public static void main(String[] args) {
		int m;
		int summe;
		int zähler;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Geben Sie eine positive ganze Zahl ein!");
		m = Scan.nextInt();
		summe = 0;
		zähler = 1;
		if (m<=0) {
			System.out.println("Falsche Eingabe!");
		} else {
			while (zähler<=m) {
				summe = summe + zähler*zähler;
				zähler = zähler +1;
			}
			System.out.println("Die Summe beträgt: " + summe);
		}
	Scan.close();
	}
}

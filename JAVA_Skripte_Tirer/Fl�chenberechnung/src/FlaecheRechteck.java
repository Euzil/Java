import java.util.Scanner;
public class FlaecheRechteck {
/* Programm, das die Fläche eines Rechtecks berechnet */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		/* Deklaration der Variablen */
		double a;
		double b;
		double ARechteck;
		/* Eingabe der Seiten des Rechtecks */
		System.out.println("Geben Sie die Länge der Seite a ein: ");
		a = Scan.nextDouble();
		System.out.println("Geben Sie die Länge der Seite b ein:");
		b= Scan.nextDouble();
		/* Die Flächenberechnung */
		ARechteck = a*b;
		/* Ausgabe der errechneten Fläche */
		System.out.println("Die Fläche des Rechtecks beträgt:" + ARechteck);
		Scan.close();
	}

}

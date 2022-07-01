import java.util.Scanner;
public class FlaecheDreieck {
	/* Programm berechnet Fläche eines Dreiecks */
	public static void main(String[] args) {
		/* Deklaration der Variablen */
		double s;
		double h;
		double ADreieck;
		/* Eingabe der Seite und Höhe des Dreiecks */
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie die Seitenlänge der Grundseite an:");
		s = scan.nextDouble();
		System.out.println("Geben Sie die Höhe des Dreiecks ein:");
		h = scan.nextDouble();
		/* Berechnung der Fläche des Dreiecks */
		ADreieck = 0.5*s*h;
		/* Ausgabe der Dreiecksfläche */
		System.out.println("Fläche des Dreiecks beträgt: " + ADreieck);
		scan.close();
	}
}
import java.util.Scanner;
public class FlaecheDreieck {
	/* Programm berechnet Fl�che eines Dreiecks */
	public static void main(String[] args) {
		/* Deklaration der Variablen */
		double s;
		double h;
		double ADreieck;
		/* Eingabe der Seite und H�he des Dreiecks */
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie die Seitenl�nge der Grundseite an:");
		s = scan.nextDouble();
		System.out.println("Geben Sie die H�he des Dreiecks ein:");
		h = scan.nextDouble();
		/* Berechnung der Fl�che des Dreiecks */
		ADreieck = 0.5*s*h;
		/* Ausgabe der Dreiecksfl�che */
		System.out.println("Fl�che des Dreiecks betr�gt: " + ADreieck);
		scan.close();
	}
}
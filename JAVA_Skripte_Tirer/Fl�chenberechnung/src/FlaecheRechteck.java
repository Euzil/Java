import java.util.Scanner;
public class FlaecheRechteck {
/* Programm, das die Fl�che eines Rechtecks berechnet */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		/* Deklaration der Variablen */
		double a;
		double b;
		double ARechteck;
		/* Eingabe der Seiten des Rechtecks */
		System.out.println("Geben Sie die L�nge der Seite a ein: ");
		a = Scan.nextDouble();
		System.out.println("Geben Sie die L�nge der Seite b ein:");
		b= Scan.nextDouble();
		/* Die Fl�chenberechnung */
		ARechteck = a*b;
		/* Ausgabe der errechneten Fl�che */
		System.out.println("Die Fl�che des Rechtecks betr�gt:" + ARechteck);
		Scan.close();
	}

}

import java.util.Scanner;
public class FlaecheParallelogramm {
/* Programm, das die Fläche eines Parallelogramms berechnet */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		/* Deklaration der Variablen */
		double a;
		double ha;
		double AParallelogramm;
		/* Eingabe der Seite a und zugehörige Höhe ha */
		System.out.println("Geben Sie die Länge der Seite a ein: ");
		a = Scan.nextDouble();
		System.out.println("Geben Sie die zur Seite gehörige Höhe ha ein:");
		ha= Scan.nextDouble();
		/* Die Flächenberechnung */
		AParallelogramm = a*ha;
		/* Ausgabe der errechneten Fläche */
		System.out.println("Die Fläche des Parllelogramms beträgt:" + AParallelogramm);
		Scan.close();
	}
}

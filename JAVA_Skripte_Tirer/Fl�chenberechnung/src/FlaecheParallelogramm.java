import java.util.Scanner;
public class FlaecheParallelogramm {
/* Programm, das die Fl�che eines Parallelogramms berechnet */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		/* Deklaration der Variablen */
		double a;
		double ha;
		double AParallelogramm;
		/* Eingabe der Seite a und zugeh�rige H�he ha */
		System.out.println("Geben Sie die L�nge der Seite a ein: ");
		a = Scan.nextDouble();
		System.out.println("Geben Sie die zur Seite geh�rige H�he ha ein:");
		ha= Scan.nextDouble();
		/* Die Fl�chenberechnung */
		AParallelogramm = a*ha;
		/* Ausgabe der errechneten Fl�che */
		System.out.println("Die Fl�che des Parllelogramms betr�gt:" + AParallelogramm);
		Scan.close();
	}
}

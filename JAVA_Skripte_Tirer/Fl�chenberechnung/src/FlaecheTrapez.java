import java.util.Scanner;
public class FlaecheTrapez {
/* Programm, das die Fl�che eines Trapez berechnet */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		/* Deklaration der Variablen */
		double a;
		double b;
		double h;
		double ATrapez;
		/* Eingabe der Seiten des Trapez */
		System.out.println("Geben Sie die L�nge der Seite a ein: ");
		a = Scan.nextDouble();
		System.out.println("Geben Sie die L�nge der Seite b ein:");
		b= Scan.nextDouble();
		System.out.println("Geben Sie die H�he h ein:");
		h= Scan.nextDouble();
		/* Die Fl�chenberechnung */
		ATrapez = 0.5*(a+b)*h;
		/* Ausgabe der errechneten Fl�che */
		System.out.println("Die Fl�che des Trapez betr�gt:" + ATrapez);
		Scan.close();
	}

}

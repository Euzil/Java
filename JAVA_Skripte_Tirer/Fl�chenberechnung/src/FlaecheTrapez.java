import java.util.Scanner;
public class FlaecheTrapez {
/* Programm, das die Fläche eines Trapez berechnet */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		/* Deklaration der Variablen */
		double a;
		double b;
		double h;
		double ATrapez;
		/* Eingabe der Seiten des Trapez */
		System.out.println("Geben Sie die Länge der Seite a ein: ");
		a = Scan.nextDouble();
		System.out.println("Geben Sie die Länge der Seite b ein:");
		b= Scan.nextDouble();
		System.out.println("Geben Sie die Höhe h ein:");
		h= Scan.nextDouble();
		/* Die Flächenberechnung */
		ATrapez = 0.5*(a+b)*h;
		/* Ausgabe der errechneten Fläche */
		System.out.println("Die Fläche des Trapez beträgt:" + ATrapez);
		Scan.close();
	}

}

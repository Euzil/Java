import java.util.Scanner;
public class FlaecheKreis {
/* Programm, das die Fläche eines Kreises berechnet */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		/* Deklaration der Variablen */
		double r;
		double AKreis;
		/* Eingabe des Radiuses des Kreises */
		System.out.println("Geben Sie die Länge des Kreisradius ein: ");
		r = Scan.nextDouble();
		/* Die Flächenberechnung */
		AKreis = r*r*Math.PI;
		/* Ausgabe der errechneten Fläche */
		System.out.println("Die Fläche des Kreises beträgt:" + AKreis);
		Scan.close();
	}

}

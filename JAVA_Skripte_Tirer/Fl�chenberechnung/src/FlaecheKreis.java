import java.util.Scanner;
public class FlaecheKreis {
/* Programm, das die Fl�che eines Kreises berechnet */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		/* Deklaration der Variablen */
		double r;
		double AKreis;
		/* Eingabe des Radiuses des Kreises */
		System.out.println("Geben Sie die L�nge des Kreisradius ein: ");
		r = Scan.nextDouble();
		/* Die Fl�chenberechnung */
		AKreis = r*r*Math.PI;
		/* Ausgabe der errechneten Fl�che */
		System.out.println("Die Fl�che des Kreises betr�gt:" + AKreis);
		Scan.close();
	}

}

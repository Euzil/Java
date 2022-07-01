import java.util.Scanner;
public class AufgabeIfNr21 {
/* Aufgabe If-Anweisung - Nr. 2 */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		/* Deklaration der Variablen */
		double zahl;
		/* Eingabe der Variablen n1 */
		System.out.println("Geben Sie die Variable zahl ein:");
		zahl = Scan.nextDouble();
		if (zahl>0){
			zahl = zahl*113/100;
		}
		System.out.println("Der Wert von zahl beträgt: " + zahl);
		Scan.close();
	}
}

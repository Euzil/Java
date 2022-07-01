import java.util.Scanner;
public class ZahlPositivNegativNull {
/* Aufgabe If-Anweisung - Nr. 10 */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		/* Deklaration der Variablen */
		double zahl;
		/* Eingabe der Variablen n1 */
		System.out.println("Geben Sie die Variable zahl ein:");
		zahl = Scan.nextDouble();
		if (zahl>0){
			System.out.println("Die eingegebene Zahl ist positiv!");
			} else if (zahl==0) {
				System.out.println("Die eingegebene Zahl ist gleich Null!");
				} else {
					System.out.println("Die eingegebene Zahl ist negativ!");
					}
		Scan.close();
	}
}

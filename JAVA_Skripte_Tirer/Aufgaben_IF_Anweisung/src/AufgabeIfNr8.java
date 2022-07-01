import java.util.Scanner;
public class AufgabeIfNr8 {
/* Aufgabe If-Anweisung - Nr. 8 */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		/* Deklaration der Variablen */
		int n1,n2,n3;
		int zmax2;
		/* Eingabe der Variablen n1,n2 */
		System.out.println("Geben Sie die Variable n1 ein:");
		n1 = Scan.nextInt();
		System.out.println("Geben Sie die Variable n2 ein:");
		n2 = Scan.nextInt();
		System.out.println("Geben Sie die Variable n3 ein:");
		n3 = Scan.nextInt();
		zmax2 = Math.max(n1,Math.max(n2, n3));
		System.out.println("Der Wert von n1 beträgt: " + zmax2);
		Scan.close();
	}
}

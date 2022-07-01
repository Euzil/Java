import java.util.Scanner;
public class AufgabeIfNr9 {
/* Aufgabe If-Anweisung - Nr. 9 */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		/* Deklaration der Variablen */
		int n1,n2,n3,n4,n5;
		int zmax3;
		/* Eingabe der Variablen n1,n2 */
		System.out.println("Geben Sie die Variable n1 ein:");
		n1 = Scan.nextInt();
		System.out.println("Geben Sie die Variable n2 ein:");
		n2 = Scan.nextInt();
		System.out.println("Geben Sie die Variable n3 ein:");
		n3 = Scan.nextInt();
		System.out.println("Geben Sie die Variable n4 ein:");
		n4 = Scan.nextInt();
		System.out.println("Geben Sie die Variable n5 ein:");
		n5 = Scan.nextInt();
		zmax3 = Math.max(n1,Math.max(n2,Math.max(n3,Math.max(n4, n5))));
		System.out.println("Der Wert von n1 beträgt: " + zmax3);
		Scan.close();
	}
}

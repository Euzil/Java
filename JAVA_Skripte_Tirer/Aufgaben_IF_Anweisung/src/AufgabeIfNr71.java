import java.util.Scanner;
public class AufgabeIfNr71 {
/* Aufgabe If-Anweisung - Nr. 71 */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		/* Deklaration der Variablen */
		int n1,n2;
		int zmax1;
		/* Eingabe der Variablen n1,n2 */
		System.out.println("Geben Sie die Variable n1 ein:");
		n1 = Scan.nextInt();
		System.out.println("Geben Sie die Variable n2 ein:");
		n2 = Scan.nextInt();
		zmax1=Math.max(n1,n2); /* Maximum ohne If-Anweisung */
		System.out.println("Der Wert von n1 beträgt: " + zmax1);
		Scan.close();
	}
}

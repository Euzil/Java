import java.util.Scanner;
public class AufgabeIfNr7 {
/* Aufgabe If-Anweisung - Nr. 7 */
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
		if (n1 > n2){
			zmax1 = n1;
		} else {
			zmax1 = n2;
		}
		System.out.println("Der Wert von n1 beträgt: " + zmax1);
		Scan.close();
	}
}

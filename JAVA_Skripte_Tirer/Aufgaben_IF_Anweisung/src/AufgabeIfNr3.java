import java.util.Scanner;
public class AufgabeIfNr3 {
/* Aufgabe If-Anweisung - Nr. 3 */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		/* Deklaration der Variablen */
		int n1;
		int m;
		/* Eingabe der Variablen n1 */
		System.out.println("Geben Sie die Variable n1 ein:");
		n1 = Scan.nextInt();
		m = n1%2;
		if (m==0){
			n1 = n1/2;
		} else {
			n1 = n1*2;
		}
		System.out.println("Der Wert von n1 beträgt: " + n1);
		Scan.close();
	}
}

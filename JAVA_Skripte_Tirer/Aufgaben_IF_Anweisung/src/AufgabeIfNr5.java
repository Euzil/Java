import java.util.Scanner;
public class AufgabeIfNr5 {
/* Aufgabe If-Anweisung - Nr. 5 */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		/* Deklaration der Variablen */
		int n1;
		/* Eingabe der Variablen n1 */
		System.out.println("Geben Sie die Variable n1 ein:");
		n1 = Scan.nextInt();
		if (n1 != 0){
			if (n1<0) {
			n1 = n1+1;
		} else {
			n1 = n1-1;
		}
		}	
		System.out.println("Der Wert von n1 beträgt: " + n1);
		Scan.close();
	}
}

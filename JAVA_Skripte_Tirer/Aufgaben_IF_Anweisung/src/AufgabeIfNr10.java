import java.util.Scanner;
public class AufgabeIfNr10 {
/* Aufgabe If-Anweisung - Nr. 10 */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		/* Deklaration der Variablen */
		double n1;
		/* Eingabe der Variablen n1 */
		System.out.println("Geben Sie die Variable n1 ein:");
		n1 = Scan.nextDouble();
		if (n1>1000){
			n1 = n1*94/100;
			} else if (n1>500) {
				n1 = n1*95/100;
				} else if (n1>100) {
					n1 = n1*97/100;
					}
		System.out.println("Der Wert von n1 beträgt: " + n1);
		Scan.close();
	}
}

import java.util.Scanner;
public class ArraysDurchsuchen {
/* Aufgabe 2) */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		double [ ] Array = new double[10];
		double gesuchteZahl;
		int anzahl;
		anzahl = 0;
		System.out.println("Geben Sie die Koordinanten des Arrays ein:");
		for (int i=1;i<=10;i++) {
			System.out.println("Geben Sie die " + i + "-te Komponente des Array ein:");
			Array[i-1] =Scan.nextDouble();
		}
		System.out.println("Geben Sie die gesuchte Zahl ein!");
		gesuchteZahl = Scan.nextDouble();
		for (int i=1;i<=10;i++) {
			if (Array[i-1]==gesuchteZahl) {
				anzahl = anzahl+1;
			} 
		}
		if (anzahl>0) {
			System.out.println("Die gesuchte Zahl ist im Array mit der Häufigkeit: " + anzahl);
		} else {
			System.out.println("Die gesuchte Zahl ist nicht im Array.");
		}
	Scan.close();
	}

}

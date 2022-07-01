import java.util.Scanner;
public class AnzahlPositiverNegativerZahlen {
/* Aufgabe 1) */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int [ ] Array = new int[10];
		int anzahlpositiv;
		int anzahlnegativ;
		int anzahlnull;
		anzahlnull = 0;
		anzahlpositiv = 0;
		anzahlnegativ = 0;
		System.out.println("Geben Sie die Koordinanten des Arrays ein:");
		for (int i=1;i<11;i++) {
			System.out.println("Geben Sie die " + i + "-te Komponente des Arrays ein:");
			Array[i-1] =Scan.nextInt();
		}
		for (int i = 1; i <=10; i ++) {
			if (Array[i-1]==0) {
				anzahlnull = anzahlnull+1;
			} else {
				if (Array[i-1] > 0) {
					anzahlpositiv = anzahlpositiv+1;
				} else {
					anzahlnegativ = anzahlnegativ+1;
				}
			}
		}
		System.out.println("Die Anzahl an Nullen beträgt: " + anzahlnull);
		System.out.println("Die Anzahl positiver Zahlen beträgt: " + anzahlpositiv);
		System.out.println("Die Anzahl negativer Zahlen beträgt: " + anzahlnegativ);
	Scan.close();
	}

}

import java.util.Scanner;
public class PrimzahlTest2 {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int m;
		int zaehler;
		zaehler = 0;
		System.out.println("Geben Sie eine natürliche Zahl ein!");
		m = Scan.nextInt();
		if (m >=2) {
			for (int k=2;k<m;k++){
				if (m%k == 0) {
					zaehler = zaehler + 1;
				} 
			} 
		} else {
			zaehler = 1;
			}
		if (zaehler > 0) {
			System.out.println("Die eingegebene Zahl " + m + " ist keine Primzahl.");
		} else {
			System.out.println("Die eingegebene Zahl " + m + " ist eine Primzahl.");
		}
	Scan.close();
	}
}

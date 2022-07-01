import java.util.Scanner;
public class AufgabeWhileSchleife {
	public static void main(String[] args) {
		int m;
		int zähler;
		zähler=1;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Geben Sie die Zahl m ein!");
		m = Scan.nextInt();
		if (m<1) {
			System.out.println("Zahl m hat einen falschen Wert!");
		} else {
			while (zähler<=m) {
				System.out.println("Der von 2 hoch " + zähler + " beträgt: " + Math.pow(2,zähler));
			zähler = zähler + 1;
			}
		}
	Scan.close();
	}
}

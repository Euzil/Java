import java.util.Scanner;
public class AufgabeWhileSchleife {
	public static void main(String[] args) {
		int m;
		int z�hler;
		z�hler=1;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Geben Sie die Zahl m ein!");
		m = Scan.nextInt();
		if (m<1) {
			System.out.println("Zahl m hat einen falschen Wert!");
		} else {
			while (z�hler<=m) {
				System.out.println("Der von 2 hoch " + z�hler + " betr�gt: " + Math.pow(2,z�hler));
			z�hler = z�hler + 1;
			}
		}
	Scan.close();
	}
}

import java.util.Scanner;
public class Aufgabe3mitWhileSchleife {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int n;
		int fakultaet;
		fakultaet = 1;
		int z�hler; 
		z�hler = 1;
		System.out.println("Geben Sie die Zahl n ein!");
		n = Scan.nextInt();
		if (n<=0) {
			System.out.println("Falsche Eingabe f�r die Zahl n!");
		} else {
			while (z�hler<=n){
				fakultaet = fakultaet * z�hler;
				z�hler = z�hler+1;
			}
		System.out.println("Die Fakult�t von n betr�gt: " + fakultaet);
		}
	Scan.close();
	}
}

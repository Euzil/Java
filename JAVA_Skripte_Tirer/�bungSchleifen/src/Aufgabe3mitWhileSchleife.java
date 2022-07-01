import java.util.Scanner;
public class Aufgabe3mitWhileSchleife {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int n;
		int fakultaet;
		fakultaet = 1;
		int zähler; 
		zähler = 1;
		System.out.println("Geben Sie die Zahl n ein!");
		n = Scan.nextInt();
		if (n<=0) {
			System.out.println("Falsche Eingabe für die Zahl n!");
		} else {
			while (zähler<=n){
				fakultaet = fakultaet * zähler;
				zähler = zähler+1;
			}
		System.out.println("Die Fakultät von n beträgt: " + fakultaet);
		}
	Scan.close();
	}
}

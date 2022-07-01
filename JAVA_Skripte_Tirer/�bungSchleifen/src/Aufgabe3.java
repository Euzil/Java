import java.util.Scanner;
public class Aufgabe3 {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int n;
		int fakultaet;
		fakultaet = 1;
		System.out.println("Geben Sie die Zahl n ein!");
		n = Scan.nextInt();
		if (n<=0) {
			System.out.println("Falsche Eingabe für die Zahl n!");
		} else {
			for (int i=1;i<=n;i++) {
				fakultaet = fakultaet * i;
			}
		System.out.println("Die Fakultät von n beträgt: " + fakultaet);
		}
	Scan.close();
	}

}

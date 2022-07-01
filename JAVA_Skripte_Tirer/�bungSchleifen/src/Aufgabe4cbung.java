import java.util.Scanner;
public class Aufgabe4cbung {
	public static void main(String[] args) {
		int m;
		int k;
		int summe;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Geben Sie eine postive ungerade Zahl m ein!");
		m = Scan.nextInt();
		summe = 0;
		if ((m>=1)&&(m%2!=0)) {
			k = (m + 1)/ 2;
			summe = k * k;
			System.out.println("Die Summe beträgt: " + summe);
		} else {
			System.out.println("Falsche Eingabe für Zahl m!");
		}
	Scan.close();
	}
}

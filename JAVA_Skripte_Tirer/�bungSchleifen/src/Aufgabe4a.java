import java.util.Scanner;
public class Aufgabe4a {
	public static void main(String[] args) {
		int m;
		int summe;
		summe = 0;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Geben Sie eine ungerade positive Zahl ein!");
		m = Scan.nextInt();
		if ((m<0)||(m%2==0)) {
			System.out.println("Falsche Eingabe für die Zahl m!");
		} else {
			for(int i=1;i<=m;i=i+2) {
				summe=summe+i;
			}
			System.out.println("Die Summe beträgt: " + summe);
		}
	Scan.close();
	}
}

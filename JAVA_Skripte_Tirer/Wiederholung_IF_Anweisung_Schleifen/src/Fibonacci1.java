import java.util.Scanner;
public class Fibonacci1 {
/* Lösung mit Hilfe einer While-Schleife */
	public static void main(String[] args) {
		int n;
		int zaehler;
		int fn1;
		int fn2;
		int fn;
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie die ganze Zahl n ein!");
		n = scan.nextInt();
		zaehler = 1;
		fn1 = 1;
		fn2 = 1;
		fn = 0;
		if (n<=0) {
			System.out.println("Falsche Eingabe!");
		} else {
			while (zaehler<=n-2){
				fn = fn1 + fn2;
				fn2 = fn1;
				fn1 = fn;
				zaehler = zaehler + 1;
			}
			System.out.println("Die " + n + "-te Fibonacci-Zahl beträgt: " + fn);
		}
		scan.close();
	}
}
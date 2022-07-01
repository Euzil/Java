import java.util.Scanner;
public class SummeNatuerlicherZahlen {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int gu,go;
		int Summe;
		Summe = 0;
		System.out.println("Geben Sie die untere Grenze gu an!");
		gu = Scan.nextInt();
		System.out.println("Geben Sie die obere Grenze go an!");
		go = Scan.nextInt();
		if ((go > gu) && (gu >= 0)) {
			for (int i = gu;i <= go; i++) {
				Summe = Summe + i;
			}
			System.out.println("Die Summe beträgt: " + Summe);
		} else {
			System.out.println("Fehlerhafte Eingabe!");
		}
	Scan.close();
	}

}

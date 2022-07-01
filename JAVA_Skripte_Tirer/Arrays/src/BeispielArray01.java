import java.util.Scanner;
public class BeispielArray01 {
	public static void main(String[] args) {
		double []Array = new double[10];
		double []Ergebnisarray = new double[10];
		Scanner Scan = new Scanner(System.in);
		for (int i=1;i<=10;i++) {
			System.out.println("Geben Sie die " + i + " Komponente des Arrays ein!");
			Array[i-1]=Scan.nextDouble();
		}
		for (int i=1;i<=10;i++) {
			Ergebnisarray[i-1]=Array[i-1]*2;
		}
		for (int i=1;i<=10;i++) {
			System.out.println("Das Ergebnis in der " + i + " Komponente beträgt: " + Ergebnisarray[i-1]);
		}
	Scan.close();
	}
}


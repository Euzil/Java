import java.util.Scanner;
public class Aufgabe2 {
	public static void main(String[] args) {
		int m;
		int i;
		int zweierpotenz;
		zweierpotenz = 1;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Geben Sie die Zahl m ein!");
		m = Scan.nextInt();
		if (m<1) {
			System.out.println("Die Zahl m hat einen falschen Wert!");
		} else {
			for(i=1;i<=m;i++) {
				zweierpotenz=zweierpotenz*2;
				System.out.println("Die 2 hoch " + i + " hat den Wert: " + zweierpotenz);
			}
		}
	Scan.close();
	}
}

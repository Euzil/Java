public class Aufgabe1WhileSchleife {
	public static void main(String[] args) {
		int zähler;
		zähler = 10;
		while (zähler<=40) {
			if (zähler%3==0) {
				System.out.println("Die Zahl " + zähler + " ist teilbar durch 3.");
			}
			zähler=zähler+1;
		}
	}
}

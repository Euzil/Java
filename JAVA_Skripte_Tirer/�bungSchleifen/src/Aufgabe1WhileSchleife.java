public class Aufgabe1WhileSchleife {
	public static void main(String[] args) {
		int z�hler;
		z�hler = 10;
		while (z�hler<=40) {
			if (z�hler%3==0) {
				System.out.println("Die Zahl " + z�hler + " ist teilbar durch 3.");
			}
			z�hler=z�hler+1;
		}
	}
}

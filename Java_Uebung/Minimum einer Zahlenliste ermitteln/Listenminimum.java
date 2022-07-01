import java.util.Scanner;

class Listenminimum {
    public static void main(String[] args) {
        // Lese die Anzahl der Zahlen ein
        Scanner scanner = new Scanner(System.in);
        int anzahl = scanner.nextInt();
        
        // Deklariere ein Array der passenden Groesse
        int[] zahlen = new int[anzahl];
        
        // Lese die einzelnen Zahlen ein
        for (int i = 0; i < anzahl; i++) {
            zahlen[i] = scanner.nextInt();
        }
        
        // *** Fuegen Sie hier Ihre Loesung ein:
        int Mini;
        Mini=zahlen[0];
                for(int i = 1; i < anzahl; i++) {
                	if(Mini>zahlen[i]) {
                		Mini=zahlen[i];
                	}
                }
          System.out.println(Mini);


    }
}

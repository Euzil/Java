import java.util.Scanner;

public class StringInspector {
    public static void main(String[] args) {
        // Eingabe der Testfaelle einlesen
        Scanner s = new Scanner(System.in);

        String eingabeEins = s.nextLine();
        String eingabeZwei = s.nextLine();

        // Deklariere die Ergebnisvariablen.
        String schrittEins;
        String schrittZwei;
        String schrittDrei;
        String schrittVier;
        String schrittFuenf;

        // *** Fuegen Sie hier Ihre Loesung ein:
       schrittEins ="Eingaben: \""+eingabeEins+"\", \""+eingabeZwei+"\"";
        int a =eingabeEins.length();
        int b =eingabeZwei.length();
        int c =a+b;
        schrittZwei="Längen: " +a+", " +b+", Summe: "  +c;
        char Char1=eingabeEins.charAt(0);
        char Char2=eingabeEins.charAt(a-1);
        char Char3=eingabeZwei.charAt(0);
        char Char4=eingabeZwei.charAt(b-1);
        schrittDrei="Umpaare: " +Char1+Char2+", "+Char3+Char4;
        String M=eingabeEins.substring(1,a-1);
        schrittVier="Mitte der ersten Eingabe: " +M;
        boolean cont2=eingabeEins.contains(eingabeZwei);
        int cont1=eingabeEins.indexOf(Char3);
        schrittFuenf="Zusammenhang: " +cont2+", " +cont1;



        // Gib das Ergebnis aus, damit der Testfall es untersuchen kann.
        System.out.println(schrittEins);
        System.out.println(schrittZwei);
        System.out.println(schrittDrei);
        System.out.println(schrittVier);
        System.out.println(schrittFuenf);
    }
}

public class Eingabe{
  public static void main(String[] args) throws java.io.IOException{
   System.out.println ("Drücken Sie eine beliebige Taste (gefolgt von <Enter>):");
       char taste = (char)System.in.read();
System.out.println ("Sie haben die folgende Taste gedrückt: " + taste);
}
}

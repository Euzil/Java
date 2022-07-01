import java.util.Scanner;
import java.lang.Math;

public class Skyliner {
    public static void main(String[] args) {
        // Lese die Parameter für diese Stadt ein.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = scanner.nextInt();
        
        // Lasse die Skyline für diese Parameter zeichnen.
        maleSkyline(a, b, max);
    }
    
    // *** Fuegen Sie hier Ihre Loesung ein:
    public static double f(int a, int b, int x){
        double fab;
        fab=(0.6*a*Math.cos(Math.pow(x,b)))/(a+3*Math.sin(Math.pow(x,2)));
        if(fab<=0){
            System.out.print(",");
        }else if(fab>=1){
            System.out.print("^");
        }else{
            System.out.print("~");
        }
         return fab;
        }
    public static void maleSkyline(int a, int b, int max){
        for(int i=0;i<=max;i++){
            double maleSkyline=f(a,b,i);
            
        }
    }
    
    
}
import java.util.Scanner;

class GGT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // *** Fuegen Sie hier Ihre Loesung ein:
     Scanner scan = new Scanner(System.in);
     int x;
     x=scan.nextInt();
     int y;
     y=scan.nextInt();
     while(x!=y) {
    	 if(x<y) {
    		 y=y-x;
    	 }else {
    		 x=x-y;
    	 }
    	 
     }
     System.out.println(x);

    }
}

import java.util.Scanner;

class ListeSortieren {
    public static void main(String[] args) {
        // Deklariere ein Array mit 3 Zeichenketten.
        String[] nachnamen = new String[3];
        
        // Lese 3 Namen ein und speichere sie in dem Array.
        Scanner scanner = new Scanner(System.in);
        nachnamen[0] = scanner.nextLine();
        nachnamen[1] = scanner.nextLine();
        nachnamen[2] = scanner.nextLine();

        // *** Fuegen Sie hier Ihre Loesung ein:
                if(nachnamen[0].compareTo(nachnamen[1])>0) {
	        	String a=nachnamen[0];
	        	nachnamen[0]=nachnamen[1];
	        	nachnamen[1]=a;
	        	if(nachnamen[1].compareTo(nachnamen[2])>0) {
	        		String b=nachnamen[1];
		        	nachnamen[1]=nachnamen[2];
		        	nachnamen[2]=b;
		        	if(nachnamen[0].compareTo(nachnamen[1])>0) {
		        		String c=nachnamen[0];
			        	nachnamen[0]=nachnamen[1];
			        	nachnamen[1]=c;
		        	}
	        	}
	        	System.out.println(nachnamen[0]);
	        	System.out.println(nachnamen[1]);
	        	System.out.println(nachnamen[2]);
	        	System.out.println("sortiert");
	        }else if(nachnamen[1].compareTo(nachnamen[2])>0){
	        	String b=nachnamen[1];
	        	nachnamen[1]=nachnamen[2];
	        	nachnamen[2]=b;
	        	if(nachnamen[0].compareTo(nachnamen[1])>0) {
	        		String a=nachnamen[0];
		        	nachnamen[0]=nachnamen[1];
		        	nachnamen[1]=a;
	        	}
	        	System.out.println(nachnamen[0]);
	        	System.out.println(nachnamen[1]);
	        	System.out.println(nachnamen[2]);
	        	System.out.println("sortiert");
	        }else {
	            System.out.println(nachnamen[0]);
	        	System.out.println(nachnamen[1]);
	        	System.out.println(nachnamen[2]);
	        	System.out.println("sortiert");
	        }

    }
}

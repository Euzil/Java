import java.util.Scanner;

class MonateAusgeben {
    public static void main(String[] args) {
        // Lese eine Nummer eines Monats ein.
        Scanner scanner = new Scanner(System.in);
        int nummerMonat = scanner.nextInt();
            System.out.println(nummerMonat);
        // *** Fuegen Sie hier Ihre Loesung ein:
            String J ="Januar";
	        String F ="Februar";
	        String M ="März";
	        String A ="April";
	        String Ma ="Mai";
	        String Jun ="Juni";
	        String July ="Juli";
	        String Aug ="August";
	        String Sep ="September";
	        String Okt ="Oktober";
	        String Nov ="November";
	        String Dec ="Dezember";
	        if(nummerMonat==1) {
	        	System.out.println(J);
	        }else if(nummerMonat==2) {
	        	System.out.println(F);
	        }else if(nummerMonat==3) {
	        	System.out.println(M);
	        }else if(nummerMonat==4) {
	        	System.out.println(A);
	        }else if(nummerMonat==5) {
	        	System.out.println(Ma);
	        }else if(nummerMonat==6) {
	        	System.out.println(Jun);
	        }else if(nummerMonat==7) {
	        	System.out.println(July);
	        }else if(nummerMonat==8) {
	        	System.out.println(Aug);
	        }else if(nummerMonat==9) {
	        	System.out.println(Sep);
	        }else if(nummerMonat==10) {
	        	System.out.println(Okt);
	        }else if(nummerMonat==11) {
	        	System.out.println(Nov);
	        }else if(nummerMonat==12) {
	        	System.out.println(Dec);
	        }else {
	        	System.out.println("Kein gültiger Monat.");
	        }

    }
}

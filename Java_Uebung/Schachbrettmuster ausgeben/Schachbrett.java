import java.util.Scanner;
public class Schachbrett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
     int n;
     String g="##";
     String h="--";
     String z1 = "";
     String z2 = "";
     n=scan.nextInt();
     for(int a=1;a<=n;a++) {
    	 if(a%2!=0) {
    		  for(int i=1;i<=n;i++) {
    		    	 if(i%2==0) {
    		    		 z1=z1+h;
    		    	 }else {
    		    		 z1=z1+g;
    		    	 }
    		     }System.out.println(z1);
    		     z1="";
    	 }else {
    		 for(int i=1;i<=n;i++) {
    	    	 if(i%2==0) {
    	    		 z2=z2+g;
    	    	 }else {
    	    		 z2=z2+h;
    	    	 }
    	     }System.out.println(z2);
    	     z2="";
    	 }
    	 
    	 
     }
	}
}
     
     
	


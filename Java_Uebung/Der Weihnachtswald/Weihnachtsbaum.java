import java.util.Scanner;
public class Weihnachtsbaum {
	public int h;
	public Weihnachtsbaum(int Hoehe) {
		this.h=Hoehe;
	}
	public void Pflanze() {
		 for(int i=1;i<=h+2*(h/4)+1;i++) {
	    	 if(i<=h) {
	    	  for(int p=1;p<=h-i;p++) {
	    		  System.out.print(".");
	    	  }
	    	  for(int b=1;b<=2*i-1;b++) {
	    		  System.out.print("#");
	    	  }
	      }else {
	    	  for(int p=1;p<=(h-1)-(2*(h/4)+1)/2;p++) {
	    		  System.out.print(".");
	    	  }
	    	  for(int b=1;b<=2*(h/4)+1;b++) {
	    		  System.out.print("#");
	    	  }
	    	  
	      } System.out.println();
	      }

}
	}


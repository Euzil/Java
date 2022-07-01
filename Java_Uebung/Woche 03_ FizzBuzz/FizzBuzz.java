public class FizzBuzz {
    public static void main(String[] args) {
        // Fuegen Sie hier Ihre Loesung ein:
          String Str=null;
		        for(int i=1;i<=100;i++) {
		          if(i%5==0&&i%3==0){
		            Str="FizzBuzz,";
		          }else if(i%3==0) {
		        	  Str="Fizz,";
		          }else if(i==100){
		              Str="Buzz";
		          }else if(i%5==0){
		        	 Str="Buzz,";
		          }else {
		        	Str=i+",";

		          }
		       System.out.print(Str);
		       
		        }
		        
		       
		        
		            }
        
        
    }

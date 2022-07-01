import java.util.ArrayList;

public class LogMessage {
    private int level;
    private String message;
    
    private static ArrayList<String> fullLog = new ArrayList<String>();
    private static int nextNum = 0;
    
    private String format(int num) {
        return num + "-" + level + " " + message;
    }
    
    public static void showAll() {
        for (String message : fullLog) {
            System.out.println(message);
        }
    }
    
    // *** Fuegen Sie hier die fehlenden Konstruktor-Deklarationen ein:
           private int value;
		   private boolean increase;
		   
		   public LogMessage(int level,String message,boolean increase) {
			   this.level=level;
			   this.message=message;
			   
			   fullLog.add(format(nextNum));
			  
		   }
		   public LogMessage(int level,String message) {
			   this.level=level;
			   this.message=message;
			   if(level==0){
			        fullLog.add(format(nextNum));
			        fullLog.add(nextNum+"-"+level+" ~~~~~~~~~~");
			        nextNum=nextNum+1;
			   }else{
			   fullLog.add(format(nextNum));
			   nextNum=nextNum+1;
			   }
		   }   
		   
		   public  LogMessage(String message){
			   this.message=message;
			   this.level=3;
			   fullLog.add(format(nextNum));
			   nextNum=nextNum+1;
		   }
		   public LogMessage(boolean increase){
			  fullLog.add("----------");
			   if(increase==true){
			   nextNum=nextNum+1;
			   }
			   
		   }
		   public  LogMessage(int level,int value){
			   this.level=level;
			   this.value=value;
			   message="value is: "+value;
			   fullLog.add(format(nextNum));
			   if(level==0){
			       fullLog.add(nextNum+"-"+level+" ~~~~~~~~~~");
			   }
			   
			   nextNum=nextNum+1;
		   }
}

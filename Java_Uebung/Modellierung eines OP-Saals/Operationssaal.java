/**
 * Klasse zur Modellierung eines Operationssaals
 */
public class Operationssaal {
    // *** Ergaenzen Sie hier Ihre Implementierung
   private String name;
	   private int raumnummer;
	   private Medizingeraet[]geraete;
	   public Operationssaal(String name,int raumnummer,Medizingeraet[]geraete) {
		this.name=name;
		this.raumnummer=raumnummer;

	   }
	   public String setName(String name) {
			  return name ;
	    }
		 public   String getName() {
		      return name ;
	    } 
	   public  int getRaumnummer() {
		      return raumnummer;
	   }
	   public  void zeigeGeraete() {
		     System.out.println(Medizingeraet.getName()+": "+Medizingeraet.getTyp());

	   }
	    public static boolean istVollstaendig() {
		   if (Operationssaal.istVollstaendig()) {
		       System.out.println("Vollstaendig.");
		return true;
		   
	   }
		return false;
	  
		   
	   }
}

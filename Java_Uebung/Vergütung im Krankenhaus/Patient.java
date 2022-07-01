/*
 * Klasse zur Modellierung eines Patienten
*/
abstract class Patient {
    
    // Hier Ihre Loesung einfuegen
    protected  String name;
    protected int  krankenheitsklasse ;
    public  Patient(String name,int  krankenheitsklasse ) {
	this.name=name;
	this.krankenheitsklasse=krankenheitsklasse; 
}
    public String getName() {
        return name;
    }
	
   public double getVerguetung() {
	switch(krankenheitsklasse){
		    case 1: return 150.0;
		    case 2: return 500.0;
		    case 3: return 1000.0;
		    default: return 0;
		}
   }
    
    public abstract void zeigePatient();
}
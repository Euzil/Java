/*
 * Klasse zur Modellierung eines Erwachsenen
 * 
 * Ist von Ihnen anzupassen
 */
class Erwachsener extends Patient {
    public Erwachsener(String name,int krankenheitsklasse) {
	super(name, krankenheitsklasse);
}



@Override
public void zeigePatient() {
	System.out.println(name+" (Erwachsener)");
	
}
}

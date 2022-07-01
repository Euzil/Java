/*
 * Klasse zur Modellierung eines Kindes
 * 
 * Ist von Ihnen anzupassen
 */
class Kind extends Patient{
    	private int alter;
	    public Kind(String name,int krankenheitsklasse,int alter) {
		super(name, krankenheitsklasse);
		this.alter=alter;
	   
}

	public double getVerguetung() {
		switch(krankenheitsklasse){
		    case 1: return 1.25*150.0;
		    case 2: return 1.25*500.0;
		    case 3: return 1.25*1000.0;
		    default: return 0;
		}
	}
	
	@Override
	public void zeigePatient() {
		
		System.out.println(name+" (Kind, "+alter+" Jahre)");
	}
}

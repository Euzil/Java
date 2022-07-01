public class Angestellter extends Person implements Druckbar{
	private String name;
    private String vorname;
    private String email;
	private double gehalt;
	private String abteilung;
    public Angestellter(String name, String vorname) {
		super(name, vorname);
	    this.name=name;
		this.vorname=vorname;
		
	}
    public double getGehalt() {
	    return gehalt;
}
    public void setAbteilung(String abteilung) {
    	this.abteilung=abteilung;
}
	@Override
	public boolean hatUrlaub() {
		return false;
	}
	@Override
	public void setEmail(String email) {
         if(email.equals(null)) {
			this.email="fehlt";
		 }else {
		   this.email=email;
		 }
	}
	@Override
	public String getName() {
		String Name=vorname+" "+name;
		return Name;
	}
	@Override
	public void drucken() {
		System.out.print(getName()+", E-Mail " +email+", Abteilung : "+abteilung);
		
	}


}
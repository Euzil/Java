// Erstellen Sie hier die Klasse Geraet
public abstract class Geraet {
protected boolean istEingeschaltet;
private String hersteller;

    Geraet(String hersteller){
    	this.hersteller=hersteller;
    }
    
    public String gibHersteller() {
           return hersteller;
    }
    public abstract void drueckePowerKnopf();
}

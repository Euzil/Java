import java.util.ArrayList;

public class ICE extends Zug implements MitBordbistro{
public static ArrayList<String> Halterstelle = new ArrayList<String>(); 
	public ICE(String linie, String haltestellen) {
		super(linie, haltestellen);
		Halterstelle.add(haltestellen);
	}

	@Override
	public int getVermutlicheVerspaetung(String haltestelle) {
		int thisverlaengen=0;
	    thisverlaengen+=2;
		return thisverlaengen;
		
	}

	@Override
	public String getHaltestellen() {
		
		return super.haltestellen;
	}

	@Override
	public String getLinie() {
	
		return super.linie;
	}

	@Override
	public void verlaengere(String haltestelle) {
		int verlaengen=2;
		
	}
	public boolean istLangstrecke() {
		if(getVermutlicheVerspaetung(haltestellen)>18) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int AnzahlSpeiplaetze() {
		
		return 40;
	}

	@Override
	public String getRestaurantSpazialitaet() {
	String Restaurant;
	String Lübeck ="Lübeck";
	if(haltestellen.equals(Lübeck)) {
		Restaurant="Marzipan";
	}else {
		Restaurant="Brezeln";
		
	}
		return Restaurant;
	}

}

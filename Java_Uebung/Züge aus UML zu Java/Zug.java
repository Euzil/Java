import java.util.ArrayList;
abstract class Zug {
public  String linie;
public  static String haltestellen;
public static ArrayList<String> Halterstelle = new ArrayList<String>(); 
	public Zug(String linie,String haltestellen) {
		this.linie=linie;
		this.haltestellen=haltestellen;
		Halterstelle.add(haltestellen);
	}
	public abstract int getVermutlicheVerspaetung(String haltestelle);
	public abstract String getHaltestellen();
	public abstract String getLinie();
	public abstract void verlaengere(String haltestelle);
}
import java.util.ArrayList;

public class Gueterzug extends Zug {
public static ArrayList<String> Halterstelle = new ArrayList<String>(); 
public String Ladung;
public static String gefahrenLadung;
public Gueterzug(String linie,String Ladung,String von,String zu) {
	super(linie,zu);
	this.Ladung=Ladung;
	Halterstelle.add(haltestellen);
}
@Override
public int getVermutlicheVerspaetung(String haltestelle) {
	int verlaengere;
	if(haltestelle.equals("Gorleben")) {
		verlaengere=24*60;
	}else if(haltestelle.equals(super.equals(haltestellen))){
		verlaengere=24*60;
	   }else {
		verlaengere=0;
	}
	return verlaengere;
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
	int verlaengere;
	if(haltestelle.equals("Gorleben")) {
		verlaengere=24*60;
	}else if(haltestelle.equals(super.equals(haltestellen))){
		verlaengere=24*60;
	}else {
		verlaengere=0;
	}
	
}
public static void  setGefahrenladung(String name) {
	gefahrenLadung=name;
	Halterstelle.add(haltestellen);
}
public static String getGefahrenladung() {
    Halterstelle.add(haltestellen);
	return gefahrenLadung;
}
}

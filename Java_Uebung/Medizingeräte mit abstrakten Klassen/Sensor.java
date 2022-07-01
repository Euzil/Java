// Erstellen Sie hier die Klasse Sensor
public class Sensor extends Medizingeraet{
	
 int messwert;
     Sensor(String hersteller, int alarmSchwellwert) {
		super(hersteller, alarmSchwellwert);
		
	}

private int messen() {
	int n=100;
	messwert=rand.nextInt(n);
	return messwert;
}


@Override
public void ueberpruefeAlarm() {
	if(istEingeschaltet) {
		messen();
		if(messwert > alarmSchwellwert) {
			System.out.println("Alarm! Messwert uebersteigt Schwellwert.");
		}else {
			System.out.println("Messwert ist in Ordnung.");
		}
	}else {
		System.out.println("Geraet ist ausgeschaltet!");
	}
	
}
}

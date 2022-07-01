/**
 * Klasse zur Modellierung eines Medizingeraetes
 */
public class Medizingeraet {
    // *** Ergaenzen Sie hier Ihre Implementierung
    private static String name;
		private static String typ;
		public Medizingeraet(String name,String typ) {
			this.name=name;
			this.typ=typ;
		}
		public static   String getName() {
			return name;
		}
		public static  String getTyp() {
			return typ;

	}

    
}


public class CloserPlace {
	public static void main(String[] args) {
		double BToA = Math.sqrt(Math.pow(3.8, 2) + Math.pow(4.2, 2));
		double CToA = Math.sqrt(Math.pow(3.2, 2) + Math.pow(4.5, 2));
		double result = Math.min(BToA, CToA);
		if (BToA == result)
			System.out.println("B点距离A点更近");
		if (CToA == result)
			System.out.println("C点距离A点更近");
	}
}

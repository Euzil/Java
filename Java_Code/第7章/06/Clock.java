
public class Clock {
	String structure;
	String style;
	double price;
	
	public Clock(String structure, String style, double price) {
		super();
		this.structure = structure;
		this.style = style;
		this.price = price;
	}
	
	static public void getTime() {
		System.out.println("��ǰʱ�䣺10��10��");
	}
	
	public static void main(String[] args) {
		Clock bell = new Clock("��е", "��", 189.99);
		System.out.println(bell.structure + bell.style + "�ļ۸�Ϊ" + bell.price + "ԪRMB");
		getTime();
		Clock watch = new Clock("ʯӢ", "�ֱ�", 69);
		System.out.println(watch.structure + watch.style + "�ļ۸�Ϊ" + watch.price + "ԪRMB");
		getTime();
	}
}

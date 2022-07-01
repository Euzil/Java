
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
		System.out.println("当前时间：10点10分");
	}
	
	public static void main(String[] args) {
		Clock bell = new Clock("机械", "钟", 189.99);
		System.out.println(bell.structure + bell.style + "的价格为" + bell.price + "元RMB");
		getTime();
		Clock watch = new Clock("石英", "手表", 69);
		System.out.println(watch.structure + watch.style + "的价格为" + watch.price + "元RMB");
		getTime();
	}
}

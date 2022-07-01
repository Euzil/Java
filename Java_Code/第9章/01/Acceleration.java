
public class Acceleration {
	public static void main(String[] args) {
		double time = 15.5;
		int distance = 1050;
		double a = 2 * distance / Math.pow(time, 2);
		System.out.println("飞机起飞时的加速度：" + String.format("%.2f", a) + "(米/秒的平方)。");
	}
}

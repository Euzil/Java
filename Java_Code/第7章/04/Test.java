
public class Test {
	public static void main(String[] args) {
		Circle circle = new Circle(1.5);
		circle.name = "Բ��";
		System.out.println(circle.name + "�����" + circle.getArea());
		Rectangle rectangle = new Rectangle(5.5, 2);
		rectangle.name = "����";
		System.out.println(rectangle.name + "�����" + rectangle.getArea());
	}
}


class People {
	int age;

	public People(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		if (this.age >= 18) {
			return "��" + this.age + "�꣬���ǳ����ˡ�";
		} else {
			return "��" + this.age + "�꣬����δ�����ˡ�";
		}
	}
}

public class Adult {
	public static void main(String[] args) {
		People people = new People(18);
		System.out.println(people);
	}
}

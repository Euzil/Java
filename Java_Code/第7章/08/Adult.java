
class People {
	int age;

	public People(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		if (this.age >= 18) {
			return "我" + this.age + "岁，我是成年人。";
		} else {
			return "我" + this.age + "岁，我是未成年人。";
		}
	}
}

public class Adult {
	public static void main(String[] args) {
		People people = new People(18);
		System.out.println(people);
	}
}


public class Test { // 创建一个Test类
	public static void main(String[] args) {
		Move[] per={new Student("peter"), new Teacher("mike")};
		// 通过相应的对象调用相应的方法实现控制台输出结果
		per[0].talk();
		per[1].talk();
		per[1].work();
		per[0].work();
	}
}

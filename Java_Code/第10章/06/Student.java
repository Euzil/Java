
public class Student implements Move { // 创建一个Student类实现接口Move
	public String name;//定义姓名字段
	
	public Student(String name) { // 对姓名字段进行初始化
		this.name=name;
	}
	
	@Override
	public void work() { // 重写work()方法
		System.out.println(name + "：同学开始记笔记");
	}

	@Override
	public void talk() { // 重写talk()方法
		System.out.println(name + "：老师好");
	}
}


public class Student implements Move { // ����һ��Student��ʵ�ֽӿ�Move
	public String name;//���������ֶ�
	
	public Student(String name) { // �������ֶν��г�ʼ��
		this.name=name;
	}
	
	@Override
	public void work() { // ��дwork()����
		System.out.println(name + "��ͬѧ��ʼ�Ǳʼ�");
	}

	@Override
	public void talk() { // ��дtalk()����
		System.out.println(name + "����ʦ��");
	}
}


public class Teacher implements Move { // ����һ��Teacher��ʵ�ֽӿ�Move
	public String name;//���������ֶ�
	
	public Teacher(String name) { // �������ֶν��г�ʼ��
		this.name=name;
	}
	
	@Override
	public void work() { // ��дwork()����
		System.out.println(name + "����ʦ��ʼ�Ͽ�");
	}

	@Override
	public void talk() { // ��дtalk()����
		System.out.println(name + "��ͬѧ�Ǻ�");
	}
}

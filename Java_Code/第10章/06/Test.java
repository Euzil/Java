
public class Test { // ����һ��Test��
	public static void main(String[] args) {
		Move[] per={new Student("peter"), new Teacher("mike")};
		// ͨ����Ӧ�Ķ��������Ӧ�ķ���ʵ�ֿ���̨������
		per[0].talk();
		per[1].talk();
		per[1].work();
		per[0].work();
	}
}

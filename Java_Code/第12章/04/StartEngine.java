
public class StartEngine {
	static void start() throws NullPointerException {
		Object key = null;
		key.toString();
	}

	public static void main(String[] args) {
		try {
			start();
		} catch (Exception e) {
			System.out.println("��Կ�������ˣ�����ʱ�����������ˡ���");
		} finally {
			System.out.println("ȥȡ��Կ�װ�T_T");
		}
	}
}

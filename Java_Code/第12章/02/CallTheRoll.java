
class Person { // ����һ��Person��
	private String job; // ���塰ְ�ơ�

	public String getJob() { // ��á�ְ�ơ�
		return job;
	}

	public void setJob(String job) { // ���á�ְ�ơ�
		this.job = job;
	}

	public void say(String words) { // �����вεķ���say()
		System.out.println(job + "��" + words); // ������
	}
}

public class CallTheRoll { // ����һ��CallTheRoll��
	public static void main(String[] args) {
		try { // try��
			Person person1 = new Person(); // ��������person1
			person1.setJob("��ʦ"); // ���ö���person1�ġ�ְ�ơ�
			person1.say("ͬѧ�����Ϻã��������ǿ�ʼ����..."); // ���ö���person1˵��������

			Person person2 = new Person(); // ��������person2
			person2.setJob("�೤"); // ���ö���person2�ġ�ְ�ơ�
			person2.say("��ұ��ְ�����׼���Ͽ�..."); // ���ö���person2˵��������

			person1.say("������"); // ���ö���person1˵��������

			Person person3 = new Person(); // ��������person3
			person3.setJob("ͬѧ����"); // ���ö���person3�ġ�ְ�ơ�
			person3.say("����"); // ���ö���person3˵��������

			person1.say("���ģ�"); // ���ö���person1˵��������

			Person person4 = new Person(); // ��������person4
			person4.setJob("ͬѧ����"); // ���ö���person4�ġ�ְ�ơ�
			person4.say("Here��"); // ���ö���person4˵��������

			person1.say("�´�˵���ġ���һ����\n���������壡"); // ���ö���person1˵��������

			Person person5 = new Person(); // ��������person5
			person5.setJob("ͬѧ����"); // ���ö���person5�ġ�ְ�ơ�
			person5.say("...."); // ���ö���person5˵��������

			person1.say("���壡"); // ���ö���person1˵��������

			person5.say("...."); // ���ö���person5˵��������

			throw new Exception("�׳��쳣����ʦ�ڵ������ϼ����ˡ�������Ρ�������"); // �׳��쳣
		} catch (Exception e) { // catch��
			System.out.println(e.getMessage()); // ����쳣����Ϣ
		} finally {
			System.out.println("��ʦ������������˽��������ڿ�ʼ�ϿΣ�"); // ����̨���
		}
	}
}

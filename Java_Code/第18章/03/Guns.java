
public class Guns { // �������������
	public static void main(String[] args) {
		Thread sniperRifle = new SniperRifle(); // �����߳������ࣨ���ѻ���ǹ��������
		sniperRifle.setName("�ѻ���ǹ"); // ���á��ѻ���ǹ���̵߳�����
		/**
		 * ��������ǹ���̶߳��� new Pistol() ʵ��Runnable�ӿڵ�ʵ������ "DesertEagle" ���á���ǹ���̵߳�����
		 */
		Thread pistol = new Thread(new Pistol(), "��ǹ");
		pistol.start(); // ���á���ǹ���߳�
		sniperRifle.start(); // ���á��ѻ���ǹ���߳�
	}
}

class SniperRifle extends Thread { // �������ѻ���ǹ����̳��߳���
	@Override
	public void run() { // �߳�Ҫִ�е�����
		int rifleAmmo = 10; // ���ѻ���ǹ���ӵ���
		boolean keepShooting = true; // ���������������ֹ�̵߳ı�־����
		while (keepShooting) { // ѭ�����
			System.out.println(Thread.currentThread().getName() + "ʣ���ӵ�����" + (--rifleAmmo)); // ����̨���ʣ����ӵ���
			if (rifleAmmo == 0) { // ���ѻ���ǹ���ӵ���Ϊ0ʱ��ͨ���ı��̵߳ı�־�����������������ֵ������ֹ�߳�
				keepShooting = false;
			}
		}
	}
}

class Pistol implements Runnable { // ��������ǹ����ʵ��Runnable�ӿ�
	@Override
	public void run() { // �߳�Ҫִ�е�����
		int pistolAmmo = 9; // ����ǹ���ӵ���
		boolean keepShooting = true; // ���������������ֹ�̵߳ı�־����
		while (keepShooting) { // ѭ�����
			System.out.println(Thread.currentThread().getName() + "ʣ���ӵ�����" + (--pistolAmmo)); // ����̨���ʣ����ӵ���
			if (pistolAmmo == 0) { // ����ǹ���ӵ���Ϊ0ʱ��ͨ���ı��̵߳ı�־�����������������ֵ������ֹ�߳�
				keepShooting = false;
			}
		}
	}
}

// �̳�DadLikeDo�ӿں�MomLikeDo�ӿ�
public class SonLikeDo implements DadLikeDo, MomLikeDo {
	public void watchTV() { // ʵ��watchTV()����
		System.out.println("������");
	}

	public void cook() { // ʵ��cook()����
		System.out.println("����");
	}

	public void smoke() { // ʵ��smoke()����
		System.out.println("����");
	}

	public void fish() { // ʵ��fish()����
		System.out.println("����");
	}

	public static void main(String[] args) {
		SonLikeDo son = new SonLikeDo(); // ͨ�����ഴ��IFather�ӿڶ���
		System.out.println("����ϲ���������У�");
		// ����������DadLikeDo��MomLikeDo�����ӿڱ�ʵ�ֵ����з���
		son.watchTV();
		son.cook();
		son.smoke();
		son.fish();
	}
}

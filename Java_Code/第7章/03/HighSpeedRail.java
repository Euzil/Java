
class Train {
	public double getSpeed() {
		return 145.8;
	}
}

public class HighSpeedRail extends Train {
	public double getSpeed() {
		return super.getSpeed() * 2;
	}
	
	public static void main(String[] args) {
		Train train = new Train();
		System.out.println("�𳵵��ٶ�Ϊ" + train.getSpeed() + "����/Сʱ");
		HighSpeedRail highSpeedRail = new HighSpeedRail();
		System.out.println("�������ٶ�Ϊ" + highSpeedRail.getSpeed() + "����/Сʱ");
	}
}

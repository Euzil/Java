
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
		System.out.println("火车的速度为" + train.getSpeed() + "公里/小时");
		HighSpeedRail highSpeedRail = new HighSpeedRail();
		System.out.println("高铁的速度为" + highSpeedRail.getSpeed() + "公里/小时");
	}
}

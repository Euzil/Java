
class Traffic {
	String actor;
	
	public Traffic(String actor) {
		this.actor = actor;
	}

	public final String obey() {
		return this.actor + "�������н�ͨ�źŵƵ�·��ʱ��Ҫ���ء����ͣ���̵��С��Ľ�ͨ����";
	}
}

class Passerby extends Traffic {
	public Passerby(String actor) {
		super(actor);
	}
}

class NonMotorVehicle extends Traffic {
	public NonMotorVehicle(String actor) {
		super(actor);
	}
}

class MotorVehicle extends Traffic {
	public MotorVehicle(String actor) {
		super(actor);
	}
}

public class TrafficRegulations {
	public static void main(String[] args) {
		Passerby armedPolice = new Passerby("����");
		System.out.println(armedPolice.obey());
		NonMotorVehicle peoplePolice = new NonMotorVehicle("�ǻ�������");
		System.out.println(peoplePolice.obey());
		MotorVehicle trafficPolice = new MotorVehicle("��������");
		System.out.println(trafficPolice.obey());
	}
}

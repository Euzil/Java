
class Traffic {
	String actor;
	
	public Traffic(String actor) {
		this.actor = actor;
	}

	public final String obey() {
		return this.actor + "在行至有交通信号灯的路口时，要遵守“红灯停、绿灯行”的交通规则。";
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
		Passerby armedPolice = new Passerby("行人");
		System.out.println(armedPolice.obey());
		NonMotorVehicle peoplePolice = new NonMotorVehicle("非机动车辆");
		System.out.println(peoplePolice.obey());
		MotorVehicle trafficPolice = new MotorVehicle("机动车辆");
		System.out.println(trafficPolice.obey());
	}
}

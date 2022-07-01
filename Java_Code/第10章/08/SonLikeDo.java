
// 继承DadLikeDo接口和MomLikeDo接口
public class SonLikeDo implements DadLikeDo, MomLikeDo {
	public void watchTV() { // 实现watchTV()方法
		System.out.println("看电视");
	}

	public void cook() { // 实现cook()方法
		System.out.println("做饭");
	}

	public void smoke() { // 实现smoke()方法
		System.out.println("抽烟");
	}

	public void fish() { // 实现fish()方法
		System.out.println("钓鱼");
	}

	public static void main(String[] args) {
		SonLikeDo son = new SonLikeDo(); // 通过子类创建IFather接口对象
		System.out.println("儿子喜欢做的事有：");
		// 子类对象调用DadLikeDo和MomLikeDo两个接口被实现的所有方法
		son.watchTV();
		son.cook();
		son.smoke();
		son.fish();
	}
}

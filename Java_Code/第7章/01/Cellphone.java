
public class Cellphone {
	
	public Cellphone() {
		System.out.println("智能手机的默认语言为英文");
	}
	
	public Cellphone(String defaultLanguage) {
		System.out.println("将智能手机的默认语言设置为" + defaultLanguage);
	}

	public static void main(String[] args) {
		Cellphone cellphone1 = new Cellphone();
		Cellphone cellphone2 = new Cellphone("中文");
	}
}

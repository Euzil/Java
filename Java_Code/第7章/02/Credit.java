
public class Credit {
	String cardNum;
	String password;
	
	public Credit(String cardNum, String password) {
		this.cardNum = cardNum;
		this.password = password;
		if (password.equals("123456")) {
			System.out.println("���ÿ�" + cardNum + "��Ĭ������Ϊ" + password);
		} else {
			System.out.println("�������ÿ�" + cardNum + "������Ϊ" + password);
		}
	}
	
	public Credit(String cardNum) {
		this(cardNum, "123456");
	}
	
	public static void main(String[] args) {
		Credit initialCredit = new Credit("4013735633800642");
		Credit resetedCredit = new Credit("4013735633800642", "168779");
	}
}

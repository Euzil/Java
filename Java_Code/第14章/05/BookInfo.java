
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;

class Book { // ����һ��Book��
	private String bookName; // ����
	private String author; // ����
	private double price; // �۸�

	// �����вη�����ʹ��this�ؼ�������ͬ���Ĳ����ͱ���������������ֵ��������
	public Book(String bookName, String author, double price) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	// ��ȡ�۸�
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() { // ��дtoString()����
		return bookName + "\t" + author + "\t" + price + "Ԫ"; // ��������Ľ����Ϣ�͸�ʽ
	}
}

public class BookInfo { // ����һ��BookInfo���鼮��Ϣ����
	public static void main(String[] args) {
		HashSet<Book> shoppingCart = new HashSet<>(); // ����HashSet����������ʾ���ﳵ
		// ����Book���飬��ʾҪ�������Ʒ
		Book[] books = { new Book("��Java�����ŵ���ͨ����3�棩��", "���տƼ�����", 59.8), new Book("��Java�����ŵ���ͨ��ʵ���棩��", "���տƼ�����", 69.8),
				new Book("��Java Web�����ŵ���ͨ������  ", "���տƼ�����", 69.8) };
		// ʹ��add()�������ﳵ�����Book����
		shoppingCart.add(books[0]);
		shoppingCart.add(books[1]);
		shoppingCart.add(books[2]);
		Iterator<Book> it = shoppingCart.iterator(); // ����������
		System.out.println("���Ĺ��ﳵ�����Ʒ��Ϣ��\n����\t\t\t\t���ߣ��Ŷӣ�\t�۸�");
		System.out.println("��������������������������������������������������������������������������������������������������������������"); // �ָ���
		while (it.hasNext()) {// �жϹ��ﳵ���Ƿ���Ԫ��
			System.out.println(it.next()); // ������ﳵ�е���Ʒ
		}
		System.out.println("��������������������������������������������������������������������������������������������������������������"); // �ָ���
		double sumMoney = books[0].getPrice() + books[1].getPrice() + books[2].getPrice(); // ����3������ܼ�Ǯ
		DecimalFormat pattern = new DecimalFormat("##.##"); // ����DecimalFormat����
		String result = pattern.format(sumMoney); // ����format()������ʽ����3������ܼ�Ǯ
		System.out.println("�ϼƣ�\t\t\t\t\t\t" + result + "Ԫ\n\t\t\t\t\t\t��������ȥ����"); // �����3������ܼ�Ǯ
	}
}

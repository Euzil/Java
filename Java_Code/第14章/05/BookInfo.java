
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;

class Book { // 创建一个Book类
	private String bookName; // 书名
	private String author; // 作者
	private double price; // 价格

	// 构造有参方法，使用this关键字区分同名的参数和变量，并将参数的值赋给变量
	public Book(String bookName, String author, double price) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	// 获取价格
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() { // 重写toString()方法
		return bookName + "\t" + author + "\t" + price + "元"; // 返回输出的结果信息和格式
	}
}

public class BookInfo { // 创建一个BookInfo（书籍信息）类
	public static void main(String[] args) {
		HashSet<Book> shoppingCart = new HashSet<>(); // 创建HashSet对象，用来表示购物车
		// 创建Book数组，表示要购买的商品
		Book[] books = { new Book("《Java从入门到精通（第3版）》", "明日科技编著", 59.8), new Book("《Java从入门到精通（实例版）》", "明日科技编著", 69.8),
				new Book("《Java Web从入门到精通》　　  ", "明日科技编著", 69.8) };
		// 使用add()方法向购物车中添加Book对象
		shoppingCart.add(books[0]);
		shoppingCart.add(books[1]);
		shoppingCart.add(books[2]);
		Iterator<Book> it = shoppingCart.iterator(); // 创建迭代器
		System.out.println("您的购物车里的商品信息：\n书名\t\t\t\t作者（团队）\t价格");
		System.out.println("———————————————————————————————————————————————————————"); // 分割线
		while (it.hasNext()) {// 判断购物车中是否有元素
			System.out.println(it.next()); // 输出购物车中的商品
		}
		System.out.println("———————————————————————————————————————————————————————"); // 分割线
		double sumMoney = books[0].getPrice() + books[1].getPrice() + books[2].getPrice(); // 求这3本书的总价钱
		DecimalFormat pattern = new DecimalFormat("##.##"); // 创建DecimalFormat对象
		String result = pattern.format(sumMoney); // 调用format()方法格式化这3本书的总价钱
		System.out.println("合计：\t\t\t\t\t\t" + result + "元\n\t\t\t\t\t\t—→点我去结账"); // 输出这3本书的总价钱
	}
}

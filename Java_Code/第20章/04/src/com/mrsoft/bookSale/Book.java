
public class Book {// 图书类
	
	private int bookID;// 图书表号
	private String bookName;// 图书名称
	private int bookSales;// 图书销量
	// 为图书类中的私有属性添加相应的Getters和Setters方法
	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookSales() {
		return bookSales;
	}

	public void setBookSales(int bookSales) {
		this.bookSales = bookSales;
	}

}

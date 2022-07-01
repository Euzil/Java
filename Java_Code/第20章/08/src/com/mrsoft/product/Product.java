
public class Product {// 产品类

	private int id;// 序号
	private String listID;// 单据编号
	private String listDate;// 单据日期
	private String listMaker;// 操作员
	private String productID;// 产品编号
	private int socket;// 库存
	// 为产品类中的私有属性添加相应的Getters和Setters方法
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getListID() {
		return listID;
	}

	public void setListID(String listID) {
		this.listID = listID;
	}

	public String getListDate() {
		return listDate;
	}

	public void setListDate(String listDate) {
		this.listDate = listDate;
	}

	public String getListMaker() {
		return listMaker;
	}

	public void setListMaker(String listMaker) {
		this.listMaker = listMaker;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public int getSocket() {
		return socket;
	}

	public void setSocket(int socket) {
		this.socket = socket;
	}

}

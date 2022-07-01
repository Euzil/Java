
public class Barcode { // 创建一个Barcode类
	public static void main(String[] args) {
		String code = "6936983800013"; // 初始化一个String类型的变量code，给出一个十三位的条形码
		System.out.println("解析条形码“6936983800013”的含义：");
		String country = code.substring(0, 3); // 截取字符串，并将截取到的字符串给String类型的变量country
		int countryNum = Integer.parseInt(country); // 把String类型的变量country传唤为int类型的变量countryNum
		if (countryNum > 690 && countryNum < 695) { // 判断countryNum是否同时满足这两个条件
			System.out.println(countryNum + "：\t" + "表示该商品的产地是中国大陆"); // 条件成立时，输出的信息（“\t”：光标移动到下一个水平制表）
		} else {
			System.out.println(countryNum + "：\t" + "表示该商品的产地是其他国家"); // 条件不成立时，输出的信息
		}
		System.out.println(code.substring(3, 8) + "：\t" + "表示该商品的生产厂商代码"); // 输出截取到的字符串，及其代表的含义
		System.out.println(code.substring(8, 12) + "：\t" + "表示该商品的厂内商品代码"); // 输出截取到的字符串，及其代表的含义
		System.out.println(code.substring(12) + "：\t" + "表示校验码"); // 输出截取到的字符串，及其代表的含义
	}
}

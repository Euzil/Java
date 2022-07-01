
public final class FiveStarRedFlag {			//创建由final修饰五星红旗类
	int starNum; 								//五角星的个数
	String starColor;							//五角星的颜色
	String backgroundColor;						//五星红旗的旗面颜色
	//参数为五角星的个数、五角星的颜色以及五星红旗的旗面颜色的构造方法
	public FiveStarRedFlag (int starNum, String starColor, String backgroundColor) {
		this.starNum = starNum;					//为五角星的个数赋值
		this.starColor = starColor;				//为五角星的颜色赋值
		this.backgroundColor = backgroundColor;	//为五星红旗的旗面颜色赋值
	}
	public static void main(String[] args) {
		//使用有参的构造方法，创建五星红旗对象
		FiveStarRedFlag flag = new FiveStarRedFlag (5, "黄色", "红色");
		//控制台输出“五星红旗是由红色的旗面和5颗黄色的五角星组成的”
		System.out.println("五星红旗是由" + flag.backgroundColor + "的旗面和"
				+ flag.starNum + "颗" + flag.starColor + "的五角星组成的");
	}
}

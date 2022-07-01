
public class PackagedFruit extends Fruit //创建一个PackagedFruit类继承Fruit类
{
	private double packagesfee; //定义“精装水果的包装费”
	public double getPackagesfee() //获得“精装水果的包装费”
	{
		return packagesfee;
	}
	public void setPackagesfee(double packagesfee) //设置“精装水果的包装费”
	{
		this.packagesfee = packagesfee;
	}
}

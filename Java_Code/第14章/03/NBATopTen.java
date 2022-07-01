
import java.util.ArrayList;
import java.util.List;

public class NBATopTen {
	public static void main(String[] args) {
		System.out.print("————————————NBA历史十大巨星————————————\n");
		String titles[] = { "球员", "绰号", "得分", "篮板", "助攻" }; // 声明一个String类型的数组，用来存放员工信息
		for (int i = 0; i < titles.length; i++) { // 遍历数组titles
			System.out.print(titles[i] + "\t"); // 输出数组中的元素
		}
		System.out.println(); // 换行
		List<String> list = new ArrayList<>(); // 使用ArrayList实现List接口
		// 使用add方法向集合list中添加元素
		list.add("乔丹,飞人/神,30.1,6.2,5.3");
		list.add("拉塞尔,指环王,15.1,22.5,4.3");
		list.add("贾巴尔,天钩,24.6,11.2,3.6");
		list.add("张伯伦,篮球皇帝,30.1,22.9,4.4");
		list.add("约翰逊,魔术师,19.5,7.2,11.2");
		list.add("伯德,大鸟,24.3,10.0,6.3");
		list.add("邓肯,石佛,20.7,11.4,3.2");
		list.add("科比,黑曼巴,25.1,5.3,4.7");
		list.add("奥尼尔,大鲨鱼,23.7,10.9,2.5");
		list.add("奥拉朱旺,大梦,21.8,11.1,2.5");
		for (int i = 0; i < list.size(); i++) { // 遍历集合list
			String element = (String) list.get(i); // 获取集合list中的元素，并将其转换为String类型
			// 用","拆分被转换为String类型的集合list中的元素，并把已经拆分的内容存放到String类型的数组里
			String info[] = element.split(",");
			for (int j = 0; j < info.length; j++) { // 遍历数组info
				System.out.print(info[j] + "\t"); // 输出数组info的元素
			}
			System.out.println(); // 换行
		}
	}
}

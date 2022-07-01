
public class Guns { // 创建“射击”类
	public static void main(String[] args) {
		Thread sniperRifle = new SniperRifle(); // 创建线程类子类（“狙击步枪”）对象
		sniperRifle.setName("狙击步枪"); // 设置“狙击步枪”线程的名称
		/**
		 * 创建“手枪”线程对象 new Pistol() 实现Runnable接口的实例对象 "DesertEagle" 设置“手枪”线程的名称
		 */
		Thread pistol = new Thread(new Pistol(), "手枪");
		pistol.start(); // 启用“手枪”线程
		sniperRifle.start(); // 启用“狙击步枪”线程
	}
}

class SniperRifle extends Thread { // 创建“狙击步枪”类继承线程类
	@Override
	public void run() { // 线程要执行的任务
		int rifleAmmo = 10; // “狙击步枪”子弹数
		boolean keepShooting = true; // “继续射击”，终止线程的标志变量
		while (keepShooting) { // 循环射击
			System.out.println(Thread.currentThread().getName() + "剩余子弹数：" + (--rifleAmmo)); // 控制台输出剩余的子弹数
			if (rifleAmmo == 0) { // “狙击步枪”子弹数为0时，通过改变线程的标志变量“继续射击”的值，来终止线程
				keepShooting = false;
			}
		}
	}
}

class Pistol implements Runnable { // 创建“手枪”类实现Runnable接口
	@Override
	public void run() { // 线程要执行的任务
		int pistolAmmo = 9; // “手枪”子弹数
		boolean keepShooting = true; // “继续射击”，终止线程的标志变量
		while (keepShooting) { // 循环射击
			System.out.println(Thread.currentThread().getName() + "剩余子弹数：" + (--pistolAmmo)); // 控制台输出剩余的子弹数
			if (pistolAmmo == 0) { // “手枪”子弹数为0时，通过改变线程的标志变量“继续射击”的值，来终止线程
				keepShooting = false;
			}
		}
	}
}
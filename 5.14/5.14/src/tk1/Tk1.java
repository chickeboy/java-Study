package tk1;

/*
 * 多线程
 * 进程:一个程序执行的过程,资源控制比较安全，多核电脑
 * 线程:进程下的更小资源单位,资源分配比较麻烦，但是可以
 * 提升资源的使用效率
 * 并发:一个人吃三个馒头，一个吃完再次一个
 * 并行:三个人吃一个馒头，大家抢，谁的舌头舔的快谁就拿到资源
 * 异步:大家一起抢，谁抢到就是谁的
 * 比如加载一个网页有10张图片
 * 同步1 2 3 4 5 6
 * 异步:一起加载，每张图片只加载了一点
 * Eclipse就是一个进程
 * 我们要对进程下的这点资源进行分配
 * main方法已经代表一根线程 主线程 我们可以在主
 * 线程下继续开子线程
 * Thread 线程超类
 * 如何自己开启线程
 * 
 * 
 */
public class Tk1 {
	public static void main(String[] args) {
//		System.out.println(Thread.currentThread().getId());
//		System.out.println(Thread.currentThread().getName());
		// 以上是主线程
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "......mianx" + i);
		}
		MyThread myThread = new MyThread("A");// 准备状态创建线程对象
		myThread.start();// 启动线程
		MyThread myThread2 = new MyThread("B");
		myThread2.start();// start内部调用run方法
		// 启动线程一定要重写run方法
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "......mainy" + i);
		}
	}
}

//1.编写一个继承于Thread的类去启动线程
//使用实现接口 Runnable 的对象创建一个线程时，
//启动该线程将导致在独立执行的线程中调用对象的 run 方法
//启动线程就要调用run方法，run方法需要重写，里面放的就是我们在线程
//中需要执行逻辑
class MyThread extends Thread {
	//
	public MyThread(String name) {// name是Thread的成员属性
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName() + "....." + i);
		}
	}
}

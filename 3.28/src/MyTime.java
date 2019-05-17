import java.util.Date;

/*
在程序中，经常要对时间进行操作，但是并没有时间类型的数据。那么，我们可以自己实现一个时间类，来满足程序中的需要。
定义名为MyTime的类，其中应有三个整型成员：时（hour），分（minute），秒（second），为了保证数据的安全性，
这三个成员变量应声明为私有。
为MyTime类定义构造方法，以方便创建对象时初始化成员变量。
再定义diaplay方法，用于将时间信息打印出来。（类的成员变量与方法、构造方法）
*/
public class MyTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTime myTime = new MyTime();
		myTime.diaplay();
	}
	void diaplay() {
		MyTime myTime = new MyTime();
		Date date = new Date();
		int hours = date.getHours();
		int min = date.getMinutes();
		int scors = date.getSeconds();
		System.out.println(hours + ":" + min + ":" + scors);
	}

}

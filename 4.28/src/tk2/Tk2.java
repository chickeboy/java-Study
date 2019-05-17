package tk2;

/*
 * 抽象类的使用场景之一
 * 模板模式:父类有抽象方法也就是没有实现具体的逻辑
 * 但是父类中出现了一个具体方法，可以调用这些抽象方法
 * 组成做一件事的流程，具体的抽象方法依靠子类去实现
 * 那么不同的子类实现方式不一样，但是父类决定了整个
 * 流程
 * 
 */
public class Tk2 {
	public static void main(String[] args) {
		JavaTeacher javaTeacher = new JavaTeacher("java教员");
		javaTeacher.work();
		CTeacher cTeacher = new CTeacher("C教员");
		cTeacher.work();
	}
}

abstract class Teacher {
	private String name;

	// 所有的教员开始和结束的方式一样
	public void start() {
		System.out.println(name + "进教室");
	}

	// 其中的过程未知
	public abstract void teach();

	public void end() {
		System.out.println(name + "离开教室");
	}

	// 对start teach end进行调度
	public void work() {
		start();
		teach();
		end();
	}

	public Teacher(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + "]";
	}

}

/**
 * 父类的抽象行为延时实现，父类却决定了执行的顺序
 * 
 * @author lagone
 *
 */
class JavaTeacher extends Teacher {

	public JavaTeacher(String name) {
		super(name);
	}

	@Override
	public void teach() {
		System.out.println(getName() + "教java");
	}

}

class CTeacher extends Teacher {

	public CTeacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void teach() {
		System.out.println(getName() + "教C语言");
	}

}

package tk5;

public class Tk6 {
	public static void main(String[] args) {

	}
}

/*
 * 子类重写父类方法，
 * 同名同参 子类的方法的访问修饰级别不能小于父类的方法 
 * 子类的方法返回值类型不能大于父类的返回值类型
 * (大小只的是父子继承关系的大小)
 */
class A {
	public Object a() {
		return null;
	}
}

class D extends A {
	@Override
	public B a() {
		return null;
	}
}

class B extends C {

}

class C {

}

package tk1;

/*
 * 需求：1） 定义点类(二维,即包含x,y坐标) Point2） 
 * 定义一个图形类Figure（抽象类）：包含抽象方法画图(onDraw)3） 
 * 定义一个三角形继承于图形类,属性：三个点方法：设置点，
 * 获取点等相关方法以及重写的画图方法PS：
 * 画图方法中要求打印出画出的是一个什么图形和各个点坐标4） 
 * 定义一个圆形类，和三角形要求一致5） 定义一个画家类Painter方法：
 * 画画：可以画出一个图形6） 写一个测试类，
 * 测试画家画画，画一个三角形，一个圆形

 */
public class Tk1 {
	public static void main(String[] args) {
		Person person = new Person();
		Point p1 = new Point(3, 4);
		Point p2 = new Point(4, 2);
		Point p3 = new Point(5, 1);

		Figure figure = new Circle("圆形", p1, 12);
		person.draw(figure);
		figure = new Triangle("三角形", p1, p2, p3);
		person.draw(figure);
	}
}

abstract class Figure {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Figure(String name) {
		super();
		this.name = name;
	}

	public abstract void onDraw();
}

class Person {
	public void draw(Figure figure) {
		System.out.println("达芬奇开始画画,画出了");
		figure.onDraw();
	}
}

class Triangle extends Figure {
	private Point p1;
	private Point p2;
	private Point p3;

	public Triangle(String name, Point p1, Point p2, Point p3) {
		super(name);
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	@Override
	public void onDraw() {
		System.out.println(getName() + ":" + p1 + "," + p2 + "," + p3);
	}

}

class Circle extends Figure {
	private Point point;
	private double r;

	public Circle(String name, Point point, double r) {
		super(name);
		// TODO Auto-generated constructor stub
		this.point = point;
		this.r = r;
	}

	@Override
	public void onDraw() {
		System.out.println(getName() + ":圆心  " + point + ",半径  " + r);
	}

}

class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

}

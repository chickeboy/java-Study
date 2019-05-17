package tk1;

/*
 * ����1�� �������(��ά,������x,y����) Point2�� 
 * ����һ��ͼ����Figure�������ࣩ���������󷽷���ͼ(onDraw)3�� 
 * ����һ�������μ̳���ͼ����,���ԣ������㷽�������õ㣬
 * ��ȡ�����ط����Լ���д�Ļ�ͼ����PS��
 * ��ͼ������Ҫ���ӡ����������һ��ʲôͼ�κ͸���������4�� 
 * ����һ��Բ���࣬��������Ҫ��һ��5�� ����һ��������Painter������
 * ���������Ի���һ��ͼ��6�� дһ�������࣬
 * ���Ի��һ�������һ�������Σ�һ��Բ��

 */
public class Tk1 {
	public static void main(String[] args) {
		Person person = new Person();
		Point p1 = new Point(3, 4);
		Point p2 = new Point(4, 2);
		Point p3 = new Point(5, 1);

		Figure figure = new Circle("Բ��", p1, 12);
		person.draw(figure);
		figure = new Triangle("������", p1, p2, p3);
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
		System.out.println("����濪ʼ����,������");
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
		System.out.println(getName() + ":Բ��  " + point + ",�뾶  " + r);
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

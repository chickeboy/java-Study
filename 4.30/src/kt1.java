
public class kt1 {
	/*
	 * 定义点类(二维,即包含x,y坐标) Point 2） 定义一个图形类Figure（抽象类）：包含抽象方法画图(onDraw)
	 * 3）定义一个三角形继承于图形类,属性： 三个点
	 * 方法：设置点，获取点等相关方法以及重写的画图方法PS： 画图方法中要求打印出画出的是一个什么图形和各个点坐标
	 * 4） 定义一个圆形类，和三角形要求一致 5） 定义一个画家类Painter方法：画画：可以画出一个图形
	 * 6）写一个测试类，测试画家画画，画一个三角形，一个圆形
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Painter painter = new Painter();
		painter.draw();
		
	}

}

class Painter {
	triangle triangle = new triangle();
	Circular circular = new Circular();
	public void draw() {
		Point point = new Point(0, 0);
		triangle.point(point);
		point= new Point(5, 0);
		triangle.point(point);
		point = new Point(0, 5);
		triangle.point(point);
		triangle.onDraw();
		point = new Point(0, 0);
		triangle.point(point);
		point = new Point(5, 0);
		triangle.point(point);
		point = new Point(0, 5);
		triangle.point(point);
		circular.onDraw();
		
	}
}

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
abstract class Figure {
	abstract void onDraw();
}

class triangle extends Figure {

	public void point(Point point) {
		System.out.println("("+point.getX()+","+point.getY()+")");
	}
	@Override
	void onDraw() {
		// TODO Auto-generated method stub
		System.out.println("直角三角形");
	}
}
class Circular extends Figure{
	public void point(Point point) {
		System.out.println("("+point.getX()+","+point.getY()+")");
	}
	@Override
	void onDraw() {
		// TODO Auto-generated method stub
		System.out.println("圆形");
	}
	
}
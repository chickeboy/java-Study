
public class kt1 {
	/*
	 * �������(��ά,������x,y����) Point 2�� ����һ��ͼ����Figure�������ࣩ���������󷽷���ͼ(onDraw)
	 * 3������һ�������μ̳���ͼ����,���ԣ� ������
	 * ���������õ㣬��ȡ�����ط����Լ���д�Ļ�ͼ����PS�� ��ͼ������Ҫ���ӡ����������һ��ʲôͼ�κ͸���������
	 * 4�� ����һ��Բ���࣬��������Ҫ��һ�� 5�� ����һ��������Painter���������������Ի���һ��ͼ��
	 * 6��дһ�������࣬���Ի��һ�������һ�������Σ�һ��Բ��
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
		System.out.println("ֱ��������");
	}
}
class Circular extends Figure{
	public void point(Point point) {
		System.out.println("("+point.getX()+","+point.getY()+")");
	}
	@Override
	void onDraw() {
		// TODO Auto-generated method stub
		System.out.println("Բ��");
	}
	
}
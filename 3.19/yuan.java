import java.util.*;//����һ�����߰� ����
public class yuan{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);//����һ���������̽������ݵĹ��߶������scanner
		System.out.println("������Բ�İ뾶");
		//��α������������������ڻ�����
		int r = scanner.nextInt();//������һ�����������
		double v = 4*Math.PI*Math.pow(r,3)/3;
		double s = 3.14*r*r/2;
		double S = 4*3.14*r*r; 
		System.out.println("Բ�����Ϊ" + s);
		System.out.println("������Ϊ" + v);
		System.out.println("������Ϊ" + s);
	}
}
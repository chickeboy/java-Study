import java.util.Scanner;//�������ռ������ݵĹ�����
public class Test5{
	public static void main(String[] args){
		//8�ֻ����������͵�¼�뷽ʽ,��¼��ĵط����������
		//��ʾ�û���������ݵ�����ʲô����
		//1.����һ��Scannerɨ����ⴴ���Ĺ��߶���
		Scanner scanner = new Scanner(System.in);
		//��������Ҫ�����壬Ӣ�ĵ���(ƴ��)��Ҫ�����֣���������
		//����������ĸСд�������ĵ�������ĸ��д
		int i = 0;
		System.out.println("������һ������");
		i = scanner.nextInt();//������һ�����������
		System.out.println("�������������i = " + i);
		//�ַ�����ƴ��,�ַ�����д����ʲô����ľ���ʲô
		//String ����������������+���������е���������
		//���ս����String
		System.out.println("������һ��byte");
		byte bt = 0;
		bt = scanner.nextByte();//������һ�������byte
		System.out.println("�������byte��byte = " + bt);
		System.out.println("������һ��short");
		short s = 0;
		s = scanner.nextShort();//������һ�������short
		System.out.println("�������short��short = " + s);
		System.out.println("������һ��byte");
		long l = 0;
		l = scanner.nextLong();//������һ�������long
		System.out.println("�������long��long= " + l);
		System.out.println("������һ��float");
		float f = 0;
		f = scanner.nextFloat();//������һ�������float
		System.out.println("�������float��float = " + f);
		System.out.println("������һ��double");
		double d = 0;
		d = scanner.nextDouble();//������һ�������double
		System.out.println("�������double��double = " + d);
		System.out.println("������һ��byte");
		boolean b = false;
		b = scanner.nextBoolean();//������һ�������boolean
		System.out.println("�������������boolean = " + b);
		String str = null;
		System.out.println("������һ���ַ���");
		str = scanner.next();
		System.out.println("��������ַ�����" + str);
		
	
	}
}
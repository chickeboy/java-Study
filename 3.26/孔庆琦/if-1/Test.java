/*
�Ӽ�������һ���ַ�����ΪСд��ĸ����ת��Ϊ��д��ĸ;
��Ϊ��д��ĸ����ת��ΪСд��ĸ;
����ת��ΪASCII����е���һ���ַ���
*/
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		//1.���̽���һ���ַ�
		char c = ' ';
		Scanner scanner = new Scanner(System.in);
		//�����Ͻ���һ���ַ���
		System.out.println("������һ���ַ�");
		String str = scanner.next();//�����ַ�����hello
		c = str.charAt(0);//0�������ȡ��һ���ַ�
		//2.�ж��Ǵ�С��ĸ����Сд��ĸ��ASCII�룬��Ӧ��һ��int���͵���ֵ
		//�ַ�������ѧ����ʱ����ת���ɶ�Ӧ��ASCIIֵ
		if(c >= 'a'  &&  c<= 'z'){//��ʾСд��ĸ Сдת��д - 32
			c = (char)(c - 32);//char��int����ѧ���������Զ�������Ȼ��ֵ����ߵ�ʱ����Ҫǿת
			// c-=32;����Ҫǿת���Զ�ת��
		}else if(c >= 'A' && c < 'Z'){
			c = (char)(c +32);
		}else{
			c += 1;
		}// if else if�ṹ����ֻ������һ������
		System.out.println("ת������ַ���......." + c);
	}
}
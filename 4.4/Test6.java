import java.util.Scanner;
public class Test6{
	public static void main(String[] args){
		//�ַ��Ĵ��������
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ַ�");
		char c = ' ';
		//�ַ��Ľ���һ��Ҫ�������ַ���,����ֻҪ�ַ����ĵ�һ���ַ�
		String str = scanner.next();
		c = str.charAt(0);//0��ʾ��һ���ַ�
		System.out.println("�ַ�Ϊ" + c);//����
		System.out.println();//�ǿ���û�в����ģ�����һ�����й���
		System.out.print(3);//print��������в���
		System.out.print(2);
		//ת���ַ�:���ַ����г��ֵ�������� 
			//\t�Ʊ�� ��һ��tab��  \r\n ���л���
		System.out.println("\'��\"\t");

	}
}


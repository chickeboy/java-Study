public class Test7{
	public static void main(String[] args){
		//���ʹ������������ֵ
		int a = 3;
		int b = 4;
		//1.Сѧ��д��
		a = a + b;// a = 7
		b = a - b;//b = 7 - 4 = 3
		a = a - b;//a =  7 - 3 = 4
		//2.ʹ�õ������������н���
		int temp = a;
		a = b;
		b = temp;
	}
}
/*
�ֱ��װ2����������fibonacci���е�n��������1,1,2,3,5,8,13,21...��
Ҫ��ʹ�����ַ�������ѭ�� ������

*/
public class Test{
	public static void main(String[] args){
		System.out.println("��9������......" + getByFor(9));
		System.out.println("��9������......" + getByArray(9));
	}

	public static int getByFor(int n){
		int a = 1;
		int b = 1;
		int c = 0;
		for(int i = 2;i < n ;i ++){
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
	//�����ȡ��Ӧ�Ľ��
	public static int getByArray(int n){
		int[] array = new int[n];//n��ʵ��������ĳ���
		array[0] = 1;
		array[1] = 1;//��ǰ���ֵ
		for(int i = 2; i < array.length;i++){//ǰ����ʡ�ԣ���Ϊ�Ѿ���ֵ���ˣ��±��2��ʼ����
			array[i] = array[i - 1] + array[i - 2];
		}
		return array[array.length-1];
	}
}
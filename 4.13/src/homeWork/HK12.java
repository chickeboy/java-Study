package homeWork;
/*12.ʹ���������쳲��������е�ǰ10��ֵ��Ȼ��������*/
public class HK12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arry[] = new int[10];
		int a =1;
		int b = 1;
		int c = 0;
		for(int i = 0;i<arry.length;i++) {		
			arry[i] = a;
			c = a+b;
			a = b;
			b = c;
		}
		for(int  i = 0;i<arry.length;i++) {
			System.out.println(arry[i]);
		}
	}

}

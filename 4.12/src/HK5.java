/*5.ʹ��do-whileʵ�֣���������¶��뻪���¶ȵĶ��ձ�
 * Ҫ�����������¶�0�ȵ�250�ȣ�ÿ��20��Ϊһ����ձ��е���Ŀ������10����
ת����ϵ�������¶� = �����¶� * 9 / 5.0 + 32*/
public class HK5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���϶�" + "\t" + "���϶�");
		int i=0;
		int a = 0;
		do {		
			double b = a*9/5.0+32;
			System.out.println(a+"\t" +b);
			a+=20;
			i++;
		}while(i<=10);
	}

}

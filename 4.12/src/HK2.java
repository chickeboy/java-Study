import java.util.Scanner;

/*2.����һ��������Ʒ���»
�����
�������һ�����ӵļ۸�2000-10000֮�䣩��
�û�ȥ���¼۸������5���ڲ¶Լ۸񣬱�ɻ�ô���Ʒ��
������5�Σ���ʾ���ܿ�ϧ����û�л�ý�Ʒ�����½�����
������5���ڲ¶ԵĻ�����ʾ����ϲ�㣬����˴˽�Ʒ������*/
public class HK2 {
public static void main(String[] args) {
	int a = (int)Math.floor(Math.random()*8000+2000);
	System.out.println(a);
	Scanner scanner = new Scanner(System.in);
	int i = 0;
	while(true) {
		if(i==5) {
			System.out.println("�ܿ�ϧ����û�л�ý�Ʒ�����½���");
			break;
		}
		int b = scanner.nextInt();
		if(a==b) {
			System.out.println("��ϲ�㣬����˴˽�Ʒ��");
			break;
		}		
		i++;
	}
}
}

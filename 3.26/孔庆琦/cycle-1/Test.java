/*
��������
����һ��������Ʒ���»,�����
�������һ�����ӵļ۸�2000-10000֮�䣩��
�û�ȥ���¼۸������5���ڲ¶Լ۸�
��ɻ�ô���Ʒ��������5�Σ���ʾ���ܿ�ϧ����û�л�ý�Ʒ�����½�������
��5���ڲ¶ԵĻ�����ʾ����ϲ�㣬����˴˽�Ʒ��������

*/
import java.util.*;//��ʾutil�����еĹ���
public class Test{
	public static void main(String[] args){
		int price = 0;
		Random random = new Random();// ���������
		price = 2000 + random.nextInt(8001);// ����Ĳ�����ʾ��������ķ�Χ0 - ?
		// ����Ĳ���ֵ ��ѭ������ҿ���ԭ�� �����>=0 && <����
		Scanner scanner = new Scanner(System.in);
		int userPrice = 0;//�û�����ļ۸�
		System.out.println(price);
		for(int i = 0; i < 5;i++){
			System.out.println("������һ���۸�,������2000-10000�ļ۸�");
			userPrice = scanner.nextInt();//ÿ���û������ֵ���Ḳ��ԭ���ı����б����ֵ
			if(userPrice > 10000 || userPrice < 2000){//Ҫ�Ѳ���Ҫ��������������Χд�ڿ�ͷ
				System.out.println("����ļ۸��ڷ�Χ��");
			}else if(userPrice == price){
				System.out.println("��ϲ��ϲ,�н���");//�н���Ӧ������ѭ����Ϸ����
				break;//����
			}else{
				System.out.println("������˼���û���н�");
			}
			if(i == 4){//����4��ʾѭ����ʵ�Ѿ��ǲ¹�5����
					System.out.println("��Ǹ���´�5���ˣ���Ϸ������");
			}
		}
	}
}
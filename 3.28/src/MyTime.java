import java.util.Date;

/*
�ڳ����У�����Ҫ��ʱ����в��������ǲ�û��ʱ�����͵����ݡ���ô�����ǿ����Լ�ʵ��һ��ʱ���࣬����������е���Ҫ��
������ΪMyTime���࣬����Ӧ���������ͳ�Ա��ʱ��hour�����֣�minute�����루second����Ϊ�˱�֤���ݵİ�ȫ�ԣ�
��������Ա����Ӧ����Ϊ˽�С�
ΪMyTime�ඨ�幹�췽�����Է��㴴������ʱ��ʼ����Ա������
�ٶ���diaplay���������ڽ�ʱ����Ϣ��ӡ����������ĳ�Ա�����뷽�������췽����
*/
public class MyTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTime myTime = new MyTime();
		myTime.diaplay();
	}
	void diaplay() {
		MyTime myTime = new MyTime();
		Date date = new Date();
		int hours = date.getHours();
		int min = date.getMinutes();
		int scors = date.getSeconds();
		System.out.println(hours + ":" + min + ":" + scors);
	}

}

package HomeWork;
/*1.(����2��)������������:��һ�������߶���
����һ�������߶������������������Ӷ����з�ƻ����
ÿ��1���������ߴ�������ȡ�߳Ե�1��ƻ������
������1��,�Ե�1����������4�֡�*/
public class hk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basket basket = new Basket();
		new MyThread(basket).start();
		new MyThread2(basket).start();
	}

}

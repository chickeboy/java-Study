/*
��д��k!�ķ������ٵ��ø÷�����1!+2��+3��+....10!֮�Ͳ������
*/
public class Test{
	public static void main(String[] args){
		//System.out.println(getOne(4));
		double sum = getSum(10);
		System.out.println("���Ľ����     " + sum);
	}
	//��ÿ�����Ľ׳˵��߼���һ���ģ�����Ӧ�ý�����߼�����д��һ��������������ʹ��
	public static double getOne(int k){
		double sum = 1;//�����1
		for(int i = 1;i <= k; i++){
			sum *= i;
		}
		return sum;
	}
	public static double getSum(int n){//n���������͵���
		double sum = 0;
		for(int i = 1;i <=n;i++){
			double num = getOne(i);
			System.out.println(i + "���Ľ׳���..............." + num);
			sum +=num;
		}
		return sum;
	}
}
/*�����˼�ָ�����һ��Ȥζ����ѧ���⣺һ����30���ˣ����ܰ������ˣ�Ů�˺�С����
������һ�ҷ��ݳԷ�������50�������ÿ�����˻�3���ÿ��Ů�˻�2���ÿ��С����1���
�������ˡ�Ů�˺�С�������ˣ����дһ�����������㡣*/
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a = 0;a<=30;a++) {
			for(int b = 0;b<=30;b++) {
				for(int c = 0;c<=30;c++) {
					if(c+2*b+3*a==50&&a+b+c==30) {
						System.out.println("����:"+a+"Ů��:"+b+"С��:"+c);
					}
				}
			}
		}
	}

}

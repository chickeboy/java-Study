package HK4;
/*������³�������ģ���ֻ�ʹ�õ�صĹ��̣�
���磺��绰ÿ����Ҫʹ�ðٷ�֮1�ĵ�أ�
ÿ��ʹ����ʾ����ǰ�ֻ�ʣ�������ʣ��0��Ϊú�磬
��ʾ�û���Ҫ��磬�ֻ��͵�ض�Ӧ���ж�Ӧ��Ʒ������*/
public class HK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MI mi = new MI();
		for(int i = 0;;i++) {
			try {
				Thread.sleep(1000);
				int c = mi.out();
			if(c>0) {
				System.out.println("��ػ�ʣ�£�"+c);
			}else {
				System.out.println("��Ҫ���");
				break;
			}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}

}

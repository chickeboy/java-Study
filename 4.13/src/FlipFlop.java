/*����һ������Ϊ��FlipFlop������ϷӦ�ó���
����1������100������3�ı������滻Ϊ���ʡ�Flip��,
5�ı������滻Ϊ���ʡ�Flop��,
��Ϊ3�ı�����Ϊ5�ı������滻Ϊ���ʡ�FlipFlop��,
��������������ǰ����*/

public class FlipFlop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i<=100;i++) {
			if(i%3==0&&i%5==0) {
				System.out.println("FlipFlop");
				continue;
			}else if(i%3==0) {
				System.out.println("Flip");
			}else if(i%5==0) {
				System.out.println("Flop");
			}else {
				System.out.println(i);
			}
		}
	}

}

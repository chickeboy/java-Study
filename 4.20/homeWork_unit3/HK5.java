//23.����뾶��1��ʼ��10��Χ�����С�ڵ���10��Բ���
public class HK5{
	public static void main(String[] args){
		double area = 0;
		for(int i = 1;i<=10;i++){
			area = Math.pow(i,2)*Math.PI;
			if(area<10){
				System.out.println(area);
			}
		}
	}
}
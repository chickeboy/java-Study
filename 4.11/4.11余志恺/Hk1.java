package hk;
//1.	����뾶��1��ʼ��10��Χ�����С�ڵ���10��Բ���
public class Hk1{
	public static void main(String[] args){
		double sum = 0;
		for (int r = 1;r<11;r++){
			sum = Math.pow(r,2)*Math.PI;
			if (sum>10){
				break;
			}System.out.println("�뾶Ϊ"+r+"��Բ���Ϊ"+sum);
		}
}
}
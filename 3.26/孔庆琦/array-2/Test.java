/*
ģ��Ϊ���ִ�֣��ڸ質�����У�
����10λ��ί���д�֣��ڼ�����ֵ÷�ʱ��
ȥ��һ����߷֣�ȥ��һ����ͷ֣�
Ȼ��ʣ���8λ��ί�ķ�������ƽ����
���Ǹ�ѡ�ֵ����յ÷֡�����ÿ����ί�����֣���ĳѡ�ֵĵ÷֡�
*/
import java.util.*;
public class Test{
	public static void main(String[] args){
		double[] array = new double[10];
		Scanner scn = new Scanner(System.in);
		//��ѡ�ֵ�������ʵ����ѭ��¼���������ݵ�һ������
		for(int i = 0; i < array.length;i++){
			System.out.println("������һ������");
			double score = 0;
			score = scn.nextDouble();
			if(score >100||score < 0){//���Ϸ�������ȥ¼���������
				System.out.println("������ķ������Ϸ�������������");
				i--;//��ʾ������±����һ����Ҳ����ѭ���������±�ͬʱ����
			}else{
				array[i] = score;
			}
			
		}
		//Arrays���������һϵ�в����Ĺ����࣬�ṩ�˺ܶ�ļ��ķ���
		Arrays.sort(array);//����Arrays.sort()��������������������
		//�����0��λ����Сֵ�����һλ�����ֵ array.length - 1
		double sum = 0;
		//����ܷ֣���ȻҪȥ��2����
		for(int i = 1 ; i< array.length - 1;i++){
			sum += array[i];
		}
		double avg = 0;//ƽ����
		avg = sum / (array.length - 2);
		System.out.println("����ƽ������..............." + avg);
	}
}
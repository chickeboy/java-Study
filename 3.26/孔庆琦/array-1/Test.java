/*
�������40��10��50��������
ͳ��ÿ�����ָ����ּ��Σ�
����0�ε����ֲ���ӡ��
����������������������֣�
�������ֵĴ���
*/
import java.util.Random;
public class Test{
	public static void main(String[] args){
		int[] array = new int[40];//����40���ȵ�����
		Random random = new Random();//����һ��������Ĺ��߶���
		//������������ݵ�¼��
		for(int i = 0;i < array.length;i++){
			array[i] = 10 + random.nextInt(41);//����ҿ��������ұ���С�ڲ���С�ڵ���
		}
		//����Ļ�ҪĬ�����е�10-50�а��������ֶ����ֹ�
		
		int maxNum = 0;//���ִ����������
		int maxCount = 0;//�����������ֳ��ֵĴ���
		for(int i = 10; i < 51 ; i++){
			int count = 0;//����ѭ����Ļ�֮����ۼӾ͵����˽���Ĳ���ȷ
			//����Ӧ���ü�������ÿ��ѭ����ʼʱ����ʼ��
			for(int j = 0;j < array.length;j++){
				if(array[j] == i){//����ֵ�������г�����
					count++;//������+1
				}
			}//��ѭ��ִ����Ͼ�Ҫ��ӡ���ֺͳ��ֵĴ���
			if(count!=0){//Ҫ�жϷ�0��
				System.out.println(i + "������................." + count + "��");
			}
			if(count > maxCount){
				maxCount = count;//����ֵ
				maxNum = i;//����������������
			}
		}
		System.out.println("���ִ������������� " + maxNum +"������........" + maxCount+"��");
	}
}
/*
��100��С����������Χ��һȦ��
�ɵ�һ��С���ѿ�ʼ��1��ʼ����
����3��С�����˳���
�ٴӺ����С���Ѵ�1��������3�����˳���
�Դ���Ϸ��ȥ�������ʣ���ĸ�С���ѣ�
*/

public class Test{
	public static void main(String[] args){
		//100��С���Ѿʹ���������ĳ���
		boolean[] array = new boolean[100];//��ʼֵ����false
		for(int i = 0 ; i < array.length; i ++){
			array[i] = true;//��ʾĬ�϶���Ȧ��
		}
		int count = array.length;//Ȧ�ڻ����ڵ�ʵ������
		int index = 0;
		int mcount = 0;//����������¼���ҷ�����һ���������ֵ��2
		while(count > 1){//ʲôʱ����ǽ���,Ȧ��ֻ��һ���˵�ʱ����ǽ���
			if(array[index]){//array[i] ==true��ʾ��������
				mcount++;//�������Ľ����3
				if(mcount==3){//��ʾ�Ѿ�����3������
					array[index] = false;//��ʾ�ľ���������Ѿ�����Ȧ����
					mcount = 0;//��0
					count --;//������Ӧ�ü�һ
				}
			}
			//����λ�����Ƿ����ˣ����Ƕ��б�Ҫȥ�������λ��
			index++;//����ÿ��λ��
			if(index == 100){
				index = 0;//������������β���ˣ���Ҫ��0��λ���¿�ʼ
			}
		}
		
		//������ʣ�µ��Ǹ��˵�λ��
		for(int i = 0 ; i < array.length; i ++){
			if(array[i]){
				System.out.println("ʣ�µ�С������..................��" + (i + 1) +"λ");
			}
		}
	}
}
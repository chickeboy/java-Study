package tk;
/*��100��С����������Χ��һȦ���ɵ�һ��С���ѿ�ʼ��1��ʼ����
����3��С�����˳����ٴӺ����С���Ѵ�1��������3�����˳���
�Դ���Ϸ��ȥ�������ʣ���ĸ�С���ѣ�*/
public class HK7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		int count = 0;
		int index = array.length;
		while (index > 1) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] != -1) {
					count++;
					if (count == 3) {
						array[i] = -1;
						count = 0;
						index--;
					}
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] != -1) {
				System.out.println(i+1);
			}
		}
	}

}

public class Tk3{
	/*
	�õ�ѭ����ӡ99�˷���
	1.��һ�����ڵڶ���
	2.������ֵ��ͬ��ʱ��Ӧ�û���
	3.
	*/
	public static void main(String[] args){
		int i = 1;
		int j = 1;
		while(j < 10){
			System.out.print(i + "*" + j + "=" + i * j + "\t");
			if(i == j){
				System.out.println();
				i = 0;
				j++;
			}
			i++;
			
		}
	}
}
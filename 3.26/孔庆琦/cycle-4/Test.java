/*
��ӡ����������
        *
     * * * 
  * * * * *
* * * * * * *
   * * * * *
     * * *
        *
*/
public class Test{
	public static void main(String[] args){
		//��ѭ���Ĵ��������������εĸߣ�Ҳ�������ӡ�˶����е�����
		for(int i = 1; i < 5 ; i ++){//i����Ҫ��1��Ȼ�ٴ�һ��*
			//��ѭ��ִ��һ�Σ���ѭ��Ҫ��2�����飬1.��ӡ�ո�2.��ӡ*
			// ��ѭ����Ϊÿ����ѭ��ִ�й��󶼻ᷢ�������ĸı䣬������ѭ��
			// ����������ȡֵ��ΧӦ�ø�����ѭ���ı���i�������ж�
			for(int j = 0;j < 4 - i; j ++){
				System.out.print(" ");//���ﲻ�ܻ���
			}
			//��ӡ*
			for(int k = 0 ;k < 2 * i - 1;k++){
				System.out.print("*");
			}
			//����
			System.out.println();
		}
		//��������
		for(int i = 1; i < 4;i++){//����Ҫ�ٴ�һ��
			for(int j = 0; j < i;j++){
				System.out.print(" ");//���ﲻ�ܻ���
			}
			for(int k = 0;k < 2 * (4 - i) - 1;k ++){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
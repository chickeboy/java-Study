/*28.��100��С����������Χ��һȦ��
�ɵ�һ��С���ѿ�ʼ��1��ʼ����
����3��С�����˳���
�ٴӺ����С���Ѵ�1����
����3�����˳����Դ���Ϸ��ȥ��
�����ʣ���ĸ�С���ѣ�*/
public class HK6{
	public static void main(String[] args){
		boolean array[] = new boolean[100];
		for(int i =0;i<array.length;i++){
			array[i] = true;
		}
		int index = array.length;
		int count = 0;
		while(index>1){
			for(int i = 0;i<array.length;i++){
				if(array[i]){
					if(count==3){
						count = 0;
						array[i]=false;
						index--;
					}
					count++;	
				}
			}
		}
		for(int i =0;i<array.length;i++){
			if(array[i]){
				System.out.println(i);
			}
		}
		
	}
}
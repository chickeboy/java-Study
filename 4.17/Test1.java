/*ð������
public class Test1{
	public static void main(String[] args){
		int array[] = {2,9,6,3,5,7,8,4};
		for(int i = 0;i<array.length;i++){
			for(int j = 0;j<array.length-1-i;j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
 				}
			}
		}
		for(int i = 0;i<array.length;i++){
			System.out.print(array[i] + "\t");
		}
		
	}
}*/
/*ѡ������
public class Test1{
	public static void main(String[] args){
		int array[] = {2,9,6,3,5,7,8,4};
		for(int i = 0;i<array.length-1;i++){
			int min = i;
			for(int j = i+1;j<array.length;j++){
				if(array[j]<array[min]){
					min = j;
				}
				if(min!=i){
					int temp = array[i];
					array[i] = array[min];
					array[min] = temp;
				}
			}
		}
		for(int i = 0;i<array.length;i++){
			System.out.print(array[i] + "\t");
		}
	}
}*/
/*//����һ�����飬¼��5�����ݣ�������е����ֵ����Сֵ
public class Test1{
	public static void main(String[] args){
		int array[] = {2,9,6,3,5,7,8,4};
		int max = array[0];
		int min = array[0];
		for(int i= 0;i<array.length;i++){
			if(array[i]<min){
				min = array[i];
			}
			if(array[i]>max){
				max = array[i];
			}
		}
		System.out.print("��Сֵ"+min+"\t"+"���ֵ"+max);
	}
}*/
/*//����һ�����飬¼��7�����ݣ�ʹ��ð������������
public class Test1{
	public static void main(String[] args){
		int array[] = {2,9,6,3,5,7,8,4};
		for(int i =0;i<array.length;i++){
			for(int j = 0;j<array.length-i-1;j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
			}
		}
		for(int i = 0;i<array.length;i++){
			System.out.print(array[i]+"\t");
		}
		
	}
}*/
public class Test1{
	public static void main(String[] args){
		int array[] = {2,9,6,3,5,7,8,4};
		for(int i = 0;i<array.length-1;i++){
			int min = i;
			for(int j = i+1;j<array.length;j++){
				if(array[j]<array[min]){
					min = j;
				}
				if(min!=i){
					int temp = array[i];
					array[i] = array[min];
					array[min] = temp;
				}
			}
		}
		for(int i= 0;i<array.length;i++){
			System.out.print(array[i] + "\t");
		}
	}
}

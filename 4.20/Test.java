/*//��дһ������������һ������Ϊ5�����飬�����ֶ�¼��5�����ݣ����ұ�����������ò���
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		
		int array[] = new int[5];
		array(array);
	}
	public static void  array(int array[]){	
		Scanner scanner = new Scanner(System.in);
		for(int i = 0;i<array.length;i++){
			System.out.println("�������"+(i+1)+"������");
			array[i] = scanner.nextInt();
		}
		for(int i = 0;i<array.length;i++){
			System.out.println(array[i])
		}
	}
}*/
/*//��дһ�����������鳤�����ⲿ�������룬���������ֵ��������������ò���
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a  = scanner.nextInt();
		array(a);
	}
	public static void  array(int a){	
		int array[] = new int[a];
		for(int i = 0;i<array.length;i++){
			array[i] = (int)Math.floor(Math.random()*10);
		}
		for(int i = 0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}*/	
/*����һ������Ϊ4������
(1)��дһ����������������
(2)�ֶ�¼�����ݱ�дһ�����������ڱ�������
(3)���ò���
*/
/*public class Test{
	public static void main(String[] args){
		traverse(array());
	}
	public static int[] array(){
		int array[] ={1,2,3,4};
		return array;
	}
	public static void traverse(int array[]){
		for(int i = 0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}*/
/*����һ������Ϊ4������
(1)��дһ���������ֶ�¼��4������
(2)����¼�뷽��������������һ��������ѯ�Ƿ���ڣ�������ڴ�ӡ�������ֵ��±�λ�ã������������-1
(3)���ò���
*/
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		traverse(array());
	}
	public static int[] array(){
		int array[] =new int[4];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0;i<array.length;i++){
		System.out.println("�������"+(i+1)+"������");	
		array[i] = scanner.nextInt();
		}
		return array;
	}
	public static void traverse(int array[]){
		Scanner scanner = new Scanner(System.in);
		int index = -1;
		int a= scanner.nextInt();
		for(int i = 0;i<array.length;i++){
			if(array[i]==a){
				index = i;
			}
		}
		if(index == -1){
			System.out.println("������");
		}else{
			System.out.println(a+"�ڵ�"+ (index+1)+"��λ��");	
		}
	}
}



import java.util.Scanner;
public class LinearSunch{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int array[] = {10,100,80,50,70,60,90};
		System.out.println("������Ҫ���ҵ�����");
		int index = scanner.nextInt();
		boolean input = false;
		int i;
		for(i = 0;i < array.length ; i++){
			if(array[i] == index){
				i+=1;
				input = true;
				break;
			}
		}
		if(input){
			System.out.println("���ҵ���������ǵ�" + i + "λ��");
		}else{
			System.out.println("�Ҳ����������" );
		}
		 
	}
}
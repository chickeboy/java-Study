import java.util.Scanner;
public class Test{
	public static void main(String[] args){	
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������鳤��");
		int i = scanner.nextInt() ;
		String array[] = new String[i];
		for(i = 0;i<array.length;){
			System.out.println("�������" + (int)(i+1) + "���ַ�");
			String str = scanner.next();
			if(str.length() <= 3){
				array[i] = str;
				i++;
			}else{
				System.out.println("�ַ������ȳ���3��");
				
			}
		}
		for(i = 0;i<array.length;i++){
			System.out.println("��" + (int)(i+1) + "���ַ���");
			System.out.println(array[i]);
		}
	}
}
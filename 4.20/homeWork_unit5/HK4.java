//31.��дһ�����������һ���ַ����г���ĳһ���ַ��Ĵ��������û�г��ֹ��������û���ҵ���
import java.util.Scanner;
public class HK4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		String str2 = scanner.next();
		char cha =str2.charAt(0);
		find(cha,str);
	}
	public static void find(char cha,String str){
		char array[] = str.toCharArray();
		boolean bool = false;
		//System.out.println(cha);
		for(int i =0;i<array.length;i++){
			//System.out.println(array[i]);
			if(array[i]==cha){
				System.out.println(cha+"�ڵ�"+(i+1)+"��λ��");
				bool = true;
				break;
			}
		}
		if(bool==false){
			System.out.println("û���ҵ�");
		}
	}
}
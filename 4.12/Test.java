//������е�ˮ�ɻ�������λ��������֮�͵������������λ�����������
/*public class Test{
	public static void main(String[] args){		
		for(int i = 100;i<1000;i++){
			double sum = 0;
				sum  = Math.pow(i% 10,3)+Math.pow(i/10%10,3)+Math.pow(i/100%10,3);
				if(sum == i){
					System.out.println(sum);
				}			
			}					
		}
	}*/
//�Ӽ�������һ�����������ж����Ƿ���������������������ֻ�ܱ�1���䱾����������
/*import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String str = "������";
		int a = scanner.nextInt();
		for(int i = 2;i<a;i++){
			if(a%i==0){
				str = "��������";
				break;				
			}
		}
		System.out.println(a+str);
	}
}*/
//��ӡ1900�굽2100��֮������꣬һ�д�ӡ4��
/*public class Test{
	public static void main(String[] args){
		int a = 0;
		for(int i = 1900;i<=2100;i++){
			if((i%4==0&&i%100!=0)||i%400==0){
				System.out.print(i + "\t");
				a++;
			}
			if(a%4==0){
				System.out.println();
			}
		}
	}
}*/
//��֪����1/2,2/3,3/5,5/8,...,����ǰ20��֮��
public class Test{
	public static void main(String[] args){
		double a1 = 1;
		double a2 = 2;
		double a3 = 0;
		double c = 0;
		double sum = 0;
		for(int i = 1;i<=20;i++){		
			c = a1/a2;	
			a3 = a1+a2;	
			a1 = a2;			
			a2 = a3;			
			sum+=c;
		}
		System.out.println(sum);
		
	}
}
/*�Ӽ�������һ���ַ�����@����������Ҫ����ܲ������������ʹ�ù��߷���
���ܹ���:
1��������ĸ��ת��ΪСд��
2��������ĸ'a'��'y'����ת��Ϊ��һ����ĸ��
3������'z'����ת��Ϊ'a'��
4�������ַ������ֲ��䡣*/
/*import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		for(int i = 0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch == '@'){
				break;
			}else if(ch<='Z'&&ch>='A'){
				System.out.print(ch+=32);
			}else if(ch>='a'&&ch<='y'){
				System.out.print(ch+=1);
			}else if(ch=='z'){
				System.out.print(ch='a');
			}else{
				System.out.print(ch);
			}
		}
	}
}*/

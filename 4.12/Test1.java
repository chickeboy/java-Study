//6.2006������ѧԱ8���ˣ�ÿ������25%�����ʰ��������ٶȣ�����һ����ѵѧԱ�������ﵽ20����
/*public class Test1{
	public static void main(String[] args){
		double a = 8;
		int i  = 2006;
		while(a<=20){
			a = a+a*0.25;
			i++;
		}
		System.out.println(i);
	}
}*/
//���1-1000�����м����Ա�3Ҳ���Ա�5���������ĺ�
/*public class Test1{
	public static void main(String[] args){
		int i = 1;
		while(i<=1000){
			if(i%3==0&&i%5==0){
				System.out.println(i);
			}
			i++;
		}
	}
}*/
//�Ӽ�������һ����������������ǰ���ú����
/*import java.util.Scanner;
public class Test1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int i = 0;
		int b = 0;
		while(Math.pow(10,i)<a){
			
			b = b*10+a/(int)Math.pow(10,i)%10;
			i++;
		}
		System.out.println(b);
	}
}*/
//�Ӽ��������˺����룬ȫ��������������˺Ŵ��󣬶�������ʾ
//ֱ��������ȷΪֹ
/*import java.util.Scanner;
public class Test1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);		
		String name1 = "abcdef";		
		String pasw1 = "aa12345";
		while(true){
			String name = scanner.next();
			String pasw = scanner.next();			
			if(!name.equals(name1)&&!pasw.equals(pasw1)){
				System.out.println("ȫ������");
				continue;
			}else if(!name.equals(name1)){
				System.out.println("�˺Ŵ���");
				continue;
			}else if(!pasw.equals(pasw1)){
				System.out.println("�������");
				continue;
			}else{
				System.out.println("������ȷ");
				break;
			}
		}
	}
}*/
//��ӡ��쳲��������е�ǰ10��ֵ
public class Test1{
	public static void main(String[] args){
		int i = 0;
		int a = 1;
		int b = 0;
		int c = 0;
		while(i<10){	
			c= a+b;
			a = b;
			b = c;
			i++;
			System.out.println(c);
		}
	}
}


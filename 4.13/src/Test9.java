import java.util.Scanner;

/*�Ӽ�������5��������һά�����У�������±�Ϊ������Ԫ�أ�������±�Ϊż����Ԫ�ء�*/
public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int arry[] = new int[5];
		for(int i = 0;i<arry.length;i++) {
			System.out.println("�������"+ (i+1)+"������");
			arry[i] = scanner.nextInt();
		}
		System.out.println("�±�Ϊ������Ԫ��");
		for(int i = 0;i<arry.length;i++) {
			if(i%2!=0) {
				System.out.println(arry[i]);
			}
		}
		System.out.println("�±�Ϊż����Ԫ��");
		for(int i = 0;i<arry.length;i++) {
			if(i%2==0) {
				System.out.println(arry[i]);
			}
		}
	}

}

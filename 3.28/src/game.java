import java.util.Scanner;

/*
1.��������Ϸ��һ����A��һ����Ա����v����һ����ֵ100��
����һ���࣬��A��ĳ�Ա����v���в¡������������ʾ���ˣ�
С������ʾС�ˡ���������ʾ�²�ɹ�������ĳ�Ա������
*/
public class game {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
        b.ccc();
	}
}

class B {
	A a = new A();
	public void ccc() {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("����������");
			int z = scanner.nextInt();
			a.gess(z);
		}
	}
}

class A {
	int v = 100;
	B b = new B();
	public void gess(int z) {
		if (z > v) {
			System.out.println("����");
		} else if(z == v){
			System.out.println("��ϲ������");
		}else {
			System.out.println("С��");
		}
	}
}

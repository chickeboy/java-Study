package tk2;

/*
 * �ӿںͳ����������
 * 1.�ؼ��ֲ�һ�� class  interface
 * 2.extends is - a�Ĺ�ϵ    implements ʵ�ֹ�ϵ
 * 3.������һ����г�Ա���� �ӿ���һ��ֻ���г��󷽷�
 * 4.jdk1.8֮ǰ�涨�ӿ���ֻ���г��󷽷�
 *  ���ǵ���jdk1.8�ӿ��п��Դ��Ĭ�Ϸ���
 * 5.�ӿڿ����ñ�����֮��û�й��Ե������Ϊһ����
 * ������û�в�����ϵ
 * 6.�ӿڿ��Զ�ʵ��Ҳ���Զ�̳�
 */
public class Tk3 {
	public static void main(String[] args) {

	}
}

class G {
	public void lead(Animal ani) {
		ani.fly();
	}
}

class Animal {
	public void fly() {

	}
}

class P extends Animal {

}

class B extends Animal {

}

package tk2;

/*
 * �ӿ�:interface����ʵ�ӿ���һ�ִ���淶
 * �ӿ���ʵ��һ������ĳ����࣬���ǲ�����
 * ����ŵĶ��ǳ��󷽷�
 * �ӿھ��ǽ�һЩ�๲�е���Ϊ��ȡ����
 * ����һ��ŵĶ��Ƕ��������󷽷���
 * �ӿڲ���˽�л�
 */
public class Tk2 {
	public static void main(String[] args) {
		Fly fly = new Bird();
		God god = new God();
		god.leadFly(fly);
		fly = new Person();
		god.leadFly(fly);
	}
}

class God {
	public void leadFly(Fly fly) {// ���л�ɵĶ��������Դ���
		// �ӿڵ����ÿ���ָ��ʵ�������
		fly.fly();
	}

}

//ʵ�ֽӿڣ�����ʵ�����е����г��󷽷�
//Ҫô�Լ�����������ȥ
class Person implements Fly {

	@Override
	public void fly() {
		System.out.println("���һ�");
	}

}

class Bird implements Fly {

	@Override
	public void fly() {
		System.out.println("����");
	}
}

/*
 * �˺��񶼻��
 */
interface Fly {
	// �ӿ�������ž�̬����,�ӿڱ���Ҳ�ǲ���ʵ������
	// Ҫ���ֽӿ��е���Ϊ��ֻ������ʵ����Ķ���
	public static final int a = 3;

	public abstract void fly();// д�ڽӿ���ķ���Ĭ�϶��ǳ����
//	public default void eat() {
//		System.out.println("ffff");
//	}
}

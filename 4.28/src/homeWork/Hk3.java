package homeWork;

import java.util.Scanner;

/*���һ������Ů���ѵĹ���(����û�п�����Ů����)�������� 
Ҫ�� 
1�����BaseGF�࣬���г����޲η��� eat(),��ͨ�޲η���shopping(), 
2����������ֱ�̳�BaseGF 
3�����GFFactory�࣬���о�̬����:BaseGF createGF(String gfType) 
4�����gfType�жϣ�ֻ���ǣ��Ĵ����㶫��ɽ�� 
5�����ԣ��ֱ𴴽�������Ķ��󣬲����ö������������ */
public class Hk3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ط�");
		Scanner scanner = new Scanner( System.in);
		String gfType = scanner.next();
		GFFactory gfFactory = new GFFactory();
		BaseGF baseGF = gfFactory.BaseGFcreateGF(gfType);
		if(gfType==null) {
			System.out.println("û������ط�������");
		}else {
			baseGF.shopping();
			baseGF.eat();
		}
		

	}

}
class GFFactory{
	public static BaseGF BaseGFcreateGF(String gfType) {
		BaseGF baseGF = null;
		switch (gfType) {
		case "�Ĵ�":
			baseGF = new girl("����", gfType);
			break;
		case "�㶫":
			baseGF = new girl("����", gfType);
			break;
		case "ɽ��":
			baseGF = new girl("����", gfType);
			break;

		default:
			break;
		}
		return baseGF;
	}
}
abstract class BaseGF{
	private String name;
	private String local;
	public BaseGF(String name, String local) {
		super();
		this.name = name;
		this.local = local;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	abstract void eat();
	public void shopping() {
		// TODO Auto-generated method stub
		System.out.println("��"+getLocal()+"����һ������");
	}
}
class girl extends BaseGF{

	public girl(String name, String local) {
		super(name, local);
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("��"+getName()+"һ��Զ���");
	}
	
}
class girl1 extends BaseGF{

	public girl1(String name, String local) {
		super(name, local);
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("��"+getName()+"һ��Զ���");
	}
	
}
class girl2 extends BaseGF{

	public girl2(String name, String local) {
		super(name, local);
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("��"+getName()+"һ��Զ���");
	}
	
}
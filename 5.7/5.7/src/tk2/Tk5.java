package tk2;

public class Tk5 {
	public static void main(String[] args) {

	}
}

class U {
	public void show() {
		class In {// ֻ��Ϊshow��������
			// Ҳ����u�Ķ����ڵ���show��ʱ�������Ż����
			// show�����������������ʧ
			private String name = "in";

			public In(String name) {
				super();
				this.name = name;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public void show() {
				System.out.println(name);
			}
		}
		In in = new In("ffff");
		in.show();
	}

}

package tk2;

/*
 * �ڲ���:Ϊ���ֲ�Java���̳�
 * �������ⲿ����ڲ�Ƕ��һ���࣬�������ȥ�̳б��˵Ķ���
 * ��ô�ⲿ��ͨ���ڲ���Ҳ���Ի�ȡ�������������
 * ��Ա�ڲ���
 * ��̬�ڲ���
 * �ֲ��ڲ���
 * �����ڲ���
 * 
 * 
 * 
 * 
 */
public class Tk2 {
	public static void main(String[] args) {
		// ��δ����ڲ���Ķ���
		Out out = new Out();
		Out.In in = out.new In();// �ڲ��ഴ��������Ҫ�����ⲿ��Ķ���
		out.show();
		in.show();
	}
}

class Out {
	private String name = "Out";

	class In {
		private String name = "In";

		public void show() {// �ڲ�������ⲿ����������ӷ�������Ȩ��
			System.out.println(this.name);// �Լ���˽������
			// �ڲ�����ⲿ���������ĳ�Ա����
			System.out.println(Out.this.name);
		}
	}

	// �ⲿ������ڲ���ĳ�Ա���ԣ��ܲ��ܷ�������Ȩ�޵�Ӱ��
	public void show() {
		In in = new In();// ����Ҫ�����ڲ���Ķ���
		System.out.println(in.name);
	}
}

package hk4;
/*��һ����������һ��������alive
������������������������͹�������(work����)��
�ڹ���;�п��ܻ��������׳��Զ����쳣
��SickException������
Ҳ�����ǽ�����û����.(ͨ��������������������)��
��һ��ҽ����⹤���߹�����һ�����������������
�͵���cure(Worker worker)�����������β���
��ͨ������������ƣ���������Ҳ����������������alive��ֵ����
�����ж�alive����ֵҪ��������ʵ����ϲ�㡱��Ҫ��������ʾ��sorry�����ˡ��� */
public class hk4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker worker = new Worker();
		try {
			worker.woker();
		} catch (SickException e) {
			// TODO Auto-generated catch block
			System.out.println(e.cure(worker));
		}
	}

}

package HomeWork3;

import java.io.File;

/*����һ�������࣬����name.age.sex��
�Ӽ������붯�����Ϣ��ͬʱʹ��io��������Щ��Ϣ
��d:\\1.txt�����ҽ���Щ��Ϣ����붯��Ķ���
�����һ��TreeSet���ϣ�Ҫ����������������
ֻҪ����5�����󼴿ɣ���󴴽�һ��������
��ȡ1.txt�е���Ϣ���������ӡ*/
public class HK3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("1.txt");
		Manager manager = new Manager(file);
		manager.write();
		manager.read();
	}

}

package tk;

import java.util.ArrayList;
import java.util.List;

/*����һ��Student��,id  name  age  score
����һ��StudentManager�� �ṩ��ѧ������ĸ��ַ���
���д���·���
1.�ֶ���ѧ�����ݽ���¼�룬id�ظ������ݲ������
2.�����������ѧ����Ϣ
3.����һ��id��ȡ��ѧ����������Ϣ
4.����һ��name��ȡ���ж�Ӧѧ������Ϣ
5.��ȡ�������䳬��15��ѧԱ��Ϣ
6.����һ��idɾ����ѧ����Ϣ
7.����һ��name���ȴ�ӡ����name��Ӧ��ѧ����Ϣ��Ȼ����ѡ��ɾ�������ĸ�ѧ����Ϣ
8.ʹ�������ڲ���Լ��ϸ���score��������*/
public class tk {

	public static void main(String[] args) {
		List<Student> arrayList = new ArrayList<Student>();
		// TODO Auto-generated method stub	
		StudentManager studentManager = new StudentManager(arrayList);
		studentManager.add();
		studentManager.find();
		studentManager.findbyname();
		studentManager.findbyage();
		studentManager.removebyid();
		studentManager.removesclect();
		studentManager.compater();
		
	}

}

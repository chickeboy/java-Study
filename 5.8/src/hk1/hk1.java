package hk1;

import java.util.ArrayList;
import java.util.List;
/*ѧ���ࣺid name age
дһ��������ѭ��¼����������
дһ��������ɾ��idΪ10����
дһ����������ѯ�������Ƿ����һ�������ĵ���
дһ����������ѯ�������Ƿ���һ�������岢������Ϊ32����
дһ����������ȡ���������ֽ����壬����Ϊ32��idΪ4���˵��±�
ͨ������±������˽����޸� �޸���������Ϊ55
дһ�������������������ѧ������Ϣ
дһ��������дһ���������������������Ϊ4��ѧԱ��Ϣ*/
public class hk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> arrayList = new ArrayList<Student>();
		Studentmanager studentmanager = new Studentmanager(arrayList);
		studentmanager.add();
		studentmanager.remove();
		System.out.println(studentmanager.find());
		System.out.println(studentmanager.findbyname());
		System.out.println(studentmanager.findbyall());
		studentmanager.show();
	}

}

package List;

import java.util.ArrayList;

/*1.��дһ������,����¼��N������
(1)¼����������ݸ���id����������
2.ʹ��2�ַ�ʽ��������
3.��������һ��id����ȡ���id��Ӧ���鱾��Ϣ�����ǵ�����ӡ��
4.��������һ��name,��ȡ���name��Ӧ�������鱾��Ϣ�����ǵ�����ӡ��
5.��ȡcountʣ������ǰ��λ���鱾��Ϣ�����ǵ�����ӡ��
6.��������һ��idɾ�����id��Ӧ�鱾��Ϣ
7.��������һ��typeɾ��������Ͷ�Ӧ�������鱾��Ϣ
8.��������һ��id��ͨ������count,�����޸�ԭ���鱾��count��Ϣ
9.����������鱾��ʣ�������ܺ�
10.��������һ��type��Ȼ��ѡ���Ե�ɾ��һ����(�ٴ�ѡ�����ɾ��)
11.����id�����������
12.����name ���н������
13.ʹ�������ڲ����count��������
14.����id�������һֱ����name�������һֱ����count����*/
public class List {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> arrayList = new ArrayList<Book>();
		Manager manager =new Manager(arrayList);
		Util util = new Util();
		//¼����������ݸ���id����������
		manager.add();
		//ʹ��2�ַ�ʽ��������
		util.show(manager.dealWith());
		util.showbyinteger(manager.dealWith());	
		//��������һ��id����ȡ���id��Ӧ���鱾��Ϣ�����ǵ�����ӡ��
		util.showbyid(manager.findbyid());
		//��������һ��name,��ȡ���name��Ӧ�������鱾��Ϣ�����ǵ�����ӡ��
		util.showbyid(manager.findbyname());
		//��ȡcountʣ������ǰ��λ���鱾��Ϣ�����ǵ�����ӡ��
		util.show(manager.count());
		//��������һ��idɾ�����id��Ӧ�鱾��Ϣ
		util.show(manager.removebyid());
		//7.��������һ��typeɾ��������Ͷ�Ӧ�������鱾��Ϣ
		util.show(manager.removeByCount());
		//8.��������һ��id��ͨ������count,�����޸�ԭ���鱾��count��Ϣ
		util.show(manager.modifycount());
		//9.����������鱾��ʣ�������ܺ�
		manager.sum();
		//10.��������һ��type��Ȼ��ѡ���Ե�ɾ��һ����(�ٴ�ѡ�����ɾ��)
		util.show(manager.removeBytype());
		//11.����id�����������
		util.show(manager.comparebyid());
		//����name ���н������
		util.show(manager.comparebyname());
		//ʹ�������ڲ����count��������
		util.show(manager.comparebycount());
		//����id�������һֱ����name�������һֱ����count����*/
		util.show(manager.comparebyall());
	}
}

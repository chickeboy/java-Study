package Map;

import java.util.HashMap;

/*ʵ���� Book:		id	name	type	count ��Map�Ļ�id������Ϊkey��
1.��дһ������,����¼��N������
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
public class Map {
	public static void main(String[] args) {
		HashMap<Integer, Book> hashMap = new HashMap<Integer, Book>();
		Util util = new Util();
		Manager manager = new Manager(hashMap);
		//��дһ������,����¼��N������
		//2.ʹ��2�ַ�ʽ��������
		util.show(manager.add());
		//3.��������һ��id����ȡ���id��Ӧ���鱾��Ϣ�����ǵ�����ӡ��
		util.show(manager.findbyid1());
		//4.��������һ��name,��ȡ���name��Ӧ�������鱾��Ϣ�����ǵ�����ӡ��
		util.show(manager.findByName());
		//5.��ȡcountʣ������ǰ��λ���鱾��Ϣ�����ǵ�����ӡ��
		util.showlist(manager.showByTop());
		//6.��������һ��idɾ�����id��Ӧ�鱾��Ϣ
		util.show(manager.removeByid());
		//7.��������һ��typeɾ��������Ͷ�Ӧ�������鱾��Ϣ
		util.show(manager.removeByType());
		//8.��������һ��id��ͨ������count,�����޸�ԭ���鱾��count��Ϣ
		util.show(manager.modifyByid());
		//9.����������鱾��ʣ�������ܺ�
		manager.sum();
		//10.��������һ��type��Ȼ��ѡ���Ե�ɾ��һ����(�ٴ�ѡ�����ɾ��)
		util.show(manager.removeByAll());
		//11.����id�����������
		util.show(hashMap);
		//12.����name ���н������
		util.showlist(manager.compareByName());
		//ʹ�������ڲ����count��������
		util.showlist(manager.compareByCount());
		//14.����id�������һֱ����name�������һֱ����count����*/
		util.showlist(manager.compareByAll());
	}
}

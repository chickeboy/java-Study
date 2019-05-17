package Set;

import java.util.HashSet;

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
public class Set {
	public static void main(String[] args) {
		HashSet<Book> hashSet = new HashSet<Book>();
		Util util = new Util();
		Manager manager = new Manager(hashSet);
		//¼����������ݸ���id����������
		util.show(manager.add());
		//ʹ��2�ַ�ʽ��������
		util.showbyingeter(hashSet);
		//3.��������һ��id����ȡ���id��Ӧ���鱾��Ϣ�����ǵ�����ӡ��
		util.show(manager.findbyidA());
		//4.��������һ��name,��ȡ���name��Ӧ�������鱾��Ϣ�����ǵ�����ӡ��
		util.show(manager.findByNamea());
		//5.��ȡcountʣ������ǰ��λ���鱾��Ϣ�����ǵ�����ӡ��
		util.show(manager.showTop());
		//6.��������һ��idɾ�����id��Ӧ�鱾��Ϣ
		util.show(manager.removeById());
		//7.��������һ��typeɾ��������Ͷ�Ӧ�������鱾��Ϣ
		util.show(manager.removeByType());
		//8.��������һ��id��ͨ������count,�����޸�ԭ���鱾��count��Ϣ
		util.show(manager.modify());
		//9.����������鱾��ʣ�������ܺ�
		manager.sumBooks();
		//10.��������һ��type��Ȼ��ѡ���Ե�ɾ��һ����(�ٴ�ѡ�����ɾ��)
		util.show(manager.removeByType1());
		//11.����id�����������
		util.show(manager.compareById());
		//12.����name ���н������
		util.show(manager.compareByname());
		//13.ʹ�������ڲ����count��������
		util.show(manager.compareByCount());
		//14.����id�������һֱ����name�������һֱ����count����*/
		util.show(manager.compareByAll());
	}
}

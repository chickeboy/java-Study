import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();//���캯����ʽ����
		//List<String> arrayList2 = new ArrayList<String>();
		arrayList.add("aa");
		arrayList.add("ac");//���
		arrayList.add(1,"cc");//����
		arrayList.set(0, "v");//�޸�
		System.out.println("ʹ�õ������������ͳһ�ı���");
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {//whileѭ������
			String string = (String) iterator.next();
			System.out.println(string);
		}
		//forѭ������
		for (Iterator iterator2 = arrayList.iterator(); iterator2.hasNext();) {
			String string = (String) iterator2.next();
			System.out.println(string);
		}
		System.out.println(arrayList.indexOf("cc"));//�����״γ��ֵ��±�
		
	}
}

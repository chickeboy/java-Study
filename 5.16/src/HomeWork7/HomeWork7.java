package HomeWork7;

import java.io.File;
import java.util.ArrayList;

/*7.
11.������ϸ�ļ�������������log.txt
#���� �Ա� �ʺ� ������
���»�|1|4155990188888888|300.00
����|1|1155990199999999|500.00
������|1|4155990100000000|1000.50
�Ŷ���|1|4155990155555555|600.99
����ΰ|0|4155990111111111|5000.00
���»�|1|4155990188888888|200.00
�Ŷ���|1|4155990155555555|500.99
���»�|1|4155880188888888|1200.00
PS:	1)	һ����һ��������ϸ��ÿ�з�4�У��м���|�ָ���#Ϊע�ͷ��š�
2)	��TransRecord�洢һ����ϸ��
ʵ�ֹ���:
һ���˿��������ж�ʡ������������˺���ͬ�Ļ�����Ϊ��ͬһ��)ͳ��ÿ���˵������ܶ
�����Ѷ�Ľ����������Ҫ����ʾÿ���˵��������Ա��ʺš������ܶ����Ϣ*/
public class HomeWork7 {
	public static void main(String[] args) {
		File file = new File("D:\\javawork\\5.16\\log.txt");
		Manager manager = new Manager();
		Util util = new Util();
		ArrayList<TransRecord> arrayList = new ArrayList<TransRecord>();
		arrayList = manager.add();
		util.show(arrayList, "��������");
		manager.write(arrayList,file);
		util.show(manager.getsum(arrayList,file), "�����ܽ��");
	}
}

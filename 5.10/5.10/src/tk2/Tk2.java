package tk2;

import java.util.HashMap;
import java.util.Map;

/*
 * Map �ϸ������ϲ��Ǽ���
 *  �����һ��Key - value�Ĺ�ϵ
 *  һ��key��Ӧһ��ֵ��key��Ψһ��  value���Ա�����
 *map ����  ��ȥ�ع���ֻ���key
 *  
 */
public class Tk2 {
	public static void main(String[] args) {
		// Map������ʵ���� HashMap TreeMap
		Map<Integer, String> map = new HashMap<Integer, String>();
		// map�����
//		System.out.println(map.put(null, null));
//		System.out.println(map.put(null, "hehe"));
		// map��key֧��Ϊnull
		System.out.println(map.put(1, "aa"));
		// �����������ظ���key����ֵ�᷵�ر������keyԭ�����ڸ��ǵ��Ǹ�key�϶�Ӧ��value
		System.out.println(map.put(1, "cc"));
		System.out.println(map.put(3, "cc"));
		System.out.println(map);
		// ��ȡkey ��ȡ value ��ͬkey ��value�ǿ����ظ���
		System.out.println(map.get(3));
		// ��ѯmap���Ƿ���ĳһ��key
		System.out.println(map.containsKey(3));
		// ��ѯmap���Ƿ���һ��value
		System.out.println(map.containsValue("ccc"));
		// ���ص������key�϶�Ӧ��value
		System.out.println(map.remove(1));
		System.out.println(map.remove(3, "cc"));// boolean
		
	}
}

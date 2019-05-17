package hk3;

import java.util.ArrayList;
import java.util.List;

/* 随机产生50个30到35的整数，统计每个数字出现的次数（ArrayList实现）
，输出时按照数字的降序排列，并且统计出现次数最多的数字和它的次数。
PS：如果有两个数字出现的次数一样，则只需输出其中一个。*/
public class hk3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrayList = new ArrayList<Integer>();
		NumberManager numberManager = new NumberManager(arrayList);
		for (int i = 0; i < 50; i++) {	
			int a = (int)Math.floor(Math.random()*5+30);
			arrayList.add(a);
		}
		numberManager.count();
	}

}

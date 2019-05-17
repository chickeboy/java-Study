package com.example.shopping;

import java.util.Arrays;

//记录管理类
public class RecordManager {
	private Record arrayrecord[];
	private int size;
	private int index;

	public RecordManager(int init) {// 创建这个Manger的时候
		// 可以传入一个长度，来确定你需要的数组的长度
		arrayrecord = new Record[init];
	}

	public RecordManager() {
		this(5);// this带.调用的是本类的属性或者其他普通方法
		// this()不带点，表示的是调用本类中其他构造方法
	}

	public void save(Record record) {
		// TODO Auto-generated method stub
		bigger();
		arrayrecord[size++] = record;
	}

	public Record[] getAll() {
		// TODO Auto-generated method stub
		return Arrays.copyOf(arrayrecord, size);
	}

	public Record[] findRecord(String username) {
		// TODO Auto-generated method stub
		Record record[] = new Record[0];
		int subscript = 0;
		for (int i = 0; i < size; i++) {
			if (username.equals(arrayrecord[i].getUser())) {
				record = Arrays.copyOf(record, record.length+1);
				record[subscript] = arrayrecord[i];
			}
		}
		return record;
	}

	private void bigger() {
		// TODO Auto-generated method stub
		if (size == arrayrecord.length) {
			arrayrecord = Arrays.copyOf(arrayrecord, size * 2 + 1);
		}
	}

	public int index(String goodsname) {
		// TODO Auto-generated method stub
		int index = -1;
		System.out.println("reco。。中的size"+size);
		System.out.println("reco。。中的anme"+goodsname);
		for(int i = 0;i<size;i++) {
			System.out.println("打印array[i].getGood"+arrayrecord[i].getGood());
			if (goodsname.equals(arrayrecord[i].getGood())) {
				index = i;
			}
		}
		return index;
	}

	public boolean find(String goodsname,String username) {
		// TODO Auto-generated method stub
		int a = index(goodsname);
		if(a!=-1&&validation(a,username)) {
			int totalprice = arrayrecord[a].getTotalprice();
			System.out.println("退货中得到的商品总价"+totalprice);
			UserManager userManager = new UserManager();
			userManager.refund(username,totalprice);
			GoodsManager goodsManager = new GoodsManager();
			goodsManager.alsoTheGoods(goodsname,totalprice);
			return true;
		}
		return false;
	}

	private boolean validation(int a, String username) {
		// TODO Auto-generated method stub
		if(username.equals(arrayrecord[a].getUser())) {
			return true;
		}
		return false;
	}
}

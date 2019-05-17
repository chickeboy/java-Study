package com.example.shopping;

import java.util.Arrays;

//商品管理类
public class GoodsManager {
	private Goods arrayGoods[];
	private int size;

	public GoodsManager(int init) {// 创建这个Manger的时候
		// 可以传入一个长度，来确定你需要的数组的长度
		arrayGoods = new Goods[init];
	}

	public GoodsManager() {
		this(5);// this带.调用的是本类的属性或者其他普通方法
		// this()不带点，表示的是调用本类中其他构造方法
	}

	public boolean save(Goods goods) {
		// TODO Auto-generated method stub
		Goods good = findById(goods.getId());
		if (good == null) {// 表示可以添加
			bigger();// 扩容
			arrayGoods[size++] = goods;
			return true;
		}
		return false;
	}

	public Goods findById(int id) {
		Goods goods = null;
		for (int i = 0; i < size; i++) {
			if (arrayGoods[i].getId() == id) {
				goods = arrayGoods[i];
				break;
			}
		}
		return goods;// 返回null表示没有进入过判断语句
	}

	public void bigger() {
		if (size == arrayGoods.length) {
			arrayGoods = Arrays.copyOf(arrayGoods, size * 2 + 1);
		}
	}

	public boolean update(int goodsId, Goods goods) {
		int index = indexOf(goodsId);
		if (index == -1) {
			return false;
		}
		if (goods.getId() != goodsId && findById(goods.getId()) != null) {
			return false;
		}
		arrayGoods[index] = goods;
		return true;
	}

	public int indexOf(int goodsId) {
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (arrayGoods[i].getId() == goodsId) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int indexOf2(String goosName) {
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (arrayGoods[i].getName() == goosName) {
				index = i;
				break;
			}
		}
		return index;
	}

	public Goods[] getAll() {
		// TODO Auto-generated method stub
		return Arrays.copyOf(arrayGoods, size);
	}

	public boolean removeById(int id) {
		// TODO Auto-generated method stub
		int index = indexOf(id);
		if (index == -1) {
			return false;
		}
		for (int i = index; i < size - 1; i++) {
			arrayGoods[i] = arrayGoods[i + 1]; // 2 = 3 3 = 4
		}
		arrayGoods[--size] = null;// 先--再置空
		return true;
	}

	public boolean removeByname(String goodsName) {
		// TODO Auto-generated method stub
		int index = indexOf2(goodsName);
		// 1.先去查这个id的下标
		if (index == -1) {
			return false;
		}
		for (int i = index; i < size - 1; i++) {
			arrayGoods[i] = arrayGoods[i + 1]; // 2 = 3 3 = 4
		}
		// 后面往前面赋值，最后一位的值还是再的
		arrayGoods[--size] = null;// 先--再置空
		// 实际数量少一个
		return true;
	}

	public int buyGoods(int goodsId, int count) {
		// TODO Auto-generated method stub
		int sumMoney = 0;
		int a = indexOf(goodsId);
		if (a != -1) {
			if ((arrayGoods[a].getCount() - count) < 0) {
				return sumMoney;
			} else {
				arrayGoods[a].setCount(arrayGoods[a].getCount() - count);
				sumMoney = arrayGoods[a].getPrice() * count;
				return sumMoney;
			}
		} else {
			return sumMoney;
		}
	}

	public boolean inventory(int goosId, int count) {
		// TODO Auto-generated method stub
		int index = indexOf(goosId);
		if ((arrayGoods[index].getCount() - count) > 0) {
			return true;

		} else {
			return false;
		}

	}
	
	public int price(int goosId) {
		// TODO Auto-generated method stub
		int index = indexOf(goosId);
		return arrayGoods[index].getPrice();
	}

	public void outbound(int goosId, int count) {
		// TODO Auto-generated method stub
		int index = indexOf(goosId);
		arrayGoods[index].setCount(arrayGoods[index].getCount()-count);
	}

	public int totalPrice(int goosId, int count) {
		// TODO Auto-generated method stub
		int index = indexOf(goosId);
		return arrayGoods[index].getPrice()*count;
	}

	public String goodsName(int goosId) {
		// TODO Auto-generated method stub
		int index = indexOf(goosId);
		return arrayGoods[index].getName();
	}

	public void alsoTheGoods(String goodsname, int totalprice) {
		// TODO Auto-generated method stub
		int index = indexOf2(goodsname);
		System.out.println("退货方法中的goodsname"+goodsname);
		System.out.println("退货方法中的index"+index);
		if(index!=-1) {
			int countFinal = totalprice/arrayGoods[index].getPrice();
			System.out.println("把货物重新加到仓库里"+countFinal);
			arrayGoods[index].setCount(arrayGoods[index].getCount()+countFinal);
		}
	}
	
}

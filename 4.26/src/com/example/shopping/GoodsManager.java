package com.example.shopping;

import java.util.Arrays;

//��Ʒ������
public class GoodsManager {
	private Goods arrayGoods[];
	private int size;

	public GoodsManager(int init) {// �������Manger��ʱ��
		// ���Դ���һ�����ȣ���ȷ������Ҫ������ĳ���
		arrayGoods = new Goods[init];
	}

	public GoodsManager() {
		this(5);// this��.���õ��Ǳ�������Ի���������ͨ����
		// this()�����㣬��ʾ���ǵ��ñ������������췽��
	}

	public boolean save(Goods goods) {
		// TODO Auto-generated method stub
		Goods good = findById(goods.getId());
		if (good == null) {// ��ʾ�������
			bigger();// ����
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
		return goods;// ����null��ʾû�н�����ж����
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
		arrayGoods[--size] = null;// ��--���ÿ�
		return true;
	}

	public boolean removeByname(String goodsName) {
		// TODO Auto-generated method stub
		int index = indexOf2(goodsName);
		// 1.��ȥ�����id���±�
		if (index == -1) {
			return false;
		}
		for (int i = index; i < size - 1; i++) {
			arrayGoods[i] = arrayGoods[i + 1]; // 2 = 3 3 = 4
		}
		// ������ǰ�渳ֵ�����һλ��ֵ�����ٵ�
		arrayGoods[--size] = null;// ��--���ÿ�
		// ʵ��������һ��
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
		System.out.println("�˻������е�goodsname"+goodsname);
		System.out.println("�˻������е�index"+index);
		if(index!=-1) {
			int countFinal = totalprice/arrayGoods[index].getPrice();
			System.out.println("�ѻ������¼ӵ��ֿ���"+countFinal);
			arrayGoods[index].setCount(arrayGoods[index].getCount()+countFinal);
		}
	}
	
}

package com.example.shopping;

import java.util.Arrays;
//�û�������
public class UserManager {
	private User array[];
	private int size;
	public  UserManager() {
		// TODO Auto-generated constructor stub
		this(5);
	}

	public UserManager(int length) {
		array = new User[length];
	}

	public boolean adduser(User user) {
		// TODO Auto-generated method stub
			User userinformation = findByUsername(user.getUsername());//�����ص�ֵ����user
			//��user���Ƿ�Ϊ�����ж��Ƿ��Ѿ�����ͬ���û���
			System.out.println("������addroot����");//�����Ƿ�����������
			if (userinformation == null) {
				bigger();//���ݷ���
				array[size++] = user;
				//System.out.println(size);
				return true;
			}
		return false;
	}
	private User findByUsername(String username) {
		User userinformation = null;//��ʼ��userinformationΪ��
		for (int i = 0; i < size; i++) {
			System.out.println(i);
			if (username.equals(array[i].getUsername())) {//����������username
				//��array�����е�username�Աȣ�ͨ��Userinformation�е�getusername�����õ�username��
				//�����ͬ�ͷ����Ǹ��û�����û����ͬ�ͷ��ؿ�˵���û�����û�б�����
				userinformation = array[i];
				break;
			}
		}
		System.out.println(userinformation);
		return userinformation;
	}
	private void bigger() {
		// TODO Auto-generated method stub
		if (size == array.length) {
			array = Arrays.copyOf(array, size * 2 + 1);
		}
	}
	public boolean find(String username, String password) {//����
		int index = indexOf(username);
		//��username���ж�����û����Ƿ����
		System.out.println(username);
		System.out.println("find�е�"+index);//�����Ƿ����find���Ҳ鿴���ص�indexֵ
		if (index == -1) {
			return false;
		} else {//����ҵ����û����ж�password�Ƿ��Ӧ
			return indexOf1(index, password);//�����ȷ����true�����󷵻�false
		}
	}
	private int indexOf(String username) {
		// TODO Auto-generated method stub
		int index = -1;
		System.out.println(size);//����size�Ƿ�Ϊ0��
		for (int i = 0; i < size; i++) {//����������username
			//��array�����е�username�Աȣ�ͨ��Userinformation�е�getusername�����õ�username��
			//�����ͬ�ͷ����Ǹ��û������±꣬û����ͬ�ͷ���-1˵���û�����û�б�����
			//System.out.println(i);
			if (username.equals(array[i].getUsername())) {
				index = i;
				break;
			}
		}
		return index;
	}

	private boolean indexOf1(int index, String password) {//ͨ��indexֱ���ҵ�array��Ӧ��������password�Ƚ�
		// TODO Auto-generated method stub
		System.out.println("indexOf2����");
		boolean bool = false;
		//System.out.println(size);
		if (password.equals(array[index].getPassword())) {
			System.out.println(array[index].getPassword());//�鿴�ҵ�������
			bool = true;
		}
		return bool;
	}

	public boolean changeMoney(String username, int money) {
		// TODO Auto-generated method stub
		System.out.println(username);
		int index = indexOf(username);
		if (index == -1) {
			return false;
		}
		System.out.println(index);
		array[index].setMoney(array[index].getMoney()+money);
		System.out.println(array[index].getMoney());
		return true;
	}

	public User[] getAll() {
		// TODO Auto-generated method stub
		
		return Arrays.copyOf(array, size);
	}
	public boolean changePassword(String username, String newPassWord) {
		// TODO Auto-generated method stub
		int index = indexOf(username);
		if (index == -1) {
			return false;
		}
		array[index].setPassword(newPassWord);
		return true;
	}

	public boolean banlance(String username, int price) {
		// TODO Auto-generated method stub
		int index = indexOf(username);
		int accountBalance = array[index].getMoney()-price;
		if(accountBalance>0) {
			return true;
		}else {
			return false;
		}
	}

	public void deductions(String username, int totalprice) {
		// TODO Auto-generated method stub
		int index = indexOf(username);
		array[index].setMoney(array[index].getMoney()-totalprice);
	}

	public void refund(String username, int totalprice) {
		// TODO Auto-generated method stub
		int index = indexOf(username);
		if(index!=-1) {
			array[index].setMoney(array[index].getMoney()+totalprice);
		}
	}
}

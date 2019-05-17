package com.example.shopping;

import java.util.Arrays;
//用户管理类
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
			User userinformation = findByUsername(user.getUsername());//将返回的值赋给user
			//用user的是否为空来判断是否已经有相同的用户名
			System.out.println("这里是addroot方法");//测试是否进入这个方法
			if (userinformation == null) {
				bigger();//扩容方法
				array[size++] = user;
				//System.out.println(size);
				return true;
			}
		return false;
	}
	private User findByUsername(String username) {
		User userinformation = null;//初始化userinformation为空
		for (int i = 0; i < size; i++) {
			System.out.println(i);
			if (username.equals(array[i].getUsername())) {//将传进来的username
				//和array数组中的username对比（通过Userinformation中的getusername方法拿到username）
				//如果相同就返回那个用户名，没有相同就返回空说明用户名还没有被创建
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
	public boolean find(String username, String password) {//传参
		int index = indexOf(username);
		//用username来判断这个用户名是否存在
		System.out.println(username);
		System.out.println("find中的"+index);//测试是否进入find并且查看返回的index值
		if (index == -1) {
			return false;
		} else {//如果找到了用户名判断password是否对应
			return indexOf1(index, password);//如果正确返回true，错误返回false
		}
	}
	private int indexOf(String username) {
		// TODO Auto-generated method stub
		int index = -1;
		System.out.println(size);//测试size是否为0；
		for (int i = 0; i < size; i++) {//将传进来的username
			//和array数组中的username对比（通过Userinformation中的getusername方法拿到username）
			//如果相同就返回那个用户名的下标，没有相同就返回-1说明用户名还没有被创建
			//System.out.println(i);
			if (username.equals(array[i].getUsername())) {
				index = i;
				break;
			}
		}
		return index;
	}

	private boolean indexOf1(int index, String password) {//通过index直接找到array对应的内容与password比较
		// TODO Auto-generated method stub
		System.out.println("indexOf2方法");
		boolean bool = false;
		//System.out.println(size);
		if (password.equals(array[index].getPassword())) {
			System.out.println(array[index].getPassword());//查看找到的内容
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

package HK6;

import java.util.Arrays;

public class Root {
	Userinformation array[];
	private int size;

	public Root() {
		this(5);
	}

	public Root(int length) {
		array = new Userinformation[length];
	}

	public boolean addroot(Userinformation userinformation) {
		Userinformation user = findByUsername(userinformation.getUsername());//�����ص�ֵ����user
		//��user���Ƿ�Ϊ�����ж��Ƿ��Ѿ�����ͬ���û���
		System.out.println("������addroot����");//�����Ƿ�����������
		if (user == null) {
			bigger();//���ݷ���
			array[size++] = userinformation;
			//System.out.println(size);
			return true;
		}
		return false;
	}

	private void bigger() {
		// TODO Auto-generated method stub
		if (size == array.length) {
			array = Arrays.copyOf(array, size * 2 + 1);
		}
	}

	private Userinformation findByUsername(String username) {
		Userinformation userinformation = null;//��ʼ��userinformationΪ��
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

	public boolean find(String username, String password) {//����
		int index = indexOf(username);//��username���ж�����û����Ƿ����
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

}

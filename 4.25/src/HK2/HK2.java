package HK2;

/*����һ���࣬Ϊ���ඨ���������캯�����ֱ�ִ�����в�����
  1��������������ֵ���ҳ����нϴ��һ��ֵ
  2����������doubleֵ�������˻�
  3�����������ַ���ֵ��������Ƿ���ͬ
  4����main�����в��Թ��캯���ĵ���*/
public class HK2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Other other = new Other(2, 4);
		Other other2 = new Other("abc", "abc");
		Other other3 = new Other(3.5, 2.4, 4.5);
		System.out.println(other.toString());
	}

}

public class Test10{
	public static void main(String[] args){
		//4��һ�򣬰��겻��4��������
		int year = 1940;
		String res = "����"
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			res = "��";
		}
		System.out.println(year + res + "����");
	}
}
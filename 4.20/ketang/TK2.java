package ketang;
/*��дһ���������ж�һ���������Ƿ����ظ�Ԫ�أ����ò���*/
public class TK2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {2,3,4,5,6};
		String str = repeat(array)? "û��":"��";
		System.out.println("����"+str+"�ظ�Ԫ��");
	}
	public static boolean repeat(int array[]) {
		int a = 0;		
//		for(int i = 0;i<5;i++) {
//			array[i] = (int)Math.floor(Math.random()*20);
//		}
		while(a<5) {
			for(int i = 0;i<array.length;i++) {
				if(array[a]==array[i]&&a!=i) {
					return false;
				}
			}
			a++;
		}
		return true;
	}

}

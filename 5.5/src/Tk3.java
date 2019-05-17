
/*
 * ���쳣���׳��Ͳ���
 */
public class Tk3 {
	public static void main(String[] args) {
		U u = new U();
		int [] array = {0,3,4,5};
		try {
			u.getSum(array, 0);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}

class U {
	// ���쳣��˳���Ǻʹ����ִ�������й�ϵ��
	public int getSum(int[] array, int index)
			throws NullPointerException, IndexOutOfBoundsException, ArithmeticException {
		if (array == null) {
			throw new NullPointerException();
		}
		if (index < 0 || index >= array.length) {
			throw new IndexOutOfBoundsException();
		}
		int c = array[index];
		if (c == 0) {
			throw new ArithmeticException();
		}
		int d = 3 / c;
		return d;
	}
}

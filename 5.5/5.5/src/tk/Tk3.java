package tk;

/*
 * ���쳣���׳��Ͳ���
 */
public class Tk3 {
	public static void main(String[] args) {
		// д�������˱��������п��ܳ��ֵ��쳣
		// ���÷�������Ҳ����ȥһһ����
		// ����쳣�����˳���Ǹ��ݷ�����ִ�е�ʱ��
		// ������˭�Ͳ���˭
		U u = new U();
		int d = 0;
		int[] array = null;
		int index = -1;
		try {
			d = u.getSum(array, index);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// ��ֹ������©
		} finally {
			
		}
	}
}

class U {
	// ���쳣��˳���Ǻʹ����ִ�������й�ϵ��
	public int getSum(int[] array, int index)
			throws NullPointerException, IndexOutOfBoundsException, ArithmeticException {
		if (array == null) {
			throw new NullPointerException("����Ϊ��");
		}
		if (index < 0 || index >= array.length) {
			throw new IndexOutOfBoundsException("����Խ��");
		}
		int c = array[index];
		if (c == 0) {
			throw new ArithmeticException("����Ϊ0");
		}
		int d = 3 / c;
		return d;
	}
}

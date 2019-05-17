package tk;

/*
 * 多异常的抛出和捕获
 */
public class Tk3 {
	public static void main(String[] args) {
		// 写方法的人表明了所有可能出现的异常
		// 调用方法的人也必须去一一捕获
		// 多个异常捕获的顺序，是根据方法中执行的时候
		// 先遇到谁就捕获谁
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
			// 防止出现遗漏
		} finally {
			
		}
	}
}

class U {
	// 抛异常的顺序是和代码的执行流程有关系的
	public int getSum(int[] array, int index)
			throws NullPointerException, IndexOutOfBoundsException, ArithmeticException {
		if (array == null) {
			throw new NullPointerException("数组为空");
		}
		if (index < 0 || index >= array.length) {
			throw new IndexOutOfBoundsException("数组越界");
		}
		int c = array[index];
		if (c == 0) {
			throw new ArithmeticException("除数为0");
		}
		int d = 3 / c;
		return d;
	}
}

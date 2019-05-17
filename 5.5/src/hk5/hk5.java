package hk5;

/*从命令行得到5个整数，放入一个整型数组，
然后打印输出，要求：如果输入数据不为整数，
要捕获Integer.parseInt()产生的异常，
显示“请输入整数”，捕获输入数参数不足5个的异常
（数组越界），显示“请输入至少5个整数”。 */
public class hk5 {

	public static void main(String[] args) {
		Array array = new Array();
		int a[] = new int[5];
		int i = 0;
		while (true) {
			try {
				a[i] = array.array(i);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				i--;
				System.out.println(e.getMessage());
			}catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				break;
			}catch (Exception e) {
				// TODO: handle exception
			}
			i++;
		}

		for (int b : a) {
			System.out.println(b);
		}

	}

}

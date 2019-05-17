package ketang;
/*编写一个方法，判断一个数组中是否有重复元素，调用测试*/
public class TK2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {2,3,4,5,6};
		String str = repeat(array)? "没有":"有";
		System.out.println("数组"+str+"重复元素");
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

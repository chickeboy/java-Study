package homeWork;

/*11.创建一个数组，存放5个1-10的随机数，然后遍历输出，如果遇到3的倍数就停止*/
public class HK11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arry[] = new int[5];
		for(int  i = 0;i<arry.length;i++) {
			arry[i] = (int)Math.floor(Math.random()*9+1);
		}
		for(int i  =0;i<arry.length;i++) {
			if(arry[i]%3==0) {
				break;
			}else {
				System.out.println(arry[i]);
			}
		}
	}

}

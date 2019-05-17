package homeWork;

/*8.数组中存入5个数，计算出所有偶数的个数和奇数的个数*/
public class HK8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arry[] = {2,3,4,5,6};
		int oddNumber = 0;
		int evenNumber = 0;
		for(int  i = 0;i<arry.length;i++ ) {
			if(arry[i]%2!=0) {
				oddNumber+=1;
			}else {
				evenNumber+=1;
			}
		}
		System.out.println("奇数的个数为"+oddNumber +"偶数的个数为"+evenNumber);
	}

}

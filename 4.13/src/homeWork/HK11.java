package homeWork;

/*11.����һ�����飬���5��1-10���������Ȼ�����������������3�ı�����ֹͣ*/
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

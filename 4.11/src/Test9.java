/*���1-1000�����м����Ա�3Ҳ���Ա�6���������ĺ�
*/
public class Test9 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1;i<=1000;i++) {
			if(i%3==0&&i%6==0) {
				sum +=i;
			}
		}
		System.out.println(sum);
	}
}

package homeWork;

/*8.�����д���5���������������ż���ĸ����������ĸ���*/
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
		System.out.println("�����ĸ���Ϊ"+oddNumber +"ż���ĸ���Ϊ"+evenNumber);
	}

}

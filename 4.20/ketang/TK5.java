package ketang;
/*��дһ�����������ڽ�һ���˵����֤��Ž����ɣ�1988-04-30���������ڸ�ʽ���
*/
public class TK5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "*****119970219****";
		riqi(str);
	}
	public static void riqi(String str) {
		String year = str.substring(6,10);
		String month = str.substring(10,12);
		String days = str.substring(12,14);
		System.out.println(year+"-"+month+"-"+days);
	}

}

package ketang;
/*����һ���ַ������飬�Ȱ����ַ�����������Ƚϣ������ͬ��		
���ֵ�˳����д�С��������������㷨�Լ�д��
{ "asda", "ret", "vsa", "asdf", "vdft", "qwr" }*/

public class TK7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String array[] = { "asda", "ret", "vsa", "asdf", "vdft", "qwr" };
		 array = thesorting(array);
		for(int i =0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
	}
	public static String[] thesorting(String array[]) {
		for(int i = 1;i<array.length;i++) {
			for(int j=0;j<array.length-i;j++) {
				if(array[j].length()>array[j+1].length()) {
					String temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}else if(array[j].compareTo(array[j+1])>0&&array[j].length()==array[j+1].length()) {
					String temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}

}

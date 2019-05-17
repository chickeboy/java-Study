package ketang;
/*给定一个字符串数组，先按照字符串长度排序比较，如果相同按		
照字典顺序进行从小到大的排序（排序算法自己写）
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

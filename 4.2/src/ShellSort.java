//Ï£¶ûÅÅĞò
public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arry[] = { 2, 10, 9, 3, 6, 7, 4, 8 };
		int gap = 1;
		while(gap<arry.length) {
			gap = gap *3+1;
		}
		while (gap>0) {
			for(int i = gap;i<arry.length;i++) {
				int tmp = arry[i];
				int j = i-gap;
				while(j>=0&&arry[j]>tmp) {
					arry[j+gap] = arry[j];
					j-=gap;
				}
				arry[j+gap] = tmp;
			}
			gap = (int)Math.floor(gap/3);
		}
		for (int i = 0; i < arry.length; i++) {
			System.out.print(arry[i]+"\t");
		}
	}

}

/*4.随机产生40个10到50的整数，统计每个数字各出现几次，出现0次的数字不打印。*/
public class HK4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[40];
		for(int i = 0;i<array.length;i++) {
			array[i] =(int)Math.floor(Math.random()*40+10);
		}
		for(int i = 0;i<array.length;i++) {
			int count = 0;
			if(array[i]!=-1) {
				int a= array[i];
				for(int j = 0;j<array.length;j++) {
					if(a==array[j]) {
						count++;
						array[j] = -1;
					}
				}
				if(count!=0) {			
					System.out.println(a +"出现的次数为："+ count);
				}
			}
			
		}
	}

}

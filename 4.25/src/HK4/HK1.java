package HK4;
/*完成以下场景：请模拟手机使用电池的过程，
例如：打电话每秒需要使用百分之1的电池，
每次使用显示出当前手机剩余电量，剩余0则为煤电，
提示用户需要充电，手机和电池都应该有对应的品牌属性*/
public class HK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MI mi = new MI();
		for(int i = 0;;i++) {
			try {
				Thread.sleep(1000);
				int c = mi.out();
			if(c>0) {
				System.out.println("电池还剩下："+c);
			}else {
				System.out.println("需要充电");
				break;
			}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}

}

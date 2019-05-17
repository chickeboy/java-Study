package HomeWork3;
/*猴子分桃：3只猴子抢着分100只桃子，
每只抢到的猴子分去剩余桃子的一半，
抢完为止。使用多线程模拟这一过程*/
public class hk3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pach pach = new Pach();
		new Thread(pach,"第一只猴子").start();
		new Thread(pach,"第二只猴子").start();
		new Thread(pach,"第三只猴子").start();

	}

}

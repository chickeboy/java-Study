package HomeWork;
/*1.(本题2分)生产者消费者:有一个生产者对象，
还有一个消费者对象生产者用来向篮子对象中放苹果，
每次1个。消费者从篮子中取走吃掉1个苹果，，
再生产1个,吃掉1个，共进行4轮。*/
public class hk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basket basket = new Basket();
		new MyThread(basket).start();
		new MyThread2(basket).start();
	}

}

package homeWork;

/*使用策略模式的设计方式来实现两个数的操作获得相应的结果。
提供四种具体的实施策略，加、减、乘、除操作。
在线答题上传答案上移下移移除设置分值*/
public class hk4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reference reference = new Reference(new add());
		System.out.println(reference.calculate(10,20));
		reference = new Reference(new subtraction());
		System.out.println(reference.calculate(10,20));
		reference = new Reference(new multiplication());
		System.out.println(reference.calculate(10,20));
		reference = new Reference(new division());
		System.out.println(reference.calculate2(10,20));
		
	}

}

interface Algorithm {
	public int algorithm(int a, int b);
}
interface Algorithm1 {
	public double algorithm(int a, int b);
}

class add implements Algorithm {

	@Override
	public int algorithm(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}
}

class subtraction implements Algorithm {

	@Override
	public int algorithm(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}
}

class multiplication implements Algorithm {

	@Override
	public int algorithm(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}
}

class division implements Algorithm1 {

	@Override
	public double algorithm(int a, int b) {
		// TODO Auto-generated method stub
		return (double)a / (double)b;
	}
}

class Reference {
	Algorithm algorithm;
	Algorithm1 algorithm1;
	public Reference(Algorithm algorithm) {
		super();
		this.algorithm = algorithm;
	}
	public Reference(Algorithm1 algorithm1) {
		super();
		this.algorithm1 = algorithm1;
	}
	public int calculate(int a, int b) {
		return algorithm.algorithm(a, b);
	}
	public double calculate2(int a,int b) {
		return algorithm1.algorithm(a, b);
	}
}

/*把对象作为参数
*/
public class test {
	int a,b ;
	test(int i ,int j){
		a = i ;
		b = j;
	}
	boolean equals(test o) {
		if(o.a== a && o.b== b) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test ob1 = new test(100,22);
		test ob2 = new test(100,22);
		test ob3 = new test(-1,-1);
		System.out.println(" ob1 == ob2" + ob1.equals(ob2));
		System.out.println(" ob1 == ob3" + ob1.equals(ob3));


	}

}

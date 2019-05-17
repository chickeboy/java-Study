package tk2;

public class Tk5 {
	public static void main(String[] args) {

	}
}

class U {
	public void show() {
		class In {// 只能为show方法服务
			// 也就是u的对象在调用show的时候这个类才会出现
			// show方法结束，这个类消失
			private String name = "in";

			public In(String name) {
				super();
				this.name = name;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public void show() {
				System.out.println(name);
			}
		}
		In in = new In("ffff");
		in.show();
	}

}

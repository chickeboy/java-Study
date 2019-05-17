
public abstract class Pet {
	private String name;
	
	public Pet(String name) {
		super();
		this.name = name;
	}
	//现在并不知道传入的具体是哪种食物的实例，所以这里我们先放一下
//	public void eat(Food food) {
//		
//	}
	public abstract void eat(Food food);
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}


public class Dog extends Pet {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat(Food food) {
		if(food instanceof Bone) {//判断传入的食物是否属于骨头的实例
			System.out.println(getName()+"正在吃" + food.getName());
		}else {
			System.out.println(getName()+"不吃" + food.getName());
		}
		
	}

}

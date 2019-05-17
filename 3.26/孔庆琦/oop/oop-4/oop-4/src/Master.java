
public class Master {
	//多态，具体的展现形式编写的时候并不知道，只知道宠物吃食物，具体什么宠物吃什么食物
	//需要运行时类型的判断
	public void feed(Pet pet,Food food) {
		System.out.println("主人喂食物");
		pet.eat(food);
	}
}

package homeWork;

/*��һ�����ˣ�Master�ࣩ����������ֻ���Pet�ࣩ��
һֻ�����ǹ���Dog�ࣩ�����ֽС����ơ�����һֻ������è��Cat�ࣩ��
���ֽС�С����������������ʳ�Food�ࣩ���ֱ��ǹ�ͷ��Bone�����㣨Fish����
���˷ֱ����ֻ����ιʳ���ֻ������ʳ����ֻ�Թ�ͷ���������Ϊ���Ա��ʳ�
����ʾ��������ĳĳʳ�����èֻ���㣨�������Ϊè�Ա��ʳ�����ʾ��è����ĳĳʳ���*/
public class HK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet pet = new Dog("��");
		Food food = new Boot("��ͷ");
		Master master = new Master();
		master.feed(pet, food);
		pet = new Cat( "è");
		food = new Food("��");
		master.feed(pet, food);
		pet = new Cat( "��");
		food = new Food("��");
		master.feed(pet, food);
		pet = new Cat( "è");
		food = new Food("��ͷ");
		master.feed(pet, food);
	}

}

class Master {
	public void feed(Pet pet, Food food) {
		// TODO Auto-generated method stub
		String str = "��" ;
		if((pet.getName().equals("è")&&food.getName().equals("��ͷ"))||(pet.getName().equals("��")&&food.getName().equals("��"))) {
			str = "����";
		}
		pet.eatfood(food,str);
	}
}

class Pet {
	private String name;

	public Pet(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void eatfood(Food food,String str) {
		// TODO Auto-generated method stub
		System.out.println(name + str + food.getName());
	}
}

class Dog extends Pet {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}

class Cat extends Pet {

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
}

class Food {
	private String name;

	public Food(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Boot extends Food {

	public Boot(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}

class Fish extends Food {

	public Fish(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}

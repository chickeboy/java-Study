
public class Dog extends Pet {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat(Food food) {
		if(food instanceof Bone) {//�жϴ����ʳ���Ƿ����ڹ�ͷ��ʵ��
			System.out.println(getName()+"���ڳ�" + food.getName());
		}else {
			System.out.println(getName()+"����" + food.getName());
		}
		
	}

}

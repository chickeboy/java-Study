
public abstract class Pet {
	private String name;
	
	public Pet(String name) {
		super();
		this.name = name;
	}
	//���ڲ���֪������ľ���������ʳ���ʵ�����������������ȷ�һ��
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

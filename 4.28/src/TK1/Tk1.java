package TK1;
/*.����һ�������� 
��������name age
������Ϊ 
���󷽷�play() eat() 
���巽��sleep(){}
�ṩ��Ӧ�Ĺ��췽����get set����
����дequals���� �ж������� name �� ageͬʱ��ͬ
����һ��Dog��̳ж����࣬�����Լ������� colour
����ʵ��paly����������дequals  name age colour����ͬΪͬһ������
�ٴ����󹷺�С���࣬�̳�Dog�࣬��eat����ʵ�ֲ�ͬ���߼�
�����main�����д�����С���Ķ��󣬵���3�����������Ҳ���equals�ıȽϽ��*/

public class Tk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog bigDog = new BigDog("�ٺ�", 5, "��ɫ");
		Dog smallDog = new SmallDog("�ٺ�", 5, "��ɫ");
		System.out.println(bigDog.equals(smallDog));
		Aimal bigAimal = new BigDog("����", 5, "��ɫ"); 
		Aimal bigAima2 = new SmallDog("����", 3, "��ɫ");
		System.out.println(bigAimal.equals(bigAima2));
		SmallDog smallDog2 = new SmallDog("С��", 2, "��ɫ");
		BigDog bigDog2 = new BigDog("��",5,"��ɫ");
		smallDog2.output();
		bigDog2.output();
	}

}

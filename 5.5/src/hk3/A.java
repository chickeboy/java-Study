package hk3;

public class A {

	public int exception(char[] array, char a) throws IllegalAccessException {
		// TODO Auto-generated method stub
		int index = -1;
		if (array == null) {
			throw new IllegalAccessException("���������Ϊ���ټ�");
		} else {
			for (int i = 0; i < array.length; i++) {
				if (array[i] == a) {
					index = i;
					break;
				}
			}
		}
		return index;
	}
}

package homeWork3;

/*使用策略模式的设计方式来实现对数组的排序，提供两种具体的实施策略，冒泡排序法和选择排序法*/
public class hk12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.floor(Math.random()*10);
		}
		Makesorting makesorting = new Makesorting(new maopao());
		makesorting.makeSorting(array);
		for (int i : array) {
			System.out.println(i);
		}
		System.out.println("============================");
		makesorting = new Makesorting(new xuanze());
		makesorting.makeSorting(array);
		for (int i : array) {
			System.out.println(i);
		}
	}

}
class Makesorting{
	private Sorting sorting;

	public Makesorting(Sorting sorting) {
		super();
		this.sorting = sorting;
	}
	public void makeSorting(int[] array){
		sorting.sorting(array);
	}
}
interface Sorting{
	public int[] sorting(int[] array);
}
class maopao implements Sorting{
	@Override
	public int[] sorting(int[] array) {
		// TODO Auto-generated method stub
		System.out.println("冒泡排序");
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length-i; j++) {
				if (array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	
}
class xuanze implements Sorting{

	@Override
	public int[] sorting(int[] array) {
		// TODO Auto-generated method stub
		System.out.println("选择排序");
		for (int i = 0; i < array.length-1; i++) {
			int min = i;
			for (int j =i+1; j < array.length; j++) {
				if(array[j]<array[min]) {
					min =j;
				}
			}
			if(i!=min) {
				int temp = array[i];
				array[i] = array[min];
				array[min] = temp;
			}
		}
		return array;
	}
	
}
import java.util.Arrays;
public class TestArray{
	public static void main(String[] args){
		int array[] = {3,4,5,6,7,8,1,2};
		int arrayCopy[] = Arrays.copyOf(array,10);
		for(int i = 0;i<arrayCopy.length;i++){
			System.out.print(arrayCopy[i] + "\t");
		}
	}
}
  //30.´òÓ¡Ñî»ÔÈı½ÇĞÎ2 
public class HK5 {
    public static void main(String[] args){     
		int num = 10;     
		int[][] array = new int [num][];
		for(int i = 0; i < array.length; i ++){
			array[i] = new int[i + 1];     
		}
		for(int i = 0; i < array.length; i ++){
			for(int j = 0; j < array[i].length; j ++){          
				array[i][0] = array[i][i] = 1;
				if(i > 1 && j > 0 && j < i){
					array[i][j] = array[i - 1][j] + array[i -1][j -1];
				}         
				
			}
		}   
		for(int i = 0; i < array.length; i ++){
			for(int j = 0; j < (num - i - 1) / 2; j ++){
				System.out.print("\t");
			}			
			for(int j = 0; j < array[i].length; j ++){
				System.out.print(array[i][j] + "\t");
			}
        System.out.println();
		}
    }
  
}	
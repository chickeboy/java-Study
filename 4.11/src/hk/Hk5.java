package hk;
//5.�Ӽ�������һ����������������ǰ���ú����
import java.util.Scanner;
public class Hk5{
     public static void main(String[] args){
     System.out.println("������һ��������");
	 Scanner scanner = new Scanner(System.in);
     int a = scanner.nextInt();
	 int b = 0;			
	/* for (int i = 0;; i++){
		 b = a / (int)Math.pow(10,i) % 10;
		 if ( Math.pow(10,i) > a){
		     break;
		 }		 
		 System.out.print(b);
	 }	  
	 }
}
*/
      for( ;a > 0;){
		  b = a % 10;
		  System.out.print(b);
		  a = a / 10;
	  }	  
     }
}






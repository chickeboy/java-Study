import java.text.SimpleDateFormat;
import java.util.Date;
public class datedemo{
	public static void main(String[] args){
		Date date = new Date();
		SimpleDateFormat simple = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
		System.out.println("���ڵ�ʱ����"+simple.format(date));
	}
}
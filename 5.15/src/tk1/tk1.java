package tk1;

import java.io.File;
import java.io.IOException;

public class tk1 {
	public static void main(String[] args) {
		File file = new File("D:\\javawork\\5.15\\a");
		System.out.println(file.mkdir());
		System.out.println(file.delete());
		try {
			System.out.println(file.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

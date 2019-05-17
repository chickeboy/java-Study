package HomeWork7;

import java.io.File;
import java.util.ArrayList;

/*7.
11.交易明细文件内容如下例：log.txt
#姓名 性别 帐号 发生额
刘德华|1|4155990188888888|300.00
晓龙|1|1155990199999999|500.00
黄晓明|1|4155990100000000|1000.50
张东健|1|4155990155555555|600.99
梁朝伟|0|4155990111111111|5000.00
刘德华|1|4155990188888888|200.00
张东健|1|4155990155555555|500.99
刘德华|1|4155880188888888|1200.00
PS:	1)	一行是一条交易明细，每行分4列，列间用|分隔。#为注释符号。
2)	类TransRecord存储一条明细。
实现功能:
一个人可能消费有多笔。（当姓名和账号相同的话就认为是同一人)统计每个人的消费总额。
按消费额的金额升序排序。要求显示每个人的姓名、性别、帐号、消费总额的信息*/
public class HomeWork7 {
	public static void main(String[] args) {
		File file = new File("D:\\javawork\\5.16\\log.txt");
		Manager manager = new Manager();
		Util util = new Util();
		ArrayList<TransRecord> arrayList = new ArrayList<TransRecord>();
		arrayList = manager.add();
		util.show(arrayList, "遍历数组");
		manager.write(arrayList,file);
		util.show(manager.getsum(arrayList,file), "计算总金额");
	}
}

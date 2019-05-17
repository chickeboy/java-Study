package hk1;

import java.util.HashMap;

/*Student id  name sex address
2.Score eng math chn avg
   Map  Student Score
(1)1.添加，判重*/
public class hk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student, Score> hashMap = new HashMap<Student, Score>();
		Manager manager = new Manager(hashMap);
		ModifyManager modifyManager= new ModifyManager(hashMap);
		DeleteManager deleteManager = new DeleteManager(hashMap);
		manager.add();
		Util util = new Util(hashMap);
		/*
		 * 查询   
		 * 1.遍历所有信息   
		 * 2.遍历所有男性学员   
		 * 3.输入一门学科，遍历出这门学科所有合格的学员   
		 * 4.打印出所有学科的平均分  
		 * 5.按照总分排序   
		 * 6.按照某一门课的成绩排序  
		 * 7.根据id排序
		 */
		//1.遍历所有信息   
		util.show();
		//2.遍历所有男性学员   
		util.showbysex();
		//3.输入一门学科，遍历出这门学科所有合格的学员 
		util.showbyhege(manager.input());
		//4.打印出所有学科的平均分  
		manager.dealWithAvg();
		//5.按照总分排序   
		util.showbyavg(manager.comparebyavg());
		//6.按照某一门课的成绩排序  
		util.showbycnn(manager.comparebyavg());
		//7.根据id排序
		util.showbyid(manager.comparebyid());	
		/*
		 * 3.修改  
		 *  1.根据id修改学员信息  
		 *  2.根据id修改学员成绩信息  
		 *  3.根据姓名修改学员信息   
		 *  4.根据姓名修改学员成绩信息 
		 */
		//1.根据id修改学员信息  
		modifyManager.modifybtid();
		// 2.根据id修改学员成绩信息  
		modifyManager.modifbyid();
		//根据姓名修改学员信息 
		modifyManager.modifbyname(); 
		//4.根据姓名修改学员成绩信息
		modifyManager.modifbyname2();
		/*
		 * 4.删除   
		 * 1.根据id删除学员信息   
		 * 2.根据姓名删除学员信息
		 */
		//1.根据id删除学员信息  
		deleteManager.deletebyid();
		//2.根据姓名删除学员信息
		deleteManager.deletebyname();
	}
}

package HK6;

public class Output {
	/*
	 * int count; int count2; int index; public Output(int count,int count2,int
	 * index) { this.count = count; this.count2 = count2; this.index = index; }
	 */
	public  Output() {}
	public void out(int count,int count2,int index,String str,String str2) {
		System.out.println("-------------------------------");
		System.out.println(str+"    VS    "+str2);
		System.out.println("对战次数："+index);
		System.out.println("姓名"+"\t"+"分数");
		System.out.println(str+"\t"+count);
		System.out.println(str2+"\t"+count2);
	}
}

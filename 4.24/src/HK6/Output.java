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
		System.out.println("��ս������"+index);
		System.out.println("����"+"\t"+"����");
		System.out.println(str+"\t"+count);
		System.out.println(str2+"\t"+count2);
	}
}

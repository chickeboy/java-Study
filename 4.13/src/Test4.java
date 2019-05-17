/*在马克思手稿中有一道趣味的数学问题：一共有30个人，可能包括男人，女人和小孩。
他们在一家饭馆吃饭共花了50先令，其中每个男人花3先令，每个女人花2先令，每个小孩花1先令。
请问男人、女人和小孩各几人？请编写一个程序来计算。*/
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a = 0;a<=30;a++) {
			for(int b = 0;b<=30;b++) {
				for(int c = 0;c<=30;c++) {
					if(c+2*b+3*a==50&&a+b+c==30) {
						System.out.println("男人:"+a+"女人:"+b+"小孩:"+c);
					}
				}
			}
		}
	}

}

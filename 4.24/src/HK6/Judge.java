package HK6;

public class Judge {
	int c = 0;
	public String judge(int a ,int b) {
		String str=null;
		if(a==1) {
			if(b==1) {
				str = "平局";
			}else if (b==2) {
				str =  "^_^,你输了，真笨";
			}else {
				str =  "你赢了，真厉害";
			}
		}
		if(a==2) {
			if(b==2) {
				str =  "平局";
			}else if (b==3) {
				str =  "^_^,你输了，真笨";
			}else {
				str =  "你赢了，真厉害";
			}
		}
		if(a==3) {
			if(b==3) {
				str =  "平局";
			}else if (b==1) {
				str =  "^_^,你输了，真笨";
			}else {
				str =  "你赢了，真厉害";
			}
		}
		return str;
	}
	public int judge1(int a,int b) {		
		if(a==1) {
			if(b==2) {
				c=1;
			}else if(b==3) {
				c=2;
			}
				
		}else if(a==2) {
			if(b==3) {
				c=1;
			}else if(b==1) {
				c=2;
			}
				
		}else if(a==3) {
			if(b==1) {
				c=1;
			}else if(b==2) {
				c=2;
			}
				
		}
		return c;
	}
}

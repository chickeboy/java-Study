package HK6;
//存储root用户信息的类
public class Userinformation {
	private String username;
	private String password;
	public Userinformation( String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Root [ username=" + username + ", password=" + password + "]";
	}
}

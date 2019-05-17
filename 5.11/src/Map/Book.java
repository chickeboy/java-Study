package Map;
/*实体类 Book:		id	name	type	count （Map的话id可以作为key）*/
public class Book implements Comparable<Book> {
	private String name;
	private String type;
	private int count;
	public Book(String name, String type, int count) {
		super();
		this.name = name;
		this.type = type;
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Book ["+"name=" + name + ", type=" + type + ", count=" + count + "]";
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return o.getCount()-count;
	}	
}

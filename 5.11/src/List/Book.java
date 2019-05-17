package List;
/*实体类 Book:		id	name	type	count （Map的话id可以作为key）*/
public class Book implements Comparable<Book> {
	private int id;
	private String name;
	private String type;
	private int count;
	public Book(int id, String name, String type, int count) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.count = count;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Book [id=" + id + ", name=" + name + ", type=" + type + ", count=" + count + "]";
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return o.getCount()-count;
	}
	
}

package HomeWork7;

public class TransRecord implements Comparable<TransRecord> {
	private String name;
	private int sex;
	private String account;
	private double amount;

	public TransRecord(String name, int sex, String account, double amount) {
		super();
		this.name = name;
		this.sex = sex;
		this.account = account;
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		TransRecord other = (TransRecord) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return name+"\t|"+sex+"\t|"+account+"\t|"+amount;
	}

	public String writeToString() {
		return name + ":" + sex + ":" + account + ":" + amount;
	}

	@Override
	public int compareTo(TransRecord o) {
		// TODO Auto-generated method stub
		if (amount > o.getAmount()) {
			return 1;
		} else if (amount == o.getAmount()) {
			return 0;
		} else {
			return -1;
		}
	}

}

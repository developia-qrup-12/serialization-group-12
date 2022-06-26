package main2;

import java.io.Serializable;

public class SavingAccount extends Account {
	private transient int id;

	public SavingAccount(String name, int id) {
		super(name);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

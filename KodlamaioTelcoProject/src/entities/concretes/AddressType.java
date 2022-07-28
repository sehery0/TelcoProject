package entities.concretes;

import java.util.List;

public class AddressType {
	private int id;
	private String type;

	public AddressType() {
	}

	
	public AddressType(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}

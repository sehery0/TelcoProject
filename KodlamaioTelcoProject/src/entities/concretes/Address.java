package entities.concretes;

public class Address {
	private int id;
	private String country;
	private String city;
	private String district;
	private Customer customer;
	private AddressType addressType;

	public Address() {
	}

	public Address(int id, String country, String city, String district, Customer customer, AddressType addressType) {
		this.id = id;
		this.country = country;
		this.city = city;
		this.district = district;
		this.customer = customer;
		this.addressType = addressType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	
}

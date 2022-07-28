package entities.concretes;

import java.util.List;

public class Product {
	private int id;
	private Brand brand;
	private String serialNumber;
	private List<ProductFeature> productFeatures;
	private Service service; 

	public Product() {
		super();
	}

	public Product(int id, Brand brand, String serialNumber, List<ProductFeature> productFeatures, Service service) {
		super();
		this.id = id;
		this.brand = brand;
		this.serialNumber = serialNumber;
		this.productFeatures = productFeatures;
		this.service = service;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public List<ProductFeature> getProductFeatures() {
		return productFeatures;
	}

	public void setProductFeatures(List<ProductFeature> productFeatures) {
		this.productFeatures = productFeatures;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	
	

}

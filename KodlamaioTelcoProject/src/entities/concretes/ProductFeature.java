package entities.concretes;

public class ProductFeature {
	private int productFeatureId;
	private Feature feature;

	public ProductFeature() {
		super();
	}

	public ProductFeature(int productFeatureId, Feature feature) {
		super();
		this.productFeatureId = productFeatureId;
		this.feature = feature;
	}

	public int getProductFeatureId() {
		return productFeatureId;
	}

	public void setProductFeatureId(int productFeatureId) {
		this.productFeatureId = productFeatureId;
	}

	public Feature getFeature() {
		return feature;
	}

	public void setFeature(Feature feature) {
		this.feature = feature;
	}

}

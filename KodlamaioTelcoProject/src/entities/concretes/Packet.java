package entities.concretes;

import java.util.List;

public class Packet {
	private int id;
    private String name;
    private String detail;
    private double price;
    private int period; //paketin geçerlilik süresi
    private List<SubscriptionPacket> subscriptionPackets;

    public Packet() {
    }

    public Packet(int id, String name, String detail, double price, int period, List<SubscriptionPacket> subscriptionPackets) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.price = price;
        this.period = period;
        this.subscriptionPackets = subscriptionPackets;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

	public List<SubscriptionPacket> getSubscriptionPackets() {
		return subscriptionPackets;
	}

	public void setSubscriptionPackets(List<SubscriptionPacket> subscriptionPackets) {
		this.subscriptionPackets = subscriptionPackets;
	}

   

}

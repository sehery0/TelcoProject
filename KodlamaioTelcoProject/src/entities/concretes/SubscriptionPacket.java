package entities.concretes;

public class SubscriptionPacket {
	private int subscriptionPacketId;
	private Subscription subscription;
	private Packet packet;

	public SubscriptionPacket() {
		super();
	}

	public SubscriptionPacket(int subscriptionPacketId, Subscription subscription, Packet packet) {
		super();
		this.subscriptionPacketId = subscriptionPacketId;
		this.subscription = subscription;
		this.packet = packet;
	}

	public int getSubscriptionPacketId() {
		return subscriptionPacketId;
	}

	public void setSubscriptionPacketId(int subscriptionPacketId) {
		this.subscriptionPacketId = subscriptionPacketId;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public Packet getPacket() {
		return packet;
	}

	public void setPacket(Packet packet) {
		this.packet = packet;
	}

}

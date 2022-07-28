package entities.concretes;

import java.time.LocalDate;
import java.util.List;

public class Subscription {
	private int id;
    private LocalDate dateStarted;
    private Service service;
    private Packet packet;
    private LocalDate dueDate;
    private List<Invoice> invoices;
    private Address address;
    private Customer customer;
    private List<SubscriptionPacket> subscriptionPackets;

    public Subscription() {
    }

    public Subscription(int id, LocalDate dateStarted, Service service, Packet packet, LocalDate dueDate, List<Invoice> invoices, Address address, Customer customer, List<SubscriptionPacket> subscriptionPackets) {
        this.id = id;
        this.dateStarted = dateStarted;
        this.service = service;
        this.packet = packet;
        this.dueDate = dueDate;
        this.invoices = invoices;
        this.address = address;
        this.customer = customer;
        this.subscriptionPackets = subscriptionPackets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateStarted() {
        return dateStarted;
    }

    public void setDateStarted(LocalDate dateStarted) {
        this.dateStarted = dateStarted;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Packet getPacket() {
        return packet;
    }

    public void setPacket(Packet packet) {
        this.packet = packet;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

	public List<SubscriptionPacket> getSubscriptionPackets() {
		return subscriptionPackets;
	}

	public void setSubscriptionPackets(List<SubscriptionPacket> subscriptionPackets) {
		this.subscriptionPackets = subscriptionPackets;
	}
    
    

}

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.concretes.Address;
import entities.concretes.AddressType;
import entities.concretes.Brand;
import entities.concretes.Customer;
import entities.concretes.Feature;
import entities.concretes.IndividualCustomer;
import entities.concretes.Invoice;
import entities.concretes.Packet;
import entities.concretes.Payment;
import entities.concretes.PaymentType;
import entities.concretes.Product;
import entities.concretes.ProductFeature;
import entities.concretes.Service;
import entities.concretes.Subscription;
import entities.concretes.SubscriptionPacket;

public class Main {

	public static void main(String[] args) {
		List<Invoice> invoices = new ArrayList<>();
		List<Subscription> subscriptions = new ArrayList<>();
		List<Address> addresses = new ArrayList<>();
		List<Product> products = new ArrayList<>();

		Customer customer = new IndividualCustomer(1, "A123", subscriptions, addresses, "Ali", "Veli", "123456");

		AddressType addressType = new AddressType(1, "Ev");
		Address address = new Address(1, "Türkiye", "Bursa", "Kestel", customer, addressType);
		
		Brand brand = new Brand();
		brand.setId(1);
		brand.setName("TTNET");

		

		Packet packet = new Packet(1, "avantajlı", "12 ay", 150, 1, null);

		Feature feature1 = new Feature(1, "speed", "2.4");
		Feature feature2 = new Feature(1, "cable");
		ProductFeature productFeature = new ProductFeature(1, feature1);
		List<ProductFeature> productFeatures = new ArrayList<>();
		productFeatures.add(productFeature);
		
		PaymentType paymentType = new PaymentType(1, "Kredi Kartı", null);
		Payment payment = new Payment(1, LocalDate.parse("2022-06-05"), null, paymentType);

		Invoice invoice = new Invoice(1, null, LocalDate.parse("2022-06-05"), LocalDate.parse("2022-06-05"), payment);
		Invoice invoice2 = new Invoice(2, null, LocalDate.parse("2022-06-05"), LocalDate.parse("2022-06-05"), payment);

		invoices.add(invoice);
		invoices.add(invoice2);
		Service service = new Service(1, "ADSL", subscriptions, products);
		Product product = new Product(1, brand, "A123", productFeatures, service);
		List<SubscriptionPacket> subscriptionPacket = new ArrayList<>();
		Subscription subscription = new Subscription(1, LocalDate.parse("2022-03-06"), service, packet,
				LocalDate.parse("2022-05-10"), invoices, address, customer, subscriptionPacket);
		subscriptions.add(subscription);

		IndividualCustomer individualCustomer = new IndividualCustomer(1, "1234", subscriptions, addresses, "hakkı",
				"haklı", "12345");

		System.out.println(subscription.getAddress().getCity());

	}

}

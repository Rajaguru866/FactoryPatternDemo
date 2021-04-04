package factoryPattern;

public class FactoryMain {

	public static void main(String[] args) {
		
		Subscription sub = SubscriptionFactory.getSubscription("yearly");
		System.out.println("Subscription Price is " + sub.getPrice());
		sub.enroll();

	}

}

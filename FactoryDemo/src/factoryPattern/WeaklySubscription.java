package factoryPattern;

public class WeaklySubscription implements Subscription{

	public int price = 59;
	@Override
	public int getPrice() {
		
		return price;
	}

	@Override
	public void enroll() {
		
		System.out.println("Enrolled in Weekly Subscription");
		
	}

}

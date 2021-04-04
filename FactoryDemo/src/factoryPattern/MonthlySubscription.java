package factoryPattern;

public class MonthlySubscription implements Subscription{

	public int price = 199;
	@Override
	public int getPrice() {
		
		return price;
	}

	@Override
	public void enroll() {
		
		System.out.println("Enrolled in Monthly Subscription");
		
	}

	
}

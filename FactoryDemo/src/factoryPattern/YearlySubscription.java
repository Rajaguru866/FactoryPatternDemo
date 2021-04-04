package factoryPattern;

public class YearlySubscription implements Subscription{

	public int price = 2199;
	@Override
	public int getPrice() {
		
		return price;
	}

	@Override
	public void enroll() {
		
		System.out.println("Enrolled in Yearly Subscription");
		
	}

}

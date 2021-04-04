package factoryPattern;

public class SubscriptionFactory {
	
	public static Subscription getSubscription(String subscriptionType)
	{
		if(subscriptionType.equalsIgnoreCase("weekly"))
		{
			return new WeaklySubscription();
		}
		else if(subscriptionType.equalsIgnoreCase("monthly"))
		{
			return new MonthlySubscription();
		}
		else if(subscriptionType.equalsIgnoreCase("yearly"))
		{
			return new YearlySubscription();
		}
		else
		{
			return null;
		}
	}

}

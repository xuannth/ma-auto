package utilities;

public class CapReport {
	
	private float subscription;
	private String client;
	private String user;
	private float numberOrder;
	private float totalLead;
	private float totalCap;
	private float missedLead;
	private float difference;
	
	public CapReport(float subscription, String client, String user, float numberOrder, float totalLead, float totalCap,
			float missedLead, float difference) {
		this.subscription = subscription;
		this.client = client;
		this.user = user;
		this.numberOrder = numberOrder;
		this.totalLead = totalLead;
		this.totalCap = totalCap;
		this.missedLead = missedLead;
		this.difference = difference;
	}
	public float getSubscription() {
		return subscription;
	}
	public void setSubscription(float subscription) {
		this.subscription = subscription;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public float getTotalLead() {
		return totalLead;
	}
	public void setTotalLead(float totalLead) {
		this.totalLead = totalLead;
	}
	public float getTotalCap() {
		return totalCap;
	}
	public void setTotalCap(float totalCap) {
		this.totalCap = totalCap;
	}
	public float getMissedLead() {
		return missedLead;
	}
	public void setMissedLead(float missedLead) {
		this.missedLead = missedLead;
	}
	public float getDifference() {
		return difference;
	}
	public void setDifference(float difference) {
		this.difference = difference;
	}
	public float getNumberOrder() {
		return numberOrder;
	}
	public void setNumberOrder(float numberOrder) {
		this.numberOrder = numberOrder;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}

}

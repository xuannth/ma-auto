package utilities;

public class CapReport {
	
	private String subscription;
	private String client;
	private String user;
	private int numberOrder;
	private int totalLead;
	private int totalCap;
	private String missedLead;
	private int difference;
	
	public CapReport(String sub, String client, String user, int numberOrder, int totalLead, int totalCap,
			String leadMissed, int difference) {
		this.subscription = sub;
		this.client = client;
		this.user = user;
		this.numberOrder = numberOrder;
		this.totalLead = totalLead;
		this.totalCap = totalCap;
		this.missedLead = leadMissed;
		this.difference = difference;
	}
	public String getSubscription() {
		return subscription;
	}
	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public int getTotalLead() {
		return totalLead;
	}
	public void setTotalLead(int totalLead) {
		this.totalLead = totalLead;
	}
	public int getTotalCap() {
		return totalCap;
	}
	public void setTotalCap(int totalCap) {
		this.totalCap = totalCap;
	}
	public String getMissedLead() {
		return missedLead;
	}
	public void setMissedLead(String missedLead) {
		this.missedLead = missedLead;
	}
	public int getDifference() {
		return difference;
	}
	public void setDifference(int difference) {
		this.difference = difference;
	}
	public int getNumberOrder() {
		return numberOrder;
	}
	public void setNumberOrder(int numberOrder) {
		this.numberOrder = numberOrder;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}

}

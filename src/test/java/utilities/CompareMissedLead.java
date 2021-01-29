package utilities;

public class CompareMissedLead {
	private String subID;
	private String expected;
	private String actual;
	private boolean result;
	public CompareMissedLead(String subID, String expected, String actual, boolean result) {
		this.subID = subID;
		this.expected = expected;
		this.actual = actual;
		if(expected.equals(actual))
			this.result=true;
		else
			this.result=false;
	}
	public String getSubID() {
		return subID;
	}
	public void setSubID(String subID) {
		this.subID = subID;
	}
	public String getExpected() {
		return expected;
	}
	public void setExpected(String expected) {
		this.expected = expected;
	}
	public String getActual() {
		return actual;
	}
	public void setActual(String actual) {
		this.actual = actual;
	}
	public boolean getResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
}

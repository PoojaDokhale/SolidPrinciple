package DependencyInversion;

public class Address {
	String lineOfAddress1;
	String lineOfAddress2;
	String state;
	String pin;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public String getLineOfAddress1() {
		return lineOfAddress1;
	}
	public void setLineOfAddress1(String lineOfAddress1) {
		this.lineOfAddress1 = lineOfAddress1;
	}
	public String getLineOfAddress2() {
		return lineOfAddress2;
	}
	public void setLineOfAddress2(String lineOfAddress2) {
		this.lineOfAddress2 = lineOfAddress2;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public Address(String lineOfAddress1, String lineOfAddress2, String state, String pin) {
		super();
		this.lineOfAddress1 = lineOfAddress1;
		this.lineOfAddress2 = lineOfAddress2;
		this.state = state;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [lineOfAddress1=" + lineOfAddress1 + ", lineOfAddress2=" + lineOfAddress2 + ", state=" + state
				+ ", pin=" + pin + "]";
	}
	
}

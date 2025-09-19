import java.util.Date;

public class Customer {
	private int customerId;
	private String name;
	private String phoneNumber;
	private int point;
	private Date inDate;

	public Customer(String name, String phoneNumber) {
		super();
		setName(name);
		setPhoneNumber(phoneNumber);
		setPoint(100);
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public Date getInDate() {
		return inDate;
	}

	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}

}

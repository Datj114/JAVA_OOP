package ontap1;

public class FullTimeEmployee extends Employee {

	public FullTimeEmployee() {
		// TODO Auto-generated constructor stub
	}

	public FullTimeEmployee(String name, int paymentPerHour) {
		super(name, paymentPerHour);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "FullTimeEmployee [name=" + getName() + ", pay=" + getPaymentPerHour() + "]";
	}

	public int calculateSalary() {
		// TODO Auto-generated method stub
		return 8 * getPaymentPerHour();
	}
	
}

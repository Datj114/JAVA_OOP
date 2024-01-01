package ontap1;

public abstract class Employee implements IEmployee {
	private String name;
	private int paymentPerHour;

	public Employee() {

	}

	public Employee(String name, int paymentPerHour) {
		this.name = name;
		this.paymentPerHour = paymentPerHour;
	}

	@Override
	public abstract int calculateSalary();

	@Override
	public String getName() {
		try {
			return name;
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return name;
	}

	/**
	 * @return the paymentPerHour
	 */
	public int getPaymentPerHour() {
		return paymentPerHour;
	}

	/**
	 * @param paymentPerHour the paymentPerHour to set
	 */
	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", pay=" + paymentPerHour + "]";
	}

}

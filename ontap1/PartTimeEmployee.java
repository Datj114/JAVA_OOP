package ontap1;

public class PartTimeEmployee extends Employee {
	private int workingHours;

	public PartTimeEmployee() {
	}

	public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
		super(name, paymentPerHour);
		this.workingHours = workingHours;
	}

	/**
	 * @return the workingHours
	 */
	public int getWorkingHours() {
		return workingHours;
	}

	/**
	 * @param workingHours the workingHours to set
	 */
	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [" + super.toString() + "WH=" + workingHours + "]";
	}

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return this.workingHours * this.getPaymentPerHour();
	}

}

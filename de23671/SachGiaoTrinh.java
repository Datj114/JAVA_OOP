package de23671;

public class SachGiaoTrinh extends Sach {
	private String year;
	private double price;

	public SachGiaoTrinh() {
	}

	public SachGiaoTrinh(String title, String author, String year, double price) throws NullPointerException {
		super(title, author);
		this.year = year;

		try {
			setPrice(price);
		} catch (Exception ex) {
			System.out.println(ex);;
		}

	}

	@Override
	public void getInfor() {
		System.out.println("SachGiaoTrinh [title=" + getTitle() + ", author=" + getAuthor() + "year=" + year
				+ ", price=" + price + "]");

	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) throws Exception {

		if (price <= 0) {
			throw new Exception();
		} 
			this.price = price;
		

	}

	@Override
	public String toString() {
		return "SachGiaoTrinh [" + super.toString() + "year=" + year + ", price=" + price + "]";
	}

}

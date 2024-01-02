package de23671;

public class SachBaiTap extends Sach {
	private String year;
	private double price;

	public SachBaiTap() {
	}

	public SachBaiTap(String title, String author, String year, double price) throws NullPointerException {
		super(title, author);
		this.year = year;

		try {
			setPrice(price);
		} catch (Exception ex) {
			ex.printStackTrace();
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

		if (price < 0) {
			throw new Exception();
		} else {
			this.price = price;
		}

	}

	@Override
	public String toString() {
		return "SachBaiTap [" + super.toString() + "year=" + year + ", price=" + price + "]";
	}

}

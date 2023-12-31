package de20383;

public class Tour extends Product {
	private String tour_numver_dates;
	private String tour_transport;
	
	public Tour() {
	}

	public Tour(int product_id, String product_name, double product_price, int product_total, String tour_numver_dates,
			String tour_transport) {
		super(product_id, product_name, product_price, product_total);
		this.tour_numver_dates = tour_numver_dates;
		this.tour_transport = tour_transport;
	}

	/**
	 * @return the tour_numver_dates
	 */
	public String getTour_numver_dates() {
		return tour_numver_dates;
	}

	/**
	 * @param tour_numver_dates the tour_numver_dates to set
	 */
	public void setTour_numver_dates(String tour_numver_dates) {
		this.tour_numver_dates = tour_numver_dates;
	}

	/**
	 * @return the tour_transport
	 */
	public String getTour_transport() {
		return tour_transport;
	}

	/**
	 * @param tour_transport the tour_transport to set
	 */
	public void setTour_transport(String tour_transport) {
		this.tour_transport = tour_transport;
	}

	@Override
	public double getTotalPrice() {
		return this.getProduct_price()*this.getProduct_id()*1.1;
	}

	@Override
	public String toString() {
		return "Tour ["+super.toString()+" dates=" + tour_numver_dates + ",  transport=" + tour_transport + "]";
	}

}

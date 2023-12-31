package de20383;

public abstract class Product {
	private int product_id;
	private String product_name;
	private double product_price;
	private int product_total;
	public Product() {
	}
	public Product(int product_id, String product_name, double product_price, int product_total) {
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_total = product_total;
	}
	/**
	 * @return the product_id
	 */
	public int getProduct_id() {
		return product_id;
	}
	/**
	 * @param product_id the product_id to set
	 */
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	/**
	 * @return the product_name
	 */
	public String getProduct_name() {
		return product_name;
	}
	/**
	 * @param product_name the product_name to set
	 */
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	/**
	 * @return the product_price
	 */
	public double getProduct_price() {
		return product_price;
	}
	/**
	 * @param product_price the product_price to set
	 */
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	/**
	 * @return the product_total
	 */
	public int getProduct_total() {
		return product_total;
	}
	/**
	 * @param product_total the product_total to set
	 */
	public void setProduct_total(int product_total) {
		this.product_total = product_total;
	}
	@Override
	public String toString() {
		return "Product [ id=" + product_id + ",  name=" + product_name + ",  price="
				+ product_price + ",  total=" + product_total + "]";
	}
	public abstract double getTotalPrice();
}

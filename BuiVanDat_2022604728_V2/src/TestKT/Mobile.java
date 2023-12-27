package TestKT;

public class Mobile extends Product {
	private String mobile_manufacturer;
	private String mobile_ram;
	public Mobile() {
	}
	public Mobile(int product_id, String product_name, double product_price, int product_total,
			String mobile_manufacturer, String mobile_ram) {
		super(product_id, product_name, product_price, product_total);
		this.mobile_manufacturer = mobile_manufacturer;
		this.mobile_ram = mobile_ram;
	}
	public String getMobile_manufacturer() {
		return mobile_manufacturer;
	}
	public void setMobile_manufacturer(String mobile_manufacturer) {
		this.mobile_manufacturer = mobile_manufacturer;
	}
	public String getMobile_ram() {
		return mobile_ram;
	}
	public void setMobile_ram(String mobile_ram) {
		this.mobile_ram = mobile_ram;
	}
	@Override
	public String toString() {
		return "Mobile ["+super.toString()+"manufacturer=" + mobile_manufacturer + ",  ram=" + mobile_ram + "]";
	}
	public double getTotalPrice() {
		return 1.2*this.getProduct_price()*this.getProduct_total();
	}
	
}

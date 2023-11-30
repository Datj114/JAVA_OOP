package objects;

public class Address {
	public static final String CITYNAME ="No Cityname";
	public static final String DISTRICTNAME="No districtName";
	public static final String STREETNAME="No streetName";
	
	public static int count=0;
	
	private String cityName;
	private String districtName;
	private String streetName;
	
	
	public Address() {
		this(Address.CITYNAME,Address.DISTRICTNAME,Address.STREETNAME);
	}
//	public Address(String cityName) {
//		this(cityName,Address.DISTRICTNAME,Address.STREETNAME);
//	}
//	public Address(String districtName) {
//		this(Address.CITYNAME, districtName,Address.STREETNAME);
//	}
//	
	public Address(String cityName,String districtName,String streetName) {
		this.cityName=cityName;
		this.districtName=districtName;
		this.streetName=streetName;
		Address.count++;
	}
	
	//note
	public Address(Address addr) {
		this(addr.getCityName(),addr.getDistrictName(),addr.getStreetName());
	}
	
	//getter
	public String getCityName() {
		return this.cityName;
	}
	public String getDistrictName() {
		return this.districtName;
	}
	public String getStreetName() {
		return this.streetName;
	}
	
	public Address setCityName(String cityName) {
		this.cityName=cityName;
		return this;
	}
	public Address setDistrictName(String districtName) {
		this.districtName=districtName;
		return this;
	}
	public Address setStreetName(String streetName) {
		this.streetName=streetName;
		return this;
	}

	
	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", districtName=" + districtName + ", streetName=" + streetName + "]";
	}
	public static int getCountAddress() {
		return Address.count;
	}
	
	
	//main
	public static void main(String[] args) {
		Address a1=new Address();
		Address a2=new Address("Ha Noi","Nam Tu Liem","Xuan Phuong");
		System.out.println(a2);
		a2.setCityName("Ha Nam");
		System.out.println(a2);
		a1.setCityName("Ha Nam");
		System.out.println(a1);
		System.out.println(Address.getCountAddress());
		}
}

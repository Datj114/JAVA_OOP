package objects;

public class Person {
	// constants: ten viet hoa, kieu bien trung
	public static final String FIRSTNAME = "No FirstName";
	public static final String LASTNAME = "No LastName";
	public static final byte AGE = 0;
	public static final Address ADDRESS = new Address();// gia tri ngầm định, gán cho hằng address

	// class's variables
	private static int count = 0;

	// object's properties
	private String firstName;
	protected String lastName;
	private byte age;

	private Address address;

	// constructor
	public Person() {
//		firstName="no firstname";
//		lastName="no lastname";
//		age=0;
//		this("NO FirstName","No LastName",(byte)0);
		this(Person.FIRSTNAME, Person.LASTNAME, Person.AGE, Person.ADDRESS);

	}

	public Person(String firstName, String lastName, byte age, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;

		// cach1- gan địa chỉ trong bộ nhớ - phụ thuộc địa chỉ
		this.address = address;
		// cách 2- khởi tạo bộ nhớ mới và sao chép giá trị vào bộ nhớ mời đó - độc lập
		// địa chỉ
		//this.address = new Address(address);

		// lay constructor day du lam chuan cho cac constructor khac

		// tang bien dem doi tuong
		Person.count++;
	}

	// getter methods
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public byte getAge() {
		return this.age;
	}
	public Address getAddress() {
		return this.address;
	}
	
	
	// setter methods
	public Person setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public Person setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public Person setAge(byte age) {
		this.age = age;
		return this;
	}
	public Person setAddress(Address address) {
		this.address=new Address(address);
		return this;
	}
	
	public Person setAddress(String cityName,String districtName,String streetName) {
		this.address= new Address(cityName,districtName,streetName);
		return this;
	}
	
	// orther methods
	@Override
	public String toString() {
		return lastName +" " + firstName+" "  + age  ;
//		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ",address"+this.getAddress()+"]";
	}

	public static int getCountPerson() {
		return Person.count;
	}

	protected void finalize() throws Throwable {
		// giam so doi tuong
		Person.count--;
	}

	// main
	public static void main(String[] args) {
		//khai baos ddoois tuong
		Address addr1=new Address();
		Address addr2=new Address("ha noi","bac tu nien","pho nhon");
		Address addr3=new Address(addr2);
		addr3.setStreetName("kieu mai");
		
		Person p4 = new Person("Dat", "Van", (byte) 8,addr1);
		System.out.println(p4);
		p4.setAddress(addr3);
		addr3.setCityName("thái bình");
		System.out.println(p4);
		
//		Person p2 = new Person();
//		p2.setFirstName("Doan").setLastName("Ngu").setAge((byte) 2);
//		p2.setFirstName("Dai");
//		System.out.println(p2);

		System.out.println("so doi tuong " + Person.getCountPerson());
	}
}

package objects;

public class Book {
	private String book_title;
	private short book_id;
	private short book_number_page;
	private float book_prices;
	private Person book_author;
	private String book_summary;
	private String book_details;
	private String book_images;
	private String book_notes;
	private String book_public;
	private Address book_publicser_address;
	
	public Book() {
		
	}
	
	public Book(String book_title, short book_id, short book_number_page, float book_prices, Person book_author,
			String book_summary, String book_details, String book_images, String book_notes, String book_public,
			Address book_publicser_address) {
		super();
		this.book_title = book_title;
		this.book_id = book_id;
		this.book_number_page = book_number_page;
		this.book_prices = book_prices;
		this.book_author = book_author;
		this.book_summary = book_summary;
		this.book_details = book_details;
		this.book_images = book_images;
		this.book_notes = book_notes;
		this.book_public = book_public;
		this.book_publicser_address = book_publicser_address;
	}


	// getter and setter
	public String getBook_title() {
		return book_title;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public short getBook_id() {
		return book_id;
	}

	public void setBook_id(short book_id) {
		this.book_id = book_id;
	}

	public short getBook_number_page() {
		return book_number_page;
	}

	public void setBook_number_page(short book_number_page) {
		this.book_number_page = book_number_page;
	}

	public float getBook_prices() {
		return book_prices;
	}

	public void setBook_prices(float book_prices) {
		this.book_prices = book_prices;
	}

	public Person getBook_author() {
		return book_author;
	}

	public void setBook_author(Person book_author) {
		this.book_author = book_author;
	}

	public String getBook_summary() {
		return book_summary;
	}

	public void setBook_summary(String book_summary) {
		this.book_summary = book_summary;
	}

	public String getBook_details() {
		return book_details;
	}

	public void setBook_details(String book_details) {
		this.book_details = book_details;
	}

	public String getBook_images() {
		return book_images;
	}

	public void setBook_images(String book_images) {
		this.book_images = book_images;
	}

	public String getBook_notes() {
		return book_notes;
	}

	public void setBook_notes(String book_notes) {
		this.book_notes = book_notes;
	}

	public String getBook_public() {
		return book_public;
	}

	public void setBook_public(String book_public) {
		this.book_public = book_public;
	}

	public Address getBook_publicser_address() {
		return book_publicser_address;
	}

	public void setBook_publicser_address(Address book_publicser_address) {
		this.book_publicser_address = book_publicser_address;
	}

	//tostring
	@Override
	public String toString() {
		return "Book [book_title=" + book_title + ", book_id=" + book_id + ", book_number_page=" + book_number_page
				+ ", book_prices=" + book_prices + ", book_author=" + book_author + ", book_summary=" + book_summary
				+ ", book_details=" + book_details + ", book_images=" + book_images + ", book_notes=" + book_notes
				+ ", book_public=" + book_public + ", book_publicser_address=" + book_publicser_address + "]";
	}
	
	public static void main(String[] args) {
		Book b=new Book();
		b.setBook_id((short)100);
		b.setBook_title("lap trinh huong doi tuong");
		System.out.println(b);
	}

}

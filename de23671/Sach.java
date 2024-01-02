package de23671;

public abstract class Sach {
	private String title;
	private String author;
	
	public Sach() {
	}

	public Sach(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public abstract void getInfor();
	

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Sach [title=" + title + ", author=" + author + "]";
	}

	protected abstract void setYear(String nextLine);

	protected abstract void setPrice(double nextDouble) throws Exception;




	
	
}

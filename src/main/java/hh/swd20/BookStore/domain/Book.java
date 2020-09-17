package hh.swd20.BookStore.domain;

public class Book {
	
	private String title;
	private String author;
	private String year;
	private String isbn;
	private Double price;
	
	public Book(String title, String author, String year, String isbn, Double price) {
		super();
		this.setTitle(title);
		this.setAuthor(author);
		this.setYear(year);
		this.setIsbn(isbn);
		this.setPrice(price);
	}
	
	public Book() {
		super();
		setTitle("Unknown");
		setAuthor("Unknown");
		setYear("Unknown");
		setIsbn("Unknown");
		setPrice(null);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "title =" + title + ", author=" + author;
	}
}

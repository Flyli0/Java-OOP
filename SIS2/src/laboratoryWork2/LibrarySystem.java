package laboratoryWork2;

public abstract class LibrarySystem {
	protected String title;
	protected String author;
	protected int publicationYear;
	public LibrarySystem(String title, String author, int year) {
		this.author = author;
		this.title = title;
		this.publicationYear = year;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getPublicationYear() {
		return this.publicationYear;
	}
	
	public String toString() {
		return "The item: " + title + "\n the author: " + this.author + "\n Year of publication: " + this.publicationYear;
	}
}

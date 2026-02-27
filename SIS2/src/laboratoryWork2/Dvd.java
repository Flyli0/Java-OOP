package laboratoryWork2;

public class Dvd extends LibrarySystem{
	private double lengthOfFilm;
	public Dvd(String title, String author, int year, double length) {
		this.lengthOfFilm = length;
		super(title,author,year);
	}
	public double getLength() {
		return this.lengthOfFilm;
	}
	
	public String toString() {
		return "This is a DVD: " + title + "\n the author: " + this.author + "\n Year of publication: " + this.publicationYear + "\n Length of the film: " + this.lengthOfFilm;
	}
}

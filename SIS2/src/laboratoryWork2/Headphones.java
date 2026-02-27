package laboratoryWork2;

public abstract class Headphones {
	protected String model;
	protected String title;
	protected double id;
	public abstract void music();
	
	public String getModel() {
		return this.model;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		return "Yo headphones are: " + this.model + ' ' + this.title;
	}
	
	public boolean equals(Object o) {
		if(o==this) return true;
		if(!(o instanceof Headphones) || o == null) return false;
		
		Headphones temp = (Headphones) o;
		return (this.model == temp.model) && (this.title == temp.title);
	}
	
	public int hashCode() {	
		return (int) id;
	}
}

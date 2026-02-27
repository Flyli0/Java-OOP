package laboratoryWork2;

public class FullSized extends Headphones{
	private int ambushureSize;
	public FullSized(String model, String title, int size, double id) {
		this.model = model;
		this.title = title;
		this.ambushureSize = size;
		this.id = id; 
	}
	@Override
	public void music() {
		System.out.println("Bam bam bam tyc tyc tyc tn dkdkdkddann");
	}
	
	public String getModel() {
		return model;
	}
	
	public String toString() {
		return super.toString() + "\n with ambushure size: " + this.ambushureSize;
	}
	
	public int hashCode() {
		return super.hashCode() +  this.ambushureSize;
	}
	
	public boolean equals(Object o) {
		FullSized temp = (FullSized) o;
		return super.equals(o) && (temp.ambushureSize == this.ambushureSize);
	}
}

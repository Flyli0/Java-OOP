package laboratoryWork1;
import java.util.Vector;

public class DragonLaunch {
	private Vector<Person> kidnapped;
	
	public DragonLaunch(){
		kidnapped = new Vector<Person>();
	}
	
	public void kidnap(Person p) {
		if(kidnapped.size()!=0 && kidnapped.lastElement().getGender().equals(Person.Gender.BOY) && p.getGender().equals(Person.Gender.GIRL)){
			kidnapped.remove(kidnapped.lastElement());
		}
		else {
			kidnapped.add(p);
		}
		
	}
	
	public void willDragonEatOrNot() {
		
		if(kidnapped.size()==0) {
			System.out.println("No lunch for the Dragon");
		}
		else {
			System.out.println("Hehehe Dragon will eat some humans");
		}
	}
	public String toString() {
		return "kidnapped: "+ kidnapped.size();
	}
	// bbgg 
	// gbgb
	// bgbg
}

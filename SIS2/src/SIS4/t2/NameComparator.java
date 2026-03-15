package SIS4.t2;
import java.util.Comparator;
import SIS4.Student;
public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

package laboratoryWork1;
import SIS2.Student;
public class GradeBookTest {
	public static void main(String[] args) {
		Cource c1 = new Cource("CS101 OOP", "Very cool subject", 4);
		GradeBook g1 = new GradeBook(c1);
		Student s1 = new Student("Ayaya","1");
		Student s2 = new Student("Bebebe","2");
		Student s3 = new Student("Mayson","3");
		Student s4 = new Student("Bill","4");
		Student s5 = new Student("Stanley","5");
		g1.addStudent(s1);
		g1.addStudent(s2);
		g1.addStudent(s3);
		g1.addStudent(s4);
		g1.addStudent(s5);
		g1.displayMessage();
		g1.putMarks();
		g1.displayGradesReport();
		g1.displayBarChart();
	}
}

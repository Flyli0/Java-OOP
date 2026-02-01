package SIS2;

public class test {

	public static void main(String[] args) {
		Student s = new Student("Kirill","24B031975");
		s.getName();
		s.getYear();
		s.incrementStudyYear();
		s.getYear();
		
		StarTriangle tri = new StarTriangle(5);
		System.out.print(tri.toString());
		
		Time t = new Time(14,3,54);
		Time t2 = new Time(17,15,55);
		System.out.println(t.toStandard());
		System.out.println(t.toUniversal());
		
		System.out.println(Time.add(t, t2).toUniversal());
	}
	
}

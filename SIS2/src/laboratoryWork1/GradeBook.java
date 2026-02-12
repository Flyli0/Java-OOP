package laboratoryWork1;
import SIS2.Student;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class GradeBook {
	private Cource currentCource;
	private ArrayList<Student> students;
	private ArrayList<Integer> segmentation;
	private Map<Student,Integer> grades;
	private Scanner scn;
	private double sum;
	private int count;
	
	{
		scn = new Scanner(System.in);
		segmentation = new ArrayList<Integer>();
		for(int i = 0; i<11; i++) {
			segmentation.add(0);
		}
		count = 0;
		sum = 0;
		grades = new HashMap<>();
	}
	public GradeBook(Cource c){
		currentCource = c;
		students = new ArrayList<Student>();
	}
	
	public GradeBook(Cource c, ArrayList<Student> arr){
		currentCource = c;
		students = arr;
	}
	
	public void displayMessage() {
		System.out.println("Welcome to the gradebook for " + currentCource.toString() + "!");
	}
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	public void putMarks() {
		for(Student s: students) {
			System.out.print("Student "+s.getName()+": " );
			int a = scn.nextInt();
			if(a>=0 && a<=100) {
				grades.put(s,a);
				count ++;
				sum+=a;
			}
			else {
				System.out.println("Wrong grade format!");
			}
		}
	}
	public void displayGradesReport() {
		int minimum = Integer.MAX_VALUE;
		Student minKey = new Student("A","1dw");
		Student maxKey = new Student("B","2dw");
		int maximum = Integer.MIN_VALUE;
		for(Map.Entry<Student,Integer> entry : grades.entrySet()) {
			 if (entry.getValue() < minimum) {
			        minimum = entry.getValue();
			        minKey = entry.getKey();
			    }
			 if (entry.getValue() > maximum) {
				 	maximum = entry.getValue();
				 	maxKey = entry.getKey();
			 }
		}
		System.out.println("Class average is: " + sum/count + '.' + "Lowest grade is " + minimum + "(" + minKey.getName() + "," + "ID is " + minKey.getId() + ")");
		System.out.println("Highest grade is: " + maximum + "(" + maxKey.getName() + "," + "ID is " + maxKey.getId() + ")");
	}
	public void displayBarChart() {
	    for(int grade : grades.values()) {
	        int index = grade / 10;
	        if (index > 10) index = 10; 
	        segmentation.set(index, segmentation.get(index) + 1);
	    }
	    System.out.println("Grade Distribution:");
	    for(int i = 0; i < segmentation.size(); i++) {
	        if(i == 10) {
	            System.out.printf("%3d: ", 100);
	        } else {
	            System.out.printf("%02d-%02d: ", i*10, i*10+9);
	        }
	        for(int j = 0; j < segmentation.get(i); j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
	
	public String toString() {
		return "this is the gradebook for cource: " + currentCource;
	}

}

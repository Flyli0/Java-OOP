package SIS2;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Student {
	private String studentName;
	private int year_of_study = 1;
	private String Id;
	private Scanner scn = new Scanner(System.in);
	Student(String newName,String newID){
		studentName = newName;
		Id = newID;
	}
	public void getName(){
		System.out.println(studentName);
	}
	public void setName() {
		final Pattern pat = Pattern.compile("[a-zA-z]*");
		String a = scn.nextLine();
		Matcher mat = pat.matcher(a);
		if(mat.find()) {
			studentName = a;
		}
		else {
			System.out.println("Wrong format");
		}
	}
	public void getId() {
		System.out.println(Id);
	}
	public void getYear() {
		System.out.println(year_of_study);
	}
	public void incrementStudyYear(int inc) {
		if(inc > 0 && inc + year_of_study <= 8) {
		year_of_study+=inc;
		}
	}
	public void incrementStudyYear() {
		if(year_of_study < 8) {
			year_of_study++;
		}
	}
}

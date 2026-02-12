package laboratoryWork1;
import java.util.Scanner;

public class Analyzer {
	private static Scanner scn;
	private String input;
	private Data set;
	{
		scn = new Scanner(System.in);
		set = new Data();
	}
	
	public void analyze() {
		while(true) {
			System.out.println("Insert a number:(Q to Exit)");
			input = scn.next();
			if(input.equalsIgnoreCase("Q")) {
				break;
			}
			else {
				set.addValue(Integer.parseInt(input));
			}
		}
		System.out.println("Average is: " + set.getAverage());
		System.out.println("Maximum is: " + set.getMax());
	}
}

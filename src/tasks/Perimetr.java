package tasks;
import java.util.Scanner;
public class Perimetr {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Insert length of square's side");
		int a = scn.nextInt();
		System.out.println("perimetr = " +  a*4);
		System.out.println("Length of diagonal = " + (int)(a*Math.sqrt(2)));
		scn.close();
	}

}

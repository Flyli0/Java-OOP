package tasks;
import java.util.Scanner;
public class Quadsolver {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Insert a, b, c values");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int discriminant = (int)Math.pow(b, 2) - 4*a*c;
		if(discriminant>0) {
			int x1 = (b*(-1) - (int)Math.sqrt(discriminant))/2*a;
			int x2 = (b*(-1) + (int)Math.sqrt(discriminant))/2*a;
			System.out.println("This equation has 2 distinct roots: ");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		else if(discriminant == 0) {
			int x = (b*(-1)/ (2*a));
			System.out.println("This equation has 1 distinct root: ");
			System.out.println("x = " + x);
		}
		else {
			System.out.println("This equation has no real roots");
		}
		scn.close();
	}
}

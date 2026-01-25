package tasks;
import java.util.Scanner;
public class Interest_system {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double interest = 0.09;
		System.out.println("OUR YEAR INTEREST RATE IS 9%");
		System.out.println("How much do you want to add to your account?");
		int a = scn.nextInt();
		System.out.println("After one year your account will be: ");
		System.out.println(a+a*interest);
		scn.close();
	}

}

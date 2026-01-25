package tasks;
import java.util.Scanner;
public class Palindromchek {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String a = scn.next();
		int len = a.length();
		boolean pali = true;
		for(int i = 0; i<(len/2); i++) {
			char letter1 = a.charAt(i);
			char letter2 = a.charAt(len-i-1);
			if(letter1!=letter2) {
				pali = false;
			}
		}
		if(pali) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Palindrom");
		}
		scn.close();
	}

}

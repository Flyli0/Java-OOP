package SIS4;

public class App {
	public static void main(String args[]) {
		Restaurant delpapa = new Restaurant("DelPapa");
		delpapa.servePizza(new Cat());
		Person p = new Person("Sherlock","Baker street 221b");
		System.out.println(p.getAcc());
		delpapa.servePizza(p);
		}
}

package laboratoryWork1;

public class Dragon {
	public static void main(String args[]) {
		Person girl1 = new Person("girl");
		Person girl2 = new Person("girl");
		Person boy1 = new Person("boy");
		Person boy2 = new Person("boy");
		DragonLaunch d = new DragonLaunch();
		d.kidnap(boy1);
		d.kidnap(girl1);
		
	
		
		d.kidnap(girl2);
		d.kidnap(boy2);
		d.willDragonEatOrNot();
		System.out.println(d.toString());
	}
}

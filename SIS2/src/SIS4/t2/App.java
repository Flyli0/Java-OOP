package SIS4.t2;

public class App {
	private String name;
	public App(String name) {
		this.name = name;
	}
	
	public void getStatistics(Game g) {
		g.play();
		g.win();
		if(g instanceof Igame) {
			Igame t = (Igame) g;
			t.countPoints();
		}
	}
}

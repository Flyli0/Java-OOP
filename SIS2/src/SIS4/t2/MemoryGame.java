package SIS4.t2;

public class MemoryGame implements Igame{
	private int counter;
	private String name;
	{counter = 0;}
	
	public MemoryGame(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println("The game has started!");
		counter++;
	}

	@Override
	public void pause() {
		System.out.println("Paused...");
		
	}

	@Override
	public void win() {
		System.out.println("You won!!!");
		
	}

	@Override
	public int countPoints() {
		return counter;
	}

}

package laboratoryWork1;

public class MyChocolate {
	private static String brand;
	private final int weightOfBar;
	private final String recepie; 
	private Fillers filler;
	private int volumeOfNuts;
	enum Fillers{
		PEANUT, DUBAI, LIQUOR, MARZEPAN;
	}
	
	MyChocolate(int weightOfBar){
		this.weightOfBar = weightOfBar;
	}	
	
	{
		recepie = "Cocoa powder: 200gr, Milk: 150gr, Shugar: 100gr mix and heat,add Butter: 120gr, Nuts:by your choice(add in the end)";
		brand = "ChocoH";
	}
	
	public String getRecepie() {
		return recepie;
	}
	
	public void addFiller(String filler) {
		Fillers s = Fillers.valueOf(filler.toUpperCase());
		switch(s) {
		case PEANUT:
			this.filler = Fillers.PEANUT;
		break;
		case DUBAI:
			this.filler = Fillers.DUBAI;
		break;
		case LIQUOR:
			this.filler = Fillers.LIQUOR;
		break;
		case MARZEPAN:
			this.filler = Fillers.MARZEPAN;
		break;
		default:
			System.out.println("We don't have such toping ID in the menu");
		}
	}
	
	public static void getBrand() {
		System.out.println(brand);
	}
	
	public void addFiller(int numberOfFiller) {
		switch(numberOfFiller) {
		case 1:
			filler = Fillers.PEANUT;
		break;
		case 2:
			filler = Fillers.DUBAI;
		break;
		case 3:
			filler = Fillers.LIQUOR;
		break;
		case 4:
			filler = Fillers.MARZEPAN;
		break;
		default:
			System.out.println("We don't have such toping ID in the menu");
		}
	}
	
	public void getFiller() {
		System.out.println(filler);
	}
}

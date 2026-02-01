package SIS2;

public class StarTriangle {
	private int width;
	StarTriangle(int new_width){
	   width = new_width;
	}
	public String toString(){
		String triangle = "";
		for(int i = 1; i<=width; i++) {
			for(int j = 0; j<i; j++) {
				triangle+="[*]";
			}
			triangle+="\n";
		}
		return triangle;
	}
}

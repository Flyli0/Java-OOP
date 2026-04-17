package streams;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
public class Read {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\kiril\\OneDrive\\Рабочий стол\\filst.txt");
		String content = fr.readAllAsString();
		fr.close();
		System.out.println(content);
		
		OutputStream os = new FileOutputStream("C:\\Users\\kiril\\OneDrive\\Рабочий стол\\filst.txt");
		String message = "when the staars smile at moon, wonder how it looks in your eyes";
		os.write(message.getBytes());
		os.close();
		
		InputStream is = new FileInputStream("C:\\Users\\kiril\\OneDrive\\Рабочий стол\\filst.txt");
		byte[] contentb = is.readAllBytes();
		String contStr = new String(contentb);
		is.close();
		System.out.println(contStr);
		
	}

}

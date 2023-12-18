import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01_FileWrite1 {

	public static void main(String[] args) throws IOException {
		

		OutputStream out = new FileOutputStream("data.txt");
		out.write(65);
		out.close();

	}
}

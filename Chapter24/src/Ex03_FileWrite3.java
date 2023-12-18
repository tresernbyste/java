import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex03_FileWrite3 {
	public static void main(String[] args) {
		
		// 리소스를 try문 소괄호에 넣어주면 따로 소스 close를 하지 않아도된다.
		try ( OutputStream out = new FileOutputStream("data.txt") ) {
			out.write(67);
		}

		catch (IOException e) {

			e.printStackTrace();
		}

	}
}
// Ex02_FileWrite2.java 의 내용을 축약한 버전 훨씬 간편함.
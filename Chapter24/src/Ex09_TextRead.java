import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex09_TextRead {
	
	public static void main(String[] args) {
		
		try (Reader in = new FileReader("text.txt")) {
			
			int ch;
			
			while(true) {
				ch=in.read();
				// 파일의 끝인 -1 을 위해서 앞서 ch를 int형으로 변환해줘야한다.
				if(ch ==-1 )break;
				// 출력할때는 다시 char형으로 변환해준다.
				System.out.print((char)ch);
			}
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}

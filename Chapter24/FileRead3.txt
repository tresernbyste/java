import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex04_FileRead {
	public static void main(String[] args) {
		
		try ( InputStream in = new FileInputStream("data.txt")) { // 자식을 부모에게 대입?? 리소스 소괄호시 close자동
			
			int dat = in.read();
			System.out.println(dat);
			
			// 결과값 C로나오는 이유는 %c 문자열  dat의 문자열을 출력하라~ 
			System.out.printf("%c \n",dat);
		} catch (IOException e) {
			
		}
		
	}
}

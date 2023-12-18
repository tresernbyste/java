import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex08_TextWrite {
	public static void main(String[] args) {
		
		try (Writer out = new FileWriter("text.txt")){
			
			
			// ch 는 아스키코드 A의 정수 ;  65(ch)가 'Z'+1 보다 작은동안 ch 1씩증가      
			for(int ch = (int)'A'; ch < (int)('Z'+1); ch++ )
				// ch를 계속 txt파일에 저장 저장저장   영어 대문자를 
				out.write(ch);
			
			out.write(13); // \r  아스키 코드로 줄바꿈과 커서위치를 설정한 것인다  결국은 enter의 효과를 위해
//			out.write(10); // \n  넣어준 구문이다.
			
			for(int ch = (int)'A'+32; ch < (int)('Z'+1+32); ch++ )
				out.write(ch);
			
			out.write(13); // 커서
			out.write(10); // 줄바꿈
			
			out.write("동해물과 백두산이 마르고 닳도록");
			out.write("\r\n");
			out.write("하느님이 보우하사 우리나라만세");
			out.write("\r\n");

			
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}

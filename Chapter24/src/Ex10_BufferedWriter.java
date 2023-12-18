import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex10_BufferedWriter {
	public static void main(String[] args) {
		
		String str1 = "동해물과 백두산이 마르고 닳도록";
		String str2 = "하느님이 보우하사 우리나라 만세";
		
		// 데이터 처리 효율성이 높다. 
		// 버퍼 사용하는거 좋아 . 근데 더 좋게 사용하기위해서 버퍼필터스트림 (보조스트림,기반스트림을 한번에) 연결해 사용한다.
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("text2.txt"))) {
			
			// str1의 0인덱스부터 length개 까지 저장
			bw.write(str1, 0, str1.length());
			bw.newLine(); // OS에 맞는 라인을 자동으로 넣어준다.   그전에 CRLF를 사용한것보다 편하게 어디서든 사용
			bw.write(str2, 0, str2.length());
			
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}

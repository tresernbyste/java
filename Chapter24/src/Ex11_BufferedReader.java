import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex11_BufferedReader {
	public static void main(String[] args) {
		// 
		try( BufferedReader br = new BufferedReader(new FileReader("text2.txt")) ) {
				
			String str;
			
			while(true) {
				str = br.readLine(); // byte로 읽던걸 readLine 한줄씩 읽어 더빨라
				if(str == null) break;
				
				// 읽어드린 문자열에는 개행정보가 포함되지 않기때문에 읽어드린것을 출력시 개행을 위해 println을 이용한다.
				// 당연하게 생각하면 newLine으로 자동으로 만들어줬기때문에 읽을순 있지만 그 정보가 저장되지는 않는다. 
				System.out.println(str);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}

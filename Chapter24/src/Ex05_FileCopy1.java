import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;

public class Ex05_FileCopy1 {

	public static void main(String[] args) {
		
		String src = "./src/Ex04_FileRead.java";
		String dst = "FileRead1.txt";
		
		try ( InputStream in = new FileInputStream(src);
				OutputStream out = new FileOutputStream(dst) ){
			
			
			Instant start = Instant.now(); // 시작한 현재시간
			int data;
			
			while(true) {
				data = in.read();
				if(data == -1) break;
				out.write(data);
			}
			
			Instant end = Instant.now(); // 끝난 현재시간
			
			System.out.println("복사에 걸린시간 : " + Duration.between(start, end).toMillis());
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
	}
}

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

public class Ex07_FileCopy3 {

	public static void main(String[] args) {

		String src = "./src/Ex04_FileRead.java";
		String dst = "FileRead3.txt";

		// 보조스트림에 버퍼를 이용한 파일 복사 프로그램 제일빠름   fileIntput이 기반 스트림   bufferedinput이 보조스트림
		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dst))) {

//			byte[] buf = new byte[1024];  위에 보조스트림을 이용했기 때문에 필요하지 않다 .그렇기에 더 빠르다.

			Instant start = Instant.now();

			int data;
			while (true) {
				data = in.read();
				if (data == -1)
					break;
				out.write(data);
			}

			Instant end = Instant.now();
			System.out.println("복사에 걸린시간 : " + Duration.between(start, end).toMillis());

		} catch (IOException e) {

			e.printStackTrace();

		}
	}
}

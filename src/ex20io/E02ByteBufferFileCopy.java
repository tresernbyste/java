//	버퍼 Buffering 생각보다 오래걸리는 입출력 시간 
//  동영상 시청시 보이는 불투명 하얀색 바 -- 버퍼 
// E01ByteFileCopy 보다 빠른 속도


// 1byte씩 읽어 복사하는것 보다 1kb(1024byte)씩 읽어 저장할 수 있는 버퍼를 이용하기 때문에 복사 속도가 빨라진다.
package ex20io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class E02ByteBufferFileCopy {
	public static void main(String[] args) {

		try {
			InputStream in = new FileInputStream("src/ex20io/npp.zip");
			OutputStream out = new FileOutputStream("src/ex20io/npp_copy.zip");  // 경로 지정 중요 같은 이름의 폴더 조심 상위폴더에 같은 이름의 경로가 있다면 상위폴더에서 없다고 걸리는 경우가 생길수 있다.

			int copyByte = 0;
			int readLen;
			// 버퍼를 사용할 크기가 10인 char형 배열 생성 
			byte buffer[] = new byte[1024];
			
			// 파일의 전체를 읽기 위해 무한루프를 이용한다. 
			while (true) {
				readLen = in.read(buffer);
				if (readLen == -1) {			// 무한루프 탈출구문
					break;
				}
				// 초
				out.write(buffer, 0, readLen);
				copyByte += readLen;

			}

			if (in != null)
				in.close();
			if (out != null)
				in.close();

			System.out.println("복사된 파일크기 : " + copyByte + "byte");
			System.out.println("복사된 파일크기 : " + (copyByte / 1024) + "Kbyte");
			System.out.println("복사된 파일크기 : " + (copyByte / 1024 * 1024) + "Mbyte");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("IO작업중 예외가 발생되었습니다.");
		} catch (Exception e) {									//가장 나중에 나와야한다.
			System.out.println("알수 없는 예외가 발생되었습니다.");

		}
	}
}
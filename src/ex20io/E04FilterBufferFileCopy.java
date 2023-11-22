package ex20io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class E04FilterBufferFileCopy {

	// 버퍼 필터 스크림을 통한 복사 프로그램
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("src/ex20io/npp_copy.zip");
			OutputStream out = new FileOutputStream("src/ex20io/npp_copy_copy.zip");

			
			// 파일 입출력을 위한 버퍼 필터링 // 아까보다 더 빠른   버퍼 필터 스트림이다~ 여기에 저장하고 옮기기 때문에 더 빠르다 
			BufferedInputStream bufIn = new BufferedInputStream(in);
			BufferedOutputStream bufOut = new BufferedOutputStream(out);

			int copyByte = 0;
			int bData;

			while (true) {

				bData = bufIn.read();

				if (bData == -1) {
					break;
				}
				bufOut.write(bData);
				copyByte++;
			}

			bufIn.close();
			bufOut.close();
			System.out.println("복사된 파일크기 : " + (copyByte / 1024) + "Kbyte");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

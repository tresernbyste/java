package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class E01ByteFileCopy {

	public static void main(String[] args) {
		
		InputStream in = null;
		OutputStream out = null;
		int copyByte = 0;
		try {
			in = new FileInputStream("src/ex20io/npp.8.5.8.portable.x64.zip");						//입력스트림
			out = new FileOutputStream("src/ex20io/npp.8.5.8.portable.x64_copy.zip");				//출력스트림
			int bData;																				// 원본파일에서 1byte를 읽어 저장하기위한 변수 
			while(true) {
				bData = in.read();    // 원본파일을 읽어온다.
				
				if(bData==-1) {
					break;
				}
				out.write(bData);
				copyByte++;
			}
		}
		
		catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지않습니다.");
		}
		catch(IOException e) {
			System.out.println("파일스트림 생성시 오류발생됨.");
		}
		finally {  // 반드시 실행 
			try {
				in.close();    // 쓸데없이 열려있는일없게 finally 구문을 이용해 닫아준다 
				out.close();
				
				System.out.println("복사된 KByte 크기:" + (copyByte/1024));
			}
			catch(IOException e) {
				System.out.println("파일스트림닫기오류");
			}
		}
	}

}

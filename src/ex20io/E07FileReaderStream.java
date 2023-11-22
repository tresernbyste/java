package ex20io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class E07FileReaderStream {

	public static void main(String[] args) {

		try {
			char[] cbuf = new char[10];
			int readCnt;

			Reader in = new FileReader("src/ex20io/alpha.txt");
			//  배열 앞에서부터 최대 10개의 문자를 읽어온다.
			readCnt = in.read(cbuf, 0, 10);
			// 읽어온 내용을 출력
			for (int i = 0; i < readCnt; i++) {
				System.out.println(cbuf[i]);
			}

			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일없음");
		} catch (Exception e) {
			System.out.println("IO오류발생");
		}
	}

}

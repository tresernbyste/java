package ex20io;

import java.io.BufferedReader;
import java.io.FileReader;

public class E09StringReader {

	public static void main(String[] args) {

		try {
			//문자열을 읽기 위한 입력스트림 생성
			BufferedReader in = new BufferedReader(new FileReader("src/ex20io/string.txt"));

			String str;

			while (true) {
				
				//개행이 등장하기 전까지의 데이터를 한번에 읽어 온다 즉, 한줄씩 읽는다
				// 문자열이 많은 글을 한번에 읽어올수 있다!
				str = in.readLine();

				if (str == null) {
					break;
				}
				System.out.println(str);
			}
			in.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

package ex20io;


//자바는 유니코드를 기반으로 문자를 저장한다. 
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class E06FileWriterStream {
	
	public static void main(String[] args) {
		
		try{
			char ch1 = 'A';
			char ch2 = 'Z';
			
			Writer out = new FileWriter("src/ex20io/alpha.txt");
			
			out.write(ch1);   // out.write 출력  out 저 파일에 A를
			out.write(ch2);   // // out.write 출력  out 저 파일에 Z를		
			out.close();
		}
		catch(IOException e) {
			System.out.println("문자스트림 작업중 오류발생 ");
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}

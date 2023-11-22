//	기본자료형 데이터 입출력+버퍼기능
//  제일빠른 입출력  버퍼 , 필터스트림 모두 이용
package ex20io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class E05FilterDataBufferStream {
	public static void main(String[] args) {
		// 파일경로 지정 
		String src = "src/ex20io/dataBufferStream.bin";  //bin는 2진법으로 저장되어있기 때문에 컴퓨터만 읽을수 있음 

		try {
			// 파일생성을 위한 파일 출력 스트림 
			OutputStream out = new FileOutputStream(src);
			// 버퍼사용을 위한 필터스트림 생성
			BufferedOutputStream bufFilterOut = new BufferedOutputStream(out);
			// 
			DataOutputStream dataFilterOut = new DataOutputStream(bufFilterOut);

			dataFilterOut.writeInt(555);
			dataFilterOut.writeDouble(55.55);
			dataFilterOut.writeInt(999);
			dataFilterOut.writeDouble(99.99);

			dataFilterOut.close();
			// 3개의 스트림을 한번에 생성한다.  Data
			DataInputStream dataFilterIn = new DataInputStream(new BufferedInputStream(new FileInputStream(src)));

			int intNum1 = dataFilterIn.readInt();
			double dblNum1 = dataFilterIn.readDouble();
			int intNum2 = dataFilterIn.readInt();
			double dblNum2 = dataFilterIn.readDouble();

			dataFilterIn.close();

			System.out.printf("저장된 정수는 %d, %d\n", intNum1, intNum2);
			System.out.printf("저장된 실수는 %.2f, %.2f%n", dblNum1, dblNum2);

		}

		catch (Exception e) {
			System.out.println("IO예외발생");
			e.printStackTrace();
		}
	}

}

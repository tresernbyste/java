package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
// 직렬화  인스턴스가 파일의 형태로 저장되는것을 직렬화 라고 한다. 


class Circle implements Serializable {
	int xPos, yPos;
	double radian;

	public Circle(int xPos, int yPos, double radian) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.radian = radian;
	}

	public void showCircleInfo() {
		System.out.printf("좌표[%d,%d]", xPos, yPos);
		System.out.println("반지름: " + radian);
	}

}

public class E11ObjectSerializable {

	public static void main(String[] args) {

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/ex20io/circle.obj"));

			out.writeObject(new Circle(1, 1, 2.4));
			out.writeObject(new Circle(2, 2, 4.8));
			out.writeObject(new String("String타입의 오브젝트"));
			out.close();

			ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/ex20io/circle.obj"));

			// 저장시 오브젝트 기반으로 저장되므로 복원할때는 원래의 자료형으로 다운캐스팅 해야한다.   
			Circle c1 = (Circle) in.readObject();
			Circle c2 = (Circle) in.readObject();
			String message = (String) in.readObject();
			in.close();

			c1.showCircleInfo();
			c2.showCircleInfo();
			System.out.println("String 오브젝트: " + message);
		} catch (ClassNotFoundException e) {
			System.out.println("클래스없음");
		} catch (FileNotFoundException e) {
			System.out.println("파일없음");
		} catch (IOException e) {
			System.out.println("뭔가없음");
		}
	}

}

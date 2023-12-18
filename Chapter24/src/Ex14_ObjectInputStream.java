import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex14_ObjectInputStream {
	public static void main(String[] args) {
		
		try ( ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Object.bin"))){
			
			
			// (Ex12_unit) 은 상위객체이 오브젝트의 메서드를 사용했기에 다운해주는것다운캐스팅? 
			Ex12_Unit unit1 = (Ex12_Unit) ois.readObject();
			System.out.println(unit1.getName());
			Ex12_Unit unit2 = (Ex12_Unit) ois.readObject();
			System.out.println(unit2.getName());
			
			// input 시에 에러를 위해 추가
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}catch (IOException e) {

			e.printStackTrace();
		}
	}
}

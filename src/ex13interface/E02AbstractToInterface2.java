// 추상클래스를 인터페이스로 변경하는 방법 변경함.

// 추상일때 가능한거겠지  --- 고로, 인터페이스도 오보라이딩이 목적이다~  인터페이스를 사용하게되면 추상클래스로 만드는것보다 코드가 줄어듬그래서 사용 
// INTERFACE == 다중상속, 다중구현이 가능하기때문에 사용 !


package ex13interface;

// 프로젝트 전체에서 기준의 역할을 합니다. 
interface IPersonalNumberStorageAbs {					//  abstract class ----> interface 로 변경시 
														// public abstract 모두 삭제해야한다.
	void addPersonalInfo(String juminNum, String name);   // public abstract 삭제해도된다. 
															//	Interface 에는 무조건적으로 포함되는 구문이기때문에 생략가능 지워도 되는것!
	String searchPersonalInfo(String juminNum);  // public abstract 삭제  
}														// interface에 선언된 변수도 public static final 생략가능



class PersonalInfoVO {
	private String name;
	private String juminNum;

	public PersonalInfoVO(String name, String juminNum) {
		super();
		this.name = name;
		this.juminNum = juminNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJuminNum() {
		return juminNum;
	}

	public void setJuminNum(String juminNum) {
		this.juminNum = juminNum;
	}


}
									// 구현이라는 용어    
									// interface 가 interface를 상속할때에는 extends를 사용해야한다. ?? 
class PersonalNumberStorageImpm implements IPersonalNumberStorageAbs {   //  Ipersonal 이 인터페이스

	PersonalInfoVO[] personalArr;
	int numOfPerInfo;

	
	
	public PersonalNumberStorageImpm(int arrSize) {
		personalArr = new PersonalInfoVO[arrSize];
		numOfPerInfo = 0;
	}

	@Override // 추상메서드 선언을 하지 않았기 때문에 필수 오버라이딩! 하지않으면 에러가 난다.
	public void addPersonalInfo(String juminNum, String name) {
		
//		객체 생성후 값 저장을 DTO에서 가져온다
		personalArr[numOfPerInfo] = new PersonalInfoVO(name, juminNum);
		numOfPerInfo++;
	}

	@Override
	public String searchPersonalInfo(String juminNum) {
		for (int i = 0; i < numOfPerInfo; i++) {      // search 할때 67번줄 배열에 저장된 만큼만 i반복! 그렇지 않으면 많들어놓은 배열의 주소값 전부틑 확인해야되서 시간,전력 사용 많아짐 
			if (juminNum.compareTo(personalArr[i].getJuminNum()) == 0) {
				return personalArr[i].getName();
			}
		}
		return null;  // String void값이 없기 때문에 String 값은 항상 비워 놓는다 다음 정보가 들어와야하기때문에 
		
	}

}

public class E02AbstractToInterface2 {

	public static void main(String[] args) {
		PersonalNumberStorageImpm storage = new PersonalNumberStorageImpm(10); // 10개 배열 ㄱ

		storage.addPersonalInfo("901234-2222222", "김태희");
		storage.addPersonalInfo("901234-1111111", "정지훈");

		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
		System.out.println(storage.searchPersonalInfo("001024-1090333"));

	}

}

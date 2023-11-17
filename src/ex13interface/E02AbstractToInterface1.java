package ex13interface;

// 프로젝트 전체에서 기준의 역할을 합니다. 
abstract class PersonalNumberStorageAbs {

	// 해당 클래스는 추상메서드 를 포함하고 있으므로 하위에서 상속받게되면 반드시 추상메서드를 오버라이딩해줘야한다.
	public abstract void addPersonalInfo(String juminNum, String name);

	public abstract String searchPersonalInfo(String juminNum);
}

//  DTO -- data transfer object 데이터를 저장하고 전송하기 위한 용도의 객체  (객체의 변수 초기화)  ex회원정도 dto 회원관리 dto
//	해당 프로그램에서는 한 사람의 정보를 저장하는 용도로 사용된다.

//  VO -- value object 로 표현하기도함 

class PersonalInfoDTO {
	// 이름과 주민번호를 멤버변수로 정의
	private String name;
	private String juminNum;

	// 멤버변수 선언후 생성자 자동생성 source - using field 사용할 변수 체크 후 생성
	public PersonalInfoDTO(String name, String juminNum) {
		super();
		this.name = name;
		this.juminNum = juminNum;
	}

	// 멤버변수가 private 이기 때문에 getter method
	// source - getter setter 사용할 private 멤버변수 체크 후 생성
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

	// DTO 생성 끝

}

class PersonalNumberStorageExt extends PersonalNumberStorageAbs {

	PersonalInfoDTO[] personalArr;
	int numOfPerInfo;

	
	// 생성자에서 객체 배열 생성및 인덱스 변수 초기화 
	
	public PersonalNumberStorageExt(int arrSize) {
		personalArr = new PersonalInfoDTO[arrSize];
		numOfPerInfo = 0;
	}

	@Override // 추상메서드 선언을 하지 않았기 때문에 필수 오버라이딩! 하지않으면 에러가 난다.
	public void addPersonalInfo(String juminNum, String name) {
		
//		객체 생성후 값 저장을 DTO에서 가져온다
		personalArr[numOfPerInfo] = new PersonalInfoDTO(name, juminNum);
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

public class E02AbstractToInterface1 {

	public static void main(String[] args) {
		PersonalNumberStorageExt storage = new PersonalNumberStorageExt(10); // 10개 배열 ㄱ

		storage.addPersonalInfo("901234-2222222", "김태희");
		storage.addPersonalInfo("901234-1111111", "정지훈");

		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
		System.out.println(storage.searchPersonalInfo("001024-1090333"));

	}

}

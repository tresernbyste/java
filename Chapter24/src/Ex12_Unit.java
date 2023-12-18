// 옆에 느낌표 경고 표시의 이유는 4줄의 생략때문
public class Ex12_Unit implements java.io.Serializable{

//	private static final long serialVersionUID = 1L;  // 생략가능
	private String name;
	
	public Ex12_Unit(String name) {
		this.name = name;
	}
	
	// 멤버변수 private선언했기때문에 불러쓰기위함 게터메서드
	public String getName() {
		return name;
	}
}

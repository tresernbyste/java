package ex18lambda;
// 함수형 인터페이스  하나의 추상메서드만 생성할수있다. 
@FunctionalInterface
interface ISchool4 {
	void studyLambda(String str);
}

public class Ex04FunctionalInterface {

	static void execute(ISchool4 school4, String s) {
		school4.studyLambda(s);
		
	}
	public static void main(String[] args) {
		
		// 오버라이딩 한 구문이다.
		ISchool4 sch = (str) -> System.out.println("ISchool4를 구현받아 정의한 람다입니다."+ str);
		
		execute(sch, "\n람다를 매개변수로 전달합니다.");
	}
}

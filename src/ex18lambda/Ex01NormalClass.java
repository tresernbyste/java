package ex18lambda;

interface ISchool1 {
	void studyLambda(String str);
}

//  인터페이스를 사용하게 되면  implements 를 하게 될경우 필수 오버라이딩해야한다.

class Student1 implements ISchool1 {
	@Override
	public void studyLambda(String str) {
		System.out.println(str + "을(를) 공부합니다.");
	}
}

public class Ex01NormalClass {

	public static void main(String[] args) {
		ISchool1 sch = new Student1();
		sch.studyLambda("람다식");

	}

}

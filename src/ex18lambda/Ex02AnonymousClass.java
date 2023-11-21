package ex18lambda;

interface ISchool2 {
	void studyLambda(String str);
}
// 익명클래스이기때문에  implements를 할필요가없다.
//  눈에 보이지 않는상속이 되어있어 오버라이딩이 가능합니다. 
//  메인에서 바로 오버라이딩해서 사용할수 있다.


public class Ex02AnonymousClass {
	public static void main(String[] args) {

		ISchool2 sch = new ISchool2() {
			@Override
			public void studyLambda(String str) {
				System.out.println(str + "을 공부하기위해 익명클래스를만들어요");
			}
		};
		sch.studyLambda("람다식");
	}
}

package ex18lambda;

interface ISchool3{
	void studyLambda(String str);
}
public class Ex03Lambda {
	public static void main(String[] args) {
		
		ISchool3 sch1 = (String str) -> {
			System.out.println(str+ "을 드디어 써보네요");
		};
		sch1.studyLambda("람다식");
		
		ISchool3 sch2 = str -> System.out.println(str + "완전 간단..!");
		sch2.studyLambda("람다식");
	}
}

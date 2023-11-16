// 같은 이름의 다른 매개변수 --- 오버로딩  다른 메소드 
// 그런데 같은배열...??
// 매개변수가 1가지~ 10까지 정도 생긴다면

// 가변인자 VariableArgument



package ex12inheritance;

public class E08VariableArgument
{
//	static int getTotal(int param) {
//		int total = 0;
//		total += param;
//		return total;
//	}
//	static int getTotal(int param1, int param2) {
//		int total = 0;
//		total += (param1 + param2);
//		return total;
//	}
//	static int getTotal(int param1, int param2, int param3) {
//		int total = 0;
//		total +=(param1+param2+param3);
//		return total;
//	}
	static int getTotal(int ...param) {  // param 이 무수히 많은경우 
		int total = 0;									// 매개변수의 자료형이 같을 때 사용가능!
		for(int i =0; i< param.length; i++) {
			total += param[i];
		}
		return total;
	}
	
	public static void main(String[] args)
	{
		System.out.println("getTotal(args1)호출:"+ getTotal(10));
		System.out.println("getTotal(args1,args2)호출:"+ getTotal(10,20));
		System.out.println("getTotal(args1,args2,args3)호출:"+ getTotal(10,20,30));
		System.out.println("getTotal(매개변수6개)호출:"+ getTotal(10,20,30,40,50,60));
//		System.out.println("getTotal(args1,args2)호출:"+ getTotal(10,20.3)); // 매개변수에 int 형아 아닌 double형이 있기때문에 에러오류 
	}
}

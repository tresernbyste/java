package ex15usefulclass;

class IntNumber {
	int num;

	public IntNumber(int num) {
		this.num = num;
	}

	public boolean myEquls(IntNumber numObj) {
		if (this.num == numObj.num) {
			return true;
		} else {
			return false;
		}
	}
}

public class E04Object2MyEquals {

	public static void main(String[] args) {
		String str1 = new String("Java개발자");
		String str2 = "Java개발자";
		if (str1.equals(str2)) {
			System.out.println("같은 문자열 입니다");
		} else {
			System.out.println("다른 문자열 입니다.");
		}
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(10);
		IntNumber num3 = new IntNumber(10);

		if (num1.equals(num2)) {
			System.out.println("1과 2는 동일한 정수 ");
		} else {
			System.out.println("1과 2는 다른정수 ");
		}
		if (num1.myEquls(num3)) {
			System.out.println("1과 3은 동일한 정수 ");
		}
		else {
			System.out.println("1과 3은 다른정수 ");
		}

	}

}

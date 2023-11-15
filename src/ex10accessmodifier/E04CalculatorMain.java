package ex10accessmodifier;

import ex10accessmodifier.cal.Calculator;

public class E04CalculatorMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();  // 생성자 생성 import
		
		System.out.println("10+20="+ cal.addTwoNumber(10, 20));   // 30  cnt 1
		System.out.println("55+98="+ cal.addTwoNumber(55, 98));
		System.out.println("100-77="+ cal.subTwoNumber(100, 77));
		
		cal.showOpratingTimes();    // private  선언된 cnt변수 자제는 패키지(폴더)가 다르기때문에 직접호출이 불가능하지만
	}
}

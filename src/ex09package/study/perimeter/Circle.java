package ex09package.study.perimeter;

public class Circle
{
	double rad;
	final double PI;
	
	
	
	// 생성자 멤버변수를 초기화 한다.
	public Circle(double rad) {
		this.rad = rad;
		PI = 3.14159;  //생성자 안에서 상수를 변경할수 있다.
	}
	public double getPerimeter() {
		return 2 * PI * rad;
	}
}

package ex13interface.figure;

public class Circle implements IFigure, IDrawable {
	// 반지름 변수
	int radius;

	// 생성자 생성    서클에 맞게 오버라이딩 하면된다. 
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw(String figureName) {
		System.out.println(figureName + "을 그립니다.");
	}

	@Override
	public void area(String figureName) {
		System.out.println(figureName + "의 면적(r*r*PI):" + radius * radius * Math.PI);

	}
}

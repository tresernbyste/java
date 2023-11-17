package ex13interface.figure;

public class Triangle extends FigureData implements IDrawable, IFigure {

	public Triangle(int width, int height) {
		super(width, height);

	}

	@Override
	public void draw(String figureName) {
		System.out.println(figureName + "을 그려봅니다.");
	}

	@Override
	public void area(String figureName) {
		System.out.println(figureName + "의 면적(밑변*높이*0.5):" + (width * height * 0.5));

	}
}

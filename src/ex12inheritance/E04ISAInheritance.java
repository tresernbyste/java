package ex12inheritance;

class Computer
{

	String owner;

	// public Computer(){}
	public Computer(String name)
	{
		owner = name;
	}

	private void keyboardTouch()
	{
		System.out.println("키보드를 통해서 입력한");
	}

	private void calculate()
	{
		System.out.println("요청된 내용을 계산한다.");
	}

	public void calculateFunc()
	{ // public에 캡슐화 후 간접호출
		keyboardTouch();
		calculate();
	}
}

class NotebookComputer extends Computer
{

	int battary;

	public NotebookComputer(String name, int initCharge)
	{
		super(name);
		battary = initCharge;
	}

	public void charging()
	{
		battary += 5;
	}

	public void movigCal()
	{
		if (battary < 1)
		{
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}
		System.out.print("이동하면서");
//		keybordTouch();     private 직접호출 불가능 
//		calculate();
		calculateFunc(); // 간접호출 method 만들어 호출

		battary -= 1;
	}
}

class TabletNotebook extends NotebookComputer
{

	String registPencil;

	public TabletNotebook(String name, int initCharge, String pen)
	{
		super(name, initCharge);
		registPencil = pen;
	}

	public void write(String penInfo)
	{
		if (battary < 1)
		{
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}
		if (registPencil.compareTo(penInfo) != 0)
		{
			System.out.println("등록된 펜이 아닙니다.");
			return;
		}
		movigCal();
		System.out.println("스크린에 펜으로 그림을 그린다.");
		battary -= 1;
	}
}

public class E04ISAInheritance
{
	public static void main(String[] args)
	{

		NotebookComputer noteBook = new NotebookComputer("공유", 5); //객체를 만듬과 동시에 초기화 가능 --- 이 경우 디폴트 생성자는 없어야한다 
																	// why? 뒤에 인자가 들어간 생성자를 불러오기위한 부모의 인자생성자는 개발자가 만들어놔야하기때문이다.
		TabletNotebook tablet = new TabletNotebook("이동욱", 5, "ISE-1234");

		System.out.println("==노트북컴퓨터사용==");
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();

		System.out.println("==ISE-1234 펜으로 테블릿사용==");
		tablet.write("ISE-1234");

		System.out.println("==XYX 9876 펜으로 테블릿사용==");
		tablet.write("XYZ-9876");

	}

}

// 지금 내가 필요한것은 스피커의 볼륨 크기를 세팅하고 베이스의 볼륨크기도 세팅해서 크기 조절할수 있게 만드는 거를 
//  상속 클래스에 override 를 이용해서 만들고 싶다.


package ex12inheritance;

class Speaker{                                // 일단 기본이 되는 클래스 스피커를 만들어주고
	private int volumnRate;					  // 스피커의 볼륨 크기가 될 변수를 선언;		
	public void setVolumn(int vol) {		  // 받아올 볼륨크기를 멤버변수에 넣어준다.
		volumnRate =vol;					
	}
	public void showState() {				  // 디버깅용 스피커 현재상태를 호출, 퍼블릭 클래스에서 private 멤버변수를 간접호출하기위한 코드 
		System.out.println("스피커의 볼륨크기:" + volumnRate);
	}
}
class BaseSpeaker extends Speaker{			// 추가로 스피커 볼륨과 같이 출력됐으면 하는 클래스 베이스를 만들어 준다,.
	private int baseRate =10;					// 동일하게 베이스볼륨크기가될 변수를 선언;
	public void setBase(int bas) {			// 베이스의 볼륨크기를 받아올 세팅값으로 받아온 int 값을 멤버변수 baseRate에 넣어준다.
		baseRate = bas;
	}
	@Override						
	public void showState() {				// 클래스스피커와 동일한 메서드명으로 오버라이드를 진행 	
		super.showState();					// super.부모와동일한메서드명 --- 이 코드는 기능의 추가 일때 사용한다.  
		System.out.println("베이스의 볼륨크기:" +  baseRate);  //  추가될 기능
	}
}

public class E06Overriding
{
	public static void main(String[] args)
	{													// 자식객체를 생성한 이유는 --- 상속받은 부모으 멤버와 메서드를 모두 사용할수 있기때문에 
		BaseSpeaker baseSpeaker = new BaseSpeaker();    //  먼저 BaseSpeaker class 안에 baseSpeaker 라는 새로운 참조변수를 설정한다.! 선언! 
		baseSpeaker.setVolumn(10);						//  BaseSpeaker class 안에 setVolumn(10)을 실행 스피커볼륨 매게변수에 10을 넣어주고  ## 상속 받았기 때문에 부모의 메서드를 들어갈수있는것.
		baseSpeaker.setBase(40);
		baseSpeaker.showState();						
		
		System.out.println();
		
		//  부모클래스의 참조변수로 자식클래스의 객체를 참조할 수있다.
		//
		
		Speaker speaker = new BaseSpeaker();    //  부모클래스의 참조변수로 자식클래스의 객체를 참조할 수있다.
		speaker.setVolumn(30);
//		speaker.setBase(40);
		speaker.showState();						//  showState() 는 상속 관계에서 오버라이딩한 메서드이다. 
													//  부모로 자식을 참조했을때 접근범위는 부모객체로 제한되지만 오버라이딩한 메서드가 있으면 항상 자식쪽이 호출된다.
													//  오버라이딩된 메서드라면 부모 메서드로 호출이 된다고해도 오버라이딩된 메서드가 호출된다. 단, 자식쪽 멤버변수는 수정이나 추가가 불가능하다!
		
	}

}

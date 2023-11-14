package ex08class;
//시나리오
//다음에 주어진 조건으로 '사람'을 추상화 하시오
//-속성 : 이름,나이,에너지
//-행동 : 걷는다, 생각한다, 먹는다, 현재상태표현 
//-행동의조건
//	먹으면 에너지가 2 증가
//	걸으면 에너지가 1 감소 
//	생각하면 에너지가 2 감소 
//	단, 에너지의 최대/최소 범위는 0~10으로 한다.
//	무한히 먹을수 없고, 에너지는 마이너스가 될 수 없기 때문.

// 객체를 만들기위한 준비 클래스  객체화 전############

public class Human // 파일하나당 퍼블릭 선언가능 안정적
{				// 캐릭터 생성 -- 인스턴스화
	String name; 
	int age;		// 연산이 필요하지 않는다면 String 으로 해도 무방 
	int energy;		// 게임에서의 에너지나 레벨과 같이 연산이 필요한부분은 int 로 표현한다.
	
	
	void walking() {
		energy--;
		if(energy<0) {
			energy = 0;
			System.out.println("[walk]에너지는 0이 최소입니다.");
			System.out.println("0으로 고정됩니다.");
		}
		else {
			System.out.println("[walk]에너지가 1 감소하였습니다.");
		}
	}
	void thinking() {
		energy -= 2;
		if(energy<0) {
			energy = 0;
			System.out.println("[thinking]에너지는 0이 최소입니다.");
		}
		else {
			System.out.println("[thinking]에너지가 2 감소하였습니다.");
			
		}
	}
	void eating() {
		energy += 2;
		if(energy>10) {
			energy = 10;
			System.out.println("[eat]에너지는 10이 최대치입니다.");
		}
		else {
			System.out.println("[eat]에너지가 2 증가하였습니다.");
			
		}
	}
	void showState() {
		System.out.println("===님의 현재상태는===");
		System.out.println("이름:"+ name);
		System.out.println("나이:"+ age);
		System.out.println("에너지:"+ energy);
		System.out.println("=====================");
	}

// 멤버 변수와 멤버 메소드   class Human



}

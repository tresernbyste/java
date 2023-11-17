package ex14innerclass;

class Unit{
	private String name;
	private int healthPoint;
	
	Marine marine;
	Medic medic;
	

	public Unit(String name, int healthPoint) {
	
		this.name = name;
		this.healthPoint = healthPoint;
		marine =  new Marine();   // 외부에서 내부 클래스 객체를 생성해줘야한다  메인에서 외부를 통하지않으면 내부클래스 객체 생성을 할수없다.
	}
	
	public String infoStr() {
		return "유닛정보[이름:"+name+",체력:"+healthPoint+"]";
	}
	
	// 내부 멤버 클래스 
	class Marine{
		int attackPower;
		public void attack() {
			System.out.println(infoStr()+ "\n마린이공격한다.");
		}
	}
	
	class Medic{
		int healPower;
		public void heal() {
			System.out.println(infoStr()+"\n메딕이치료한다.");
			
		}
	}
}

public class E01InnerClassMain {

	public static void main(String[] args) {
		
		// 외부클래스 객체 먼저 생성한다.
		Unit unit = new Unit("커멘드센터", 1000);
		System.out.println(unit.infoStr());
		
		
//		Marine m = new Marine();  // 내부 클래스는 외부클래스를 통하지 않으면 볼수 없다 .  
									//  이렇게 하면 다른 진짜 외부 마린을 찾거나  오류에러 ㅇㅇ
		
		
		Unit.Marine marine = new Unit("마린", 50).marine;   //Unit
		marine.attack();
		
		Unit.Medic medic = new Unit("메딕", 30).new Medic();
		medic.heal();
	}

}

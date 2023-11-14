package ex08class;

class Car{    // 여러가지 자동차 캐릭터를 만듬
	String carModel;
	Human owner;
	
	void initialize() {   
//		 초기화메서드 1 매개변수가 없는 형태로 항상 고정된 갑으로만 객체를 초기화할수있다. 따라서 확장성이 없는 형태의 메서드이다.
		carModel = "람보르기니";
		owner = new Human();                //######################
		owner.name = "스티브로져스";
		owner.age = 30;
		owner.energy = 10;
	}
//	초기화 메서드 2  위와 동일한 이름의 메서드로 오버로딩에 의해 정의한다. 초기화를 진행하는 역할은 동일하나, 매개변수를 통해 다양한 값으로 초기화 할수있다.
//	다른 객체가 멤버변수로 정의되었으므로, 객체를 생성한 후 각각의 멤버변수를 초기화 해야한다.
	
	void initialize(String model, int year, String name, int age, int energy) {
		carModel = model;
		owner = new Human();   //Class Human 에 저장하겠다.
		owner.name = name;
		owner.age = age;
		owner.energy = energy;
	}
	void showCarInfo() {
		System.out.println("[차량정보]");
		System.out.printf("모델명:%s\n", carModel);
		owner.showState();		// Class Human 에 저장했기 때문에  Human 안에 변수를 가져와서 사용할수 있는것이다.
		
	}
}	// end of Car Class







public class E03CarMain
{
public static void main(String[] args)  // 캐릭터 생성완료 Car4는 못만듬
{
	
//	자동객체 생성
	Car car1 = new Car();
	car1.initialize();
	car1.showCarInfo();
	
//	가능은하나 매게변수를 모두 직접 이렇게 설정해서 쓴다는것은 가능은 하나 
//	효율적인 코드는 아니다! 실무에서는 이렇게 사용x   
	
//	게임이라고 생각한다면 모든걸 직접 설정한다는것.
	Car car2 = new Car();
	car2.carModel = "밴틀리";
	car2.owner = new Human();
	car2.owner.name = "토니스타크";
	car2.owner.age = 52;
	car2.owner.energy = 8;
	car2.showCarInfo();
	
	
//	자동차객체3 생성 : 매게변수가 있는 초기화 메서드를 사용하여 객체를 생성.
//	이 경우 매개변수를 통해 다양한 값을 전달할수 있으므로 여러형태의 객체를 생성할 수 있다는 장점이 있다.
//	따라서 해당 파일에서는 가장 효율적인 코드라 할수있다.
	
	Car car3 = new Car();
	car3.initialize("스포츠카", 2012, "성유겸", 8, 10);
	car3.showCarInfo();
	
	
//	해당 객체는 객체를 생성만하고 초기화(데이터) 하지않은상태로 출력을 시도하므로 예외 발생 
//	생성된 객체에 데이터를 넣지 못한상황이기때문에 예외발생!###########################################
	Car car4 = new Car();
	car4.showCarInfo();
}
}

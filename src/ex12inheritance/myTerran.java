package ex12inheritance;

class Unit
{
	String name;
	int hp;

	void doMove()
	{
		System.out.println("이동속도 10으로 이동");
	}
}

class Marine extends Unit
{
	int attack;

	void doMove()
	{
		super.doMove();                    // ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★    super.추가 원하는 메서드가 있을때 사용한다.
		
		System.out.println(attack + "공격");
	}
}

class Medic extends Unit
{
	int heal;

	void doMove()
	{									//   super.추가 원하는 메서드 를 사용하지 않으면  수정이된다,
		System.out.println(heal); //  기능수정  override 기능수정 ★★★★★
		System.out.println(heal + "치유");
	}
}

public class myTerran
{

	public static void main(String[] args)
	{
		Marine unit1 = new Marine();
		unit1.name = "마린";
		unit1.hp = 100;
		unit1.attack = 20;
		
		Medic unit2 = new Medic();
		unit2.name = "메딕";
		unit2.hp = 120;
		unit2.heal = 10;
		
		unit1.doMove();
		System.out.println();
		unit2.doMove();
	}

}

package ex08class;

public class E02HumanMain
{

	public static void main(String[] args)
	{
		
		Humanclss human = new Humanclss();  // 객체화 완료  -- 기본default 캐릭터 - 힙영역에 공간만생김
		
		human.name ="마이클";		// 객체 를 초기화 하는과정
		human.age = 28;				// 기본설정.
		human.energy = 4;			// 완전한 객체!
		
		
		human.showState();
		human.eating();
		human.walking();
		human.thinking();
		
		
		for(int i = 1; i<=20; i++) {
			human.walking();
		}
		for(int i = 1; i<=20; i++) {
			human.eating();
		}
		
		human.showState();
		
	}

}

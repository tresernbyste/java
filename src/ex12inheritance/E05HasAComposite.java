//   hasA  상속받지 않았지만 마치 상속처럼 사용?
//   총이 있어야 총알을 살수 있는 관계  총알이 없다는것은 총도 없다는 의미로 해석할때  hasA 관계 성립 될수 있다.
//  a가 b를 소유하다 

//  Has-A 와같이 소유의 관계를 상속으로 표현하면 클래스간의 강한 연결고리가 형성되어 권총이 없는 경찰을 표현하기가 
//  힘들어집니다.
//  Gun gun; 과 같이 class의 선언을 통해서 상속하지않고 

package ex12inheritance;

class Gun{
	int bullet;
	
	// 디폴트 생성자가 아닌 인자생성자를 만듬
	public Gun(int bNum) {
		bullet = bNum;
	}
	public void shutGun(){
		System.out.println("빵야~~!");
		bullet--;
		
	}
}

class Police {
	int handCuffs;
	Gun gun;   								// 권총을 표현하기 위한 객체형 멤버변수
	
	public Police(int bNum, int hCuff) {
		handCuffs = hCuff;
		if(bNum<=0) {
			gun = null;
		}
		else {
			gun = new Gun(bNum);
		}
	}
	public void putHandcuff() {
		System.out.println("수갑채움~! 넌콩밥~!");
		handCuffs--;
	}

	public void shut() {
		if(gun==null) {
			System.out.println("보유한 권총없음. 헛빵~!");
		}
		else {
			gun.shutGun();
		}
	}
	
}


public class E05HasAComposite
{
public static void main(String[] args)
{
	System.out.println("==경찰1==");
	Police police1 = new Police(5, 3);
	police1.shut();
	police1.putHandcuff();
	
	System.out.println("==경찰2==");
	Police police2 = new Police(0, 3);
	police2.shut();
	police2.putHandcuff();
	
}
}




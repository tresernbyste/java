package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

abstract class Friend {
	String name;
	String phone;
	String addr;

	public Friend(String name, String phone, String addr) {
		this.name = name; /// VO
		this.phone = phone;
		this.addr = addr;
	}

	public void showAllData() // 디버깅용 오버라이딩
	{
		System.out.println("이름:" + name);
		System.out.println("전화번호:" + phone);
		System.out.println("주소:" + addr);
	}

	abstract public void showBasicInfo(); // 추상메서드 ; // 오버라이딩을 목적으로 실행부가없는 추상메서드!

	{
	}
}

//	고등학교친구정보를 저장할 클래스!!
class HighFriend extends Friend {
	String nickname;

	public HighFriend(String name, String phone, String addr, String nickname) // 이름같아 생성자!
	{
		super(name, phone, addr); // 상속받은 내용 상속받아올거고!
		this.nickname = nickname; // sub에서 하나 추가할 내용!
	}

	@Override
	public void showAllData() // 디버깅용인데? 디버깅용을 오버라이딩해서 친구정보와 고등학교친구정보를 한번에! 오버라이딩의 장점이다.
	{
		System.out.println("==고딩친구(전체정보)===");
		super.showAllData();
		System.out.println("별명:" + nickname);
	}

	@Override
	public void showBasicInfo() // 부모클래스에 있는 추상메서드를 상속했으므로 반드시 오버라이딩해야한다
	{
		System.out.println("===고딩친구==");
		System.out.println("별명:" + nickname);
		System.out.println("전번:" + phone);
	}
}

class UnivFriend extends Friend {
	String major;

	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}

	@Override
	public void showAllData() // 기본정보확인을 위한
	{
		System.out.println("==대딩친구(전체정보)==");
		super.showAllData();
		System.out.println("전공:" + major);
	}

	@Override
	public void showBasicInfo() // 부모friend 에서 추상메서드 이기때문에 필수 오버라이딩 사항이다.
	{
		System.out.println("==대딩친구==");
		System.out.println("이름:" + name);
		System.out.println("전화번호 : " + phone);
	}
}

class FriendInfoHandler1 {
	// 멤버변수
	// 기존 객체 배열에 저장하던 방식을 List 컬렉션으로 변경합니다.
	// 우리는 배열과 동일한 특성을 가지고 있는 ArrayList<E>로 객체를 생성합니다.
	// 해당 컬렉션에는 Friend 타입의 객체를 저장할 것이므로 상속관계가 있는 하위객체는 모두 저장할수있다.
	// 또한 List컬렉션은 index가 존재하긴하나 자동 인덱싱은 지원하므로 인덱스 저장을 위한 변수는 필요하지않습니다.

//	private Friend[] lists;
//	private int numOfFriends;
	private ArrayList<Friend> lists;

	// 생성자: List컬렉션을 초기화 한다.

	public FriendInfoHandler1() {
		lists = new ArrayList<Friend>();
	}

	public void addFriend(int choice) {

		Scanner scan = new Scanner(System.in);
		String iName, iPhone, iAddr, iNickname, iMajor;
		System.out.println("이름:");
		iName = scan.nextLine();
		System.out.println("전화번호:");
		iPhone = scan.nextLine();
		System.out.println("주소:");
		iAddr = scan.nextLine();

		if (choice == 1) {
			System.out.println("별명:");
			iNickname = scan.nextLine();
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			lists.add(high);

		} else if (choice == 2) {
			System.out.println("전공:");
			iMajor = scan.nextLine();
			lists.add(new UnivFriend(iName, iPhone, iAddr, iMajor));
		}
		System.out.println("친구정도 입력이 완료되었습니다.");

	}

	// 일반 for문을 통해 접근할때 인덱스를 이용합니다.
	// 인덱스를 통한 접근을 할때는 get()메서드를 사용하면 된다.
	public void showAllData() {
		for (int i = 0; i < lists.size(); i++) {
			lists.get(i).showAllData();

		}
		System.out.println("==전체정보가 출력되었습니다.");
	}

	// 확장된 for문을 통해 접근할때는 인덱스가 필요하지 않다
	// 단순히 컬렉션에 저장된 객체의 갯수만큼 자동으로 반복하게 됩니다.
	// fri 이라는 참조변수에 0번 인덱스의 객체부터 마지막까지 객체가 대입되게 됩니다.

	public void showSimpleData() {
		for (Friend fr : lists) {
			fr.showBasicInfo();

		}
		System.out.println("==간략정보가 출력되었습니다.");
	}

	public void searchInfo() {
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요:");
		String searchName = scan.nextLine();

		// 이터레이터를 토한 검색기능 구현
		// 1. 컬렉션을 통해 이터레이터 객체를 생성한다.
		Iterator<Friend> itr = lists.iterator();

		// 2. 원소(객체)가 있는지 확인한다.

		while (itr.hasNext()) {
			// 3. 있다면 next()통해 객체의 참조값을 추출한다.
			// 하지만 next()를 두번 호출하면 그 다음 객체로 넘어간다.
			// 넘어간후 버리게 되므로 while루프내에서 한번만 호출해야 정상적으로 출력됩니다.

			Friend fr = itr.next();
			if (searchName.compareTo(fr.name) == 0) {
				fr.showAllData();
				System.out.print("귀하가 요청하는 정보를 찾았습니다.");
				isFind = true;
			}
		}
		if (isFind == false)
			System.out.println("***찾는 정보가 없습니다.***");

	}

	public void deleteInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 이름을 입력하세요:");
		String deleteName = scan.nextLine();

		boolean isDelete = false;

		for (Friend fr : lists) {
			if (deleteName.compareTo(fr.name) == 0) {
				// 해당 반복회차에 추출된 객체의 참조값을 통해 삭제한다.
				lists.remove(fr);
				System.out.println("### 정보가 삭제되었습니다. ###");

				break;

			}
		}

		if (isDelete == false) {
			System.out.println("==삭제된 데이터가 없습니다==");

		} else {
			System.out.println("==삭제할=== 데이터가 없습니다==");

		} // end of delete

	}
}

	public class Ex07MyFriendInfoBook {
		public static void menuShow() {
			System.out.println("##########메뉴를 입력하세요 #############");
			System.out.print("1.고딩친구입력 ");
			System.out.println("2.대딩친구입력 ");
			System.out.print("3.전체정보출력 ");
			System.out.println("4.간단정보출력 ");
			System.out.println("5.검색");
			System.out.println("6.삭제");
			System.out.println("7.프로그램종료");
			System.out.println("메뉴선택>>>>>>");
		}

		public static void main(String[] args) {
			System.out.println("33");
			Scanner scanner = new Scanner(System.in);
			FriendInfoHandler1 handler = new FriendInfoHandler1(); // heap 영역에 빈 주소 100개 생성

			while (true) {
				menuShow();

				int choice = scanner.nextInt();

				switch (choice) {
				case 1:
				case 2:
					handler.addFriend(choice);
					break;
				case 3:
					handler.showAllData();
					break;
				case 4:
					handler.showSimpleData();
					break;
				case 5:
					handler.searchInfo();
					break;
				case 6:
					handler.deleteInfo();
					break;
				case 7:
					System.out.println("프로그램종료");
					return;
				}

			}
		}
	}


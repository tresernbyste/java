/*
 연습문제1] 친구정보를 파일로 직렬화 하기 위한 메서드를 정의하시오.
 
 	현재 친구의 정보를 List 컬렉션에 저장되고 있다. 프로그램을 종료할때
 	저장된 모든 친구의 정보를 파일로 저장할 수 있는 메서드를 정의하시오.
 	파일명 : myfriend_info.obj
 	메서드명 : saveFriendInfo()
 	본래는 프로그램 종료시 heap영역에 있던 모든 정보가 사라졌음. 
 	그걸 파일로 저장해 놓는다면 불러올수 있다. ## 추가 저장 입출력 이 가능해진다 #####데이터 베이스 배우기 이전 과정들
 	※ 해당 메서드는 FriendInfoHandler 클래스에 추가하면 된다.
 	
 연습문제2] 프로그램을 다시 시작하면 문제1에서 직렬화 했던 파일을
 	역질렬화해서 복원하시오. 만약 3명의 정보가 저장되었다면 다시 
 	시작한 직후 정보출력을 하면 3명의 정보가 출력되어야 한다.
 	메서드명 : readFriendInfo()
 	※ 해당 메서드는 FriendInfoHandler 클래스에 추가하면 된다.
 */

package ex20io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Handler;

abstract class Friend implements Serializable {
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

	abstract public void showBasicInfo();

}

class HighFriend extends Friend {
	String nickname;

	public HighFriend(String name, String phone, String addr, String nickname) {
		super(name, phone, addr);
		this.nickname = nickname;
	}

	@Override
	public void showAllData() {
		System.out.println("==고딩친구(전체정보)===");
		super.showAllData();
		System.out.println("별명:" + nickname);
	}

	@Override
	public void showBasicInfo() {
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
	public void showAllData() {
		System.out.println("==대딩친구(전체정보)==");
		super.showAllData();
		System.out.println("전공:" + major);
	}

	@Override
	public void showBasicInfo() {
		System.out.println("==대딩친구==");
		System.out.println("이름:" + name);
		System.out.println("전화번호 : " + phone);
	}
}

class FriendInfoHandler1 {

	private ArrayList<Friend> myFriends;

	public FriendInfoHandler1() {
		myFriends = new ArrayList<Friend>();
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
			myFriends.add(high);

		} else if (choice == 2) {
			System.out.println("전공:");
			iMajor = scan.nextLine();
			myFriends.add(new UnivFriend(iName, iPhone, iAddr, iMajor));
		}
		System.out.println("친구정도 입력이 완료되었습니다.");

	}

	public void showAllData() {
		for (int i = 0; i < myFriends.size(); i++) {
			myFriends.get(i).showAllData();

		}
		System.out.println("==전체정보가 출력되었습니다.");
	}

	public void showSimpleData() {
		for (Friend fr : myFriends) {
			fr.showBasicInfo();

		}
		System.out.println("==간략정보가 출력되었습니다.");
	}

	public void searchInfo() {
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요:");
		String searchName = scan.nextLine();

		Iterator<Friend> itr = myFriends.iterator();

		while (itr.hasNext()) {

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
		for (Friend fr : myFriends) {
			if (deleteName.compareTo(fr.name) == 0) {
				myFriends.remove(fr);
				System.out.println("### 정보가 삭제되었습니다. ###");
				break;
			}
		}
		if (isDelete == false) {
			System.out.println("==삭제된 데이터가 없습니다==");
		} else {
			System.out.println("==삭제할=== 데이터가 없습니다==");
		}
	}

	// 프로그램 종료시 친구의 정보를 직렬화 (저장)
	public void saveFriendInfo() {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/ex20io/myfriend_info.obj"));
			// List<> 컬렉션에 저장된 친구 갯수 만큼 반복하여 출력하기위해
			// 향상된 for문으로
			for (Friend fr : myFriends) {
				// 파일을 저장--- 직렬화
				out.writeObject(fr);
			}
		} catch (Exception e) {
			System.out.println("친구정보 직렬화중 예외 발생");
		}

	}

	public void readFriendInfo() {

		try {
			// 파일을 복원 -- 역직렬화
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/ex20io/myfriend_info.obj"));
			// 파일에 친구의 정보가 몇개 저장되었느지 확인할 수 없으므로 무한루프 구현한다.
			while (true) {

				// 직렬화 될때 오브젝트 기반으로 저장되므로 역직렬화 할대는 반드시 다운 캐스팅 해야한다.

				Friend fr = (Friend) in.readObject();
				myFriends.add(fr);
				// 만약 더이상 복원할 객체가 없다면 예외가 발생한다.
			}

		} catch (Exception e) {
			
			// 예외가 발생하면 catch절로 예외 객체가 던져지므로 while무한루프를 탈출 할수 있습니다.
//			System.out.println("더이상 복원할 객체가 없습니다.");
//			
//			e.printStackTrace()
			// 프로그램이 종료되는 시점에 컬렉션에 저장된 객체를 파일형태로 저장 즉, 직렬화 해야합니다.
			// 핸들러 클래스에 정의된 메서드를 호출합니다. 종료하기전에 호출 
			
			
		}
		System.out.println("친구의 정보가 복원되었습니다.");

	}
}


public class E12MyFriendSerializable {
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
		Scanner scanner = new Scanner(System.in);
		FriendInfoHandler1 handler = new FriendInfoHandler1();
		
		// 프로그램 시작시 직렬화된 파일이 있다면 즉시 복원하여 컬력션에 저장합니다.  처음 시작하기전에 
		
		handler.readFriendInfo();
		
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

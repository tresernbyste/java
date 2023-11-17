package ex12inheritance;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

class Friend
{
	String name;
	String phone;
	String addr;

	public Friend(String name, String phone, String addr)
	{
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

	public void showBasicInfo() // 오버라이딩을 목적으로 실행부가없는 추상메서드!
	{
	}
}

//	고등학교친구정보를 저장할 클래스!!
class HighFriend extends Friend
{
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
	public void showBasicInfo() // 고딩친구같은 경우는 별명ㅇ과 전번만 있으면 되서 이정도로 수정
	{
		System.out.println("===고딩친구==");
		System.out.println("별명:" + nickname);
		System.out.println("전번:" + phone);
	}
}

class UnivFriend extends Friend
{
	String major;

	public UnivFriend(String name, String phone, String addr, String major)
	{
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
	public void showBasicInfo() // 간단한 기본정보를 알기위해 이름과 전화번호만 오버라이딩으로 불러온다.
	{
		System.out.println("==대딩친구==");
		System.out.println("이름:" + name);
		System.out.println("전화번호 : " + phone);
	}
}

public class E10MyFriendInfoBook
{
	public static void menuShow()
	{
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

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		FriendInfoHandler handler = new FriendInfoHandler(100);   // heap 영역에 빈 주소 100개 생성 

		while (true)
		{
			menuShow();

			int choice = scanner.nextInt();

			switch (choice)
			{
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

class FriendInfoHandler
{

	private Friend[] myFriends;    // 100개의 주소를 배열로 받는데 부모
	private int numOfFriends;

	public FriendInfoHandler(int num)
	{

		myFriends = new Friend[num];   // 100배열 초기화 
		numOfFriends = 0;
	}

	public void addFriend(int choice)
	{

		Scanner scan = new Scanner(System.in);
		String iName, iPhone, iAddr, iNickname, iMajor;
		System.out.println("이름:");
		iName = scan.nextLine();
		System.out.println("전화번호:");
		iPhone = scan.nextLine();
		System.out.println("주소:");
		iAddr = scan.nextLine();

		if (choice == 1)
		{
			System.out.println("별명:");
			iNickname = scan.nextLine();
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			myFriends[numOfFriends++] = high;

		} else if (choice == 2)
		{
			System.out.println("전공:");
			iMajor = scan.nextLine();
			myFriends[numOfFriends++] = new UnivFriend(iName, iPhone, iAddr, iMajor);
		}
		System.out.println("친구정도 입력이 완료되었습니다.");
	}

	public void showAllData()
	{
		for (int i = 0; i < numOfFriends; i++)
		{
			myFriends[i].showAllData();
		}
		System.out.println("==전체정보가 출력되었습니다.");
	}

	public void showSimpleData()
	{
		for (int i = 0; i < numOfFriends; i++)
		{
			myFriends[i].showBasicInfo();
		}
		System.out.println("==간략정보가 출력되었습니다.");
	}

	public void searchInfo()
	{
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요:");
		String searchName = scan.nextLine();

		for (int i = 0; i < numOfFriends; i++)      // numOfFriends.length 를 사용할 필요가 없음  sum 처럼 저장되어있는값에 추가되게 만들어서    정보저장된 만큼만 search 할수 있게 효율적으로 만든다,.
			
		{
			if (searchName.compareTo(myFriends[i].name) == 0)
			{
				myFriends[i].showAllData();
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
			int deleteIndex = -1;					//  1 2 3 4 5   3번저장된 친구를 삭제 하고 싶다. 1245    45를 당겨서 저장하고싶다?
			 
			for(int i =0; i<numOfFriends; i++) {
				if(deleteName.compareTo(myFriends[i].name)==0) {
					myFriends[i] = null;             // 2 = null
					deleteIndex = i;				// deleteIndex  2
					numOfFriends--;					// numoffriends  4  i=2  i<4 i++  my2
					break;
				}
			}
			
			if(deleteIndex == -1) {
				System.out.println("==삭제된 데이터가 없습니다==");
				
			}else {
				for(int i=deleteIndex; i<numOfFriends; i++) {   // 1 2 3 4 5  3번친구 삭제 후에 4번 5번 친구를  3번 4번으로 복사이동 하는 방법!!!
					myFriends[i] = myFriends[i+1];
				}
				System.out.println("==데이터("+ deleteIndex+"번)가 삭제되었습니다.");
			}
		}
	

}
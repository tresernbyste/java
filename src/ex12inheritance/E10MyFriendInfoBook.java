package ex12inheritance;

import java.util.Scanner;

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
		FriendInfoHandler handler = new FriendInfoHandler(100);
		
		while(true) {
			menuShow();
			
			int choice = scanner.nextInt();
			switch(choice) {
			case 1: case 2:
				handler.addFriends(choice);
				break;
			case 3:
				handler.showAllData();
			case 4:
				handler.showSimpleData();
			case 5:
				handler.searchInfo();
			case 6:
				handler.deleteInfo();
			case 7:
				System.out.println("프로그램종료");
				return;
			}
			
		}
	}

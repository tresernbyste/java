//코드가 짦으면 실행구문이 적어지고 
//실행구문이 적어진다는것은 실행 속도에 차이가 있다는 것이다. 
//실행 0.001초가 줄어든다는것은 이용자가 많을경우 엄청 큰 메리트.
//
//메서드 영역  프로그램 실행코드 
//                     static 영역
//                     상수풀
//
//스택영역   다 사용하면 사라짐.
//                   지역변수 
//                   매개변수 
//                   이곳에 주소값이 들어가고 
//                   주소가 같은값
//
//힙영역         이곳에 주소의 참조값이 들어간
//                    각각의 객체 
//                   '값'이 같은 객체
//                    ( 주소는 있지만 공간에 값이 없으면 null ) 
//
//
//
//복합대입연산자 == 코드가 줄어들어. 
//                                자동형변환이 일어남 
//                               코드반응속도 올라감 
//
//flutter 같은경우 if를 써야하는경우 
//삼항연산자를 이용하는 경우가 많음.
//
//조건식 ? 참 일때 문장 | 거짓일때 문장
//
//Array 배열 
//int[] num = new int[5]
//
//new =  힙영역에 방이 생기고 스택영역에 주소값 참조값이 생긴다.
//
//
//참조타입변수 = 스택영역에는 주소값저장
//                            주소값에 저장된 객체(값)은 힙영역에 저장되어있음.
//
//주소값에 저장된 값을 스택으로 불러들임
//
//기본 타입변수는 스택영역에 직접 저장 
//
//기본형 타입 (primitive type) 
//논리형 문자형 정수형 실수형 
//boolean  논리형
//char 문자형
//byte short int long 정수형 
//float double 실수형 
//
//기본형을 제외한 모든 타입은
//참조형 타입 (reference type)
//
//
//String basic
//
//String str = "String Instance"
//               == {S,t,r,i,n,g, ,I,n,s,t,a,n,c,e}
//String str = "String Instance"
//
//
//String Method 중요. 필기암기 필요할듯함.
//
//생성자 constructor  
//
//생성자는 클래스명과 동일 
//주로 멤버변수 초기화에 사용 
//
//리턴값이 없다. (리턴값이 없다면 void가 있어야된다??)
//생성자는 리턴값이 없지만 void또한 존재하지않음 
//
//
//접근지정자 정보은닉 캡슐화 (보안때문) 
//public -------- private 
//
//private  클래스 내에서만 접근가능 (폴더) 
//public  어디서든 접근가능 
//
//just class  -----   default
//동일패키지가 아니기때문에 public 직접 입력
//deault 사용하는이유 
//
//protected 
//상속관계라면 접근가능 
//
//information Hiding --- 정보은닉
//
//class idpass
//{
//private string id
//private string pass
//priave string infomation
//
//
//Encapsulation --- 캡슐화 
//메소드와 변수를 하나의 클래스로 묶는것 
//
//class a
//{
//void b(){}
//void c(){}
//void d(){}
//}
//void take()
//{
//c take();
//b take();
//d take();
//}
//한번에 진행하거나  
//순서대로 진행해야할 프로젝트 or 패키지 라면 캡슐화를 사용해서 진행 
//
//
//정적변수 정적메소드 
//STATIC
//
//static변수
//
//static int n = 0;   ---- 메서드영역에 저장 
//         int n = 0;  ----- 스택영역에 저장 
//
//메서드 영역 안에 값들은 참조값이 없음. 필요도없음. 위치를 정확히 알고 있기 때문
//clas Instcnt
//{
//static int instNum=0;
//public InstCnt()
//{
//instNum++
//println(instNum);
//}
//}
//class ClassVar
//{
//public static void main(String[] args)
//{
//InstCnt cnt1=new InstCnt();
//InstCnt cnt2=new InstCnt();
//InstCnt cnt3=new InstCnt();
//}
//}
//본래는 다른 클래스에 변수 그자체는 불러올수 없다. 
//하지만 static int InstNum은 가져올수 있다.!
//
//메모리 영역만 다를 뿐 변수의 데이터 변화는 같다 .
//
//
//상속 Inheritance   extends
//
//Man class -- 부모
//BusinessMan -- 자식
//
//사용되는 내용자체는 자식 개체가 많음 
//
//하지만 상속  개념 자체는  부모 클래스가 큼 
//
//상속관계에서도 private는 유지하되 
//public을 이용해 간접호출 가능!
//
//클래스 안에 생성자 
//생성자를 메인안에 소환호출
//[sub]안에 부모의 호출은 항상 먼저 
//
//protected 지시자 
//상속관련 가능  --- 이외의 영역이란...?
//
//		
//		상속2 OVERRIDDING   ##중요##
//
//		overoading 은 같은 이름 다른 메서드 
//		상속중 부모메서드 안에 자식메서드와 이름이 같다면 overriding 사용가능 
//		overidding 은 같은 이름 같은 기능(메서드)
//		기능의 추가? 
//		부모메서드에 있는 overriding 내용은 가려지게됨
//
//		@override 생략가능하지만 찾기위함
//
//		상속받은 부모 메서드의 기능 변경 추가 
//
//		
//		class 이름과 같은면 생성자 
//
//		그외 멤버 메서드
//
//		????????????
//
//		디폴트 생성자 생략이 하지않을때 
//
//		추상클래스( Abstract class)
//		추상메서드가 있으면 추상을 상위 클래스에 선언을 해줘야 하지만 생략가능! 
//		인스턴스(객체) 생성을 허용하지 않는 클래스 
//		= new instance();
//
//		오버라이딩을 목적으로한 클래스 
//		public void show(){}
//
//		StarUML  SQL Client  클래스 다이어그램 그리기 
//		ERD -- table list modelling
//
//		like a 추후 코드 보고서형식 
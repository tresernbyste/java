// ###############################################


package ex11static;

class NoSingleTone
{
	int instVar;

	public NoSingleTone() {}
	
}

class SingleTone
{
	int sharVar;
	private static SingleTone single = new SingleTone();  // 

	private SingleTone()
	{

	}

	public static SingleTone getInstance()
	{
		return single;
	}
	void print() {
		System.out.println(String.format("shareVar=%d", sharVar));
	}
}

	public class E03SingleToneDesignPattern{
		
		public static void main(String[] args)
		{
			NoSingleTone nst1 = new NoSingleTone();
			nst1.instVar = 100;
			System.out.println("nst1="+ nst1);
			
			NoSingleTone nst2 = new NoSingleTone();
			nst2.instVar =200;
			System.out.println("nst2="+ nst2);
			
//			SingleTone st1 = new SingleTone();   // private 이기때문에 
			
			SingleTone st2 = SingleTone.getInstance();   //  간접호출 SingleTone클래스 안에 private가 있기때문에 public 을 이용해 간접호출 
			st2.sharVar = 100;
			st2.print();
			
			SingleTone st3 = SingleTone.getInstance();	//  st2 st3 는 private static 이기때문에 
			st3.sharVar = 200;							//	 heap 영역과 다르게 주소가같다........
			st3.print();
			
			System.out.println(String.format("st2의주소:%s", st2));
			System.out.println(String.format("st3의주소:%s", st3));

			System.out.println(String.format("st2의 shareVar:%d", st2.sharVar));
			System.out.println(String.format("st3의 shareVar:%d", st3.sharVar));
			
		}
	}



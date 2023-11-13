package sunex06array;

// 자료형 타입 -- 힙영역에서 주소값을 끌어오기때문에 기본형 타입변수 매개 보다 데이터 저장공간이 적게든다.

public class E04CallByReference
{

	public static void main(String[] args)
	{
		int[] arr = {100, 200};  // 100,200 값이 저장되어있는 주소값을 가져오는것.
		System.out.println("메인메소드-Swap 전 출력");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
		System.out.println();
		
		
		callByReference(arr);
		
		System.out.println("메인메소드-Swap이후 출력");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	static void callByReference(int[]ref) {
		int tmp;
		tmp = ref[0];
		ref[0] = ref[1];
		ref[1] = tmp;
		
		System.out.println("callByReference메소드 - Swap이후 출력");
		for(int i=0; i<ref.length; i++) {
			System.out.println(ref[i]+ " ");
		}
		System.out.println();
	}

}

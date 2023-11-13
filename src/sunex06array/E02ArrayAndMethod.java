package sunex06array;

import java.util.Arrays;

public class E02ArrayAndMethod
{

	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5};
		int[] ref;
		System.out.println("초기화 직후 출력");
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		System.out.println("arr의 주소값:"+ arr);
		
		System.out.println();
		
		
		System.out.println(Arrays.toString(arr)+"arr");
		ref = addAllArray(arr, 7);							//같은 주소값에 (힙영역에서 바뀌어버린 참조값을 그대로 가져오기때문에 
		
		System.out.println("ref의 주소값:"+ ref);
		System.out.println(Arrays.toString(ref)+"ref");   
		
		
		System.out.println("메소드 호출후 출력");
		for(int i=0; i<ref.length; i++) {
			System.out.print(ref[i]+" ");
		}
		
		System.out.println();
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static int[] addAllArray(int[] arr, int addVal) {
		for(int i=0; i<arr.length; i++) {
			arr[i] += addVal;
		} 
		return arr;
	}

}

package sunex06array;

public class E05TwoDimArray01
{

	public static void main(String[] args)
	{
		int[][] arr = {  // 초기화하지 않은 부분은 주소도 존재하지않음. ##방도없음 0도 공백도 없음. only null
				{1,2},
				{3,4,5},
				{6,7,8,9}
		};
		
		int[] arr2 = new int[5];		// 0 0 0 0 0
		arr2[0] = 1; 					// 1 0 0 0 0
		System.out.println("arr2 배열명이 가진 주소값 출력"+ arr2);
		
		System.out.println("배열의 세로크기(행):"+ arr.length);
		System.out.println("배열명이 가진값 출력(arr):"+ arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d행의크기(열):%d\n", i, arr[i].length);
			System.out.printf("%d행 출력:%s\n", i, arr[i]);
		}
		
		System.out.println("배열출력하기");
		System.out.println("arr[0][1]=" + arr[0][1]);
//		System.out.println("arr[0][3]=" + arr[0][3]);
		
		
		for(int i=0; i<1; i++) {
			int []temp;
			temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d행의크기(열):%d\n", i, arr[i].length);
			System.out.printf("%d행 출력:%s\n", i, arr[i]);
		}
	}

}

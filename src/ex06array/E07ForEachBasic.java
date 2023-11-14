//  foreach문  향상된 for 문    단순 디버깅용으로 자주 사용!
//  2차원 배열또한 행부르기 열부르기를 통한 디버깅용 출력이 가능하다!


package ex06array;

public class E07ForEachBasic
{

	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5};
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("기본for문을 이용한 합계:"+ sum);
		
		
		sum = 0;
		for(int e : arr) {
			System.out.print(e + " ");
			sum += e;
		}
		System.out.println("\nforeach문을 이용한 합계:"+ sum);
		
		System.out.println("배열arr의 요소값 1 증가시키기");
		for(int b : arr) {
			b++;
			System.out.print(b + " ");  // 증가시킨 수를 다시 배열에 넣을수 있음  1108전 코드 확인 
		}
		System.out.println();
		System.out.println("배열arr의 요소 재출력하기");
		for(int c : arr) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		System.out.println("2차원 배열을 foreach문으로 출력하기");
		int[][] twoDim = {
				{1,2,3},
				{10,20,30,40},
				{100,200,300,400}
		};
		for(int[] a : twoDim) {  // 2차원 배열에서 한 행씩 가지고옴 ( 단순 값을 int[]a로 가져옴)
			for(int b : a) {	//열 가져오기 
				b++; 
				System.out.print(b + " ");
			}
			System.out.println();
		}
		
		
	}

}

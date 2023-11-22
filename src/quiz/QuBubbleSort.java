//중복되지 않는 난수 10개(1~99)를 생성하여 크기가 10인 배열에 담는다.
//오름차순으로 버블정렬한다.(1, 2, 3 …… 10)
//버블정렬이란 모든 배열요소를 순차적으로 비교하여 스왑(교환)하는 알고리즘이다.
//단, 정렬되는 과정을 모두 출력해야 한다.
//위 그림은 버블정렬을 이용하여 오름차순으로 정렬하는 과정이다.
// 전역변수 형태로 생성하여 모든 메소드에서 접근가능 하도록 선언 

package quiz;

import java.util.Random;
import java.util.Scanner;

public class QuBubbleSort {

	static Random rnd = new Random();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// 중복되지않은 난수를 10개를 생성한다.

		int[] arr = new int[10];

		// 1 난수 생성후 arr배열에 저장하기 위한 메소드 호출

		randomCreate(arr);

		// 2 생성된 난수를 통해 초기화된 배열을 출력합니다. (정렬 전 출력!)

		showArray(arr, "난수 생성 직후 배열출력");

		// 3 정렬의 방법을 선택합니다. 오름차순이나 내림차순으로

		int orderSelect = menuSelect();

		// 4 오름차순 내림차순 ## 버블정렬 알고리즘을 통한

		bubblesort(arr, orderSelect);

		// 5 정렬된 결과를 출력한다.(정렬 후 출력)

		showArray(arr, "버블정렬 이후 배열출력");

	}

	public static void bubblesort(int[] arrParam, int orderSel) {
		// swap 자리 변경을 위한 임시변수를 생성해야한다.
		int temp; 
		int swapCnt = 0;
		// 크기가 10인 배열이므로 스캔은 9번만 반복하면된다.
		for (int i = 0; i <= arrParam.length - 1; i++) {
			for (int j = 0; j <= arrParam.length - 1 - i; j++) { // j가

				if (orderSel == 1) { // 오름차순 선택
					if (arrParam[j] > arrParam[j + 1])
						temp = arrParam[j];
					arrParam[j] = arrParam[j + 1];
					arrParam[j + 1] = temp;
					
					
					showArray(arrParam, "스왑중오름차순정렬중"+ (swapCnt++));
				}
				else if(orderSel == 2) {
					if(arrParam[j] < arrParam[j+1])
						temp = arrParam[j];
					arrParam[j] = arrParam[j + 1];
					arrParam[j + 1] = temp;
					
					showArray(arrParam, "스왑중내림차순정렬중" + (swapCnt++));
				}

			}

		}
	}

	public static int menuSelect() {

		System.out.println("정렬할 방법을 선택하세요.");
		System.out.println("1.오름차순  2.내림차순");

		return scanner.nextInt();
	}

	public static void showArray(int[] arr, String message) {

		System.out.println(message);
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();

	}

	public static void randomCreate(int[] arrParam) {

		// 난수생성을 위한 시드를 설정한다.

		rnd.setSeed(System.currentTimeMillis());

		// 난수 생성방법 1 난수10개를 우선 생성한 후 배열에 담아줍니다.
		// 난수 생성방법 2 배열 전체를 대상으로 중복확인합니다.
		// 난수 생성방법 3 만약 중복되는 요소가 발견되면 다시 1번으로 돌아가서 난수를 생성합니다.
		// 난수 생성방법 4 중복되는 요소가 없다면 함수를 종료하고 메인으로 돌아갑니다.

		while (true) {
			// 난수 10개를 생성후 배열에 담는다.
			for (int i = 0; i < arrParam.length; i++) {

				arrParam[i] = rnd.nextInt(99) + 1; // 1~99 까지의 정수가 생성 됩니다.
			}
			// 중복확인필요!
			boolean rndFlag = false; // 중복체크를 위한 변수 false 라면 중복된 난수가 없는경우 true라면 중복된 난수가 있다는 것.

			for (int i = 0; i < arrParam.length; i++) {
				for (int j = 0; j < arrParam.length; j++) {
					// 비교의 조건은 index i 와 index j 가 서로 다를때
					// index가 동일하다면 같은 숫자일때니까
					if (i != j && arrParam[i] == arrParam[j]) { // 중복된 값이 발견된다면
						rndFlag = true;

					}

				}
			}
			// 중복된값이없다면 break; 로 while 문을 탈출
			if (rndFlag == false)
				break;
		}

	}

}

package ex04controlstatement;

public class E05For1
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++)
		{
			System.out.println("i=" + i);
		}
		int sum = 0;
		for (int j = 1; j <= 100; j++)
		{
			sum += j;
		}
		System.out.println("1~100까지의 합:" + sum);

		int total = 0;
		for (int i = 1; i <= 10; i++)
		{
			if (i % 2 == 0)
			{
				total += i;
			}
		}
		System.out.println("1~10사이의 2의 배수의합(방법1)" + total);

		total = 0;
		for (int i = 0; i <= 10; i += 2)
		{
			total += i;
		}
		System.out.println("1~10사이 2의 배수의합(방법2)" + total);

		int a = 1;
		for (;;)
		{
			System.out.println("나는 for문으로 만든 무한루프입니다" + a);
			a++;
			if (a == 100)
				break;
		}
		for (int j = 0; j <= 5; j++)
			;
		{

			System.out.println("어랏... 나는 누구? 여긴 어디?");
//			System.out.println("위 for문에서 선언한 변수 j=" + j);
		}
		System.out.println("위 main함수 지역에서 선언한 변수 total" + total);

		int i = 0;
		for (; i <= 5; i++)
		{
			System.out.println("for문 안에서의 i값=" + i);
		}
		System.out.println("for문 밖에서의 i값=" + i);

		int dan = 1;
		while (dan <= 9)
		{
			int su = 2;
			while (su <= 9)
			{
				System.out.printf("%-1d*%-2d=%2d", dan, su, (dan * su));
				su++;
			}
			System.out.println();
			dan++;
		}
		System.out.println("\n=======================================\n");

		System.out.println("행방향의 구구단 출력하기");
		// 단에 해당하는 for문 2~9단까지 증가합니다.

		for (i = 2; i <= 9; i++)
		{
			for (int j = 1; j <= 9; j++)
			{
				System.out.printf("%-1d*%-2d=%2d ", i, j, (i * j));
			}
			System.out.println();
		}

		System.out.println("\n=======================================\n");

		for (i = 1; i <= 9; i++)
		{
			for (int j = 2; j <= 9; j++)
			{
				System.out.printf("%-1d*%-2d=%2d ", j, i, (i * j));
			}
			System.out.println();
		}

		int x = 1;
		while (x <= 4)
		{
			int y = 1;
			while (y <= 4)
			{
				if (x + y == 5)
				{
					System.out.print("1 ");
				} else
				{
					System.out.print("0 ");
				}
				y++;
			}
			System.out.println();
			x++;
		}
		for (x = 1; x <= 4; x++)
		{
			for (int y = 1; y <= 4; y++)
			{
				if (x + y == 5)
				{
					System.out.print("1 ");
				} else
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}

	}

}

package ex04controlstatement;

public class QuPyramid04
{

	public static void main(String[] args)
	{
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j <= 3 - i; j++)
			{
				System.out.print("*");

			}
			System.out.println();

		}
	}

}
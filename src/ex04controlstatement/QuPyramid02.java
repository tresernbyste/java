package ex04controlstatement;

public class QuPyramid02
{

	public static void main(String[] args)
	{
		
		int i=0;
		int j= 0;
		while(i<5) {
			j= 0;
			while(j <=4 - i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			
					
		}

	}

}

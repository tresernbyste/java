package ex04controlstatement;

/*
while��
	: �ݺ��� Ƚ���� ��Ȯ�ϰ� ���������� �ʾ����� �ַ� ����ϴ� 
	�ݺ������� �ݺ��� ���� �ʱⰪ, ����, �������� ���� �ۼ��ϴ� 
	������ ������ �ִ�. 
 	����]
 		�ݺ��� ���� ������ �ʱⰪ;
 		while(�ݺ�������){
 			���๮��;
			������; <= �ݺ��� Ż���� ���� ����
		}
	������ true�϶� �ݺ��ϰԵǰ�, �ݺ����� ó������ ���ư��� ������ 
	Ȯ���Ѵ�.
	�ݺ��� ������ false�϶� while���� Ż���ϰ� �ȴ�.
*/
public class E03While
{
	public static void main(String[] args)
	{
		// �ݺ��� ���� ���� i�� ������ �� 1�� �ʱ�ȭ
		int i = 1;
		// �ݺ��� ���� ���ǽ��� �ۼ� : i�� 10�����϶��� �ݺ�
		while(i<=10) {
			System.out.println("����i="+ i);
			
			i++;
		}
		System.out.printf("%d �̻��Դϴ�. %n", i);
		
		/*
		�ó�����] 1~10������ ���� ���ϴ� ���α׷��� while������
			�ۼ��Ͻÿ�.
		 */	
		// �������� ����ϱ� ���� ���� ����
		int sum = 0;
		// �ݺ��� �ʱⰪ
		int j = 1;
		// �ݺ��� ����
		while(j<=10) {
			// ���մ��Կ����ڸ� ���� �����ϴ� j�� sum�� �����ؼ� ����.
			sum += j;
			// �Ϲ����� ����� ������
			//sum = sum + j;  
			// �ݺ��� ������
			j++;
		}
		// ��� : 55
		System.out.printf("%d �̻��Դϴ�. %n", j);
		System.out.println("1~10��������sum="+ sum);
		
		/*
		�ó�����] 1~100������ ������ 3�ǹ���̰ų� 4�ǹ����
		������ ���� ���ϴ� ���α׷��� while���� �̿��ؼ� �ۼ��Ͻÿ�.
		 */	
		// �������� ����ϱ� ���� ����
		int total = 0;
		// k�� 100�����϶��� �ݺ��ϹǷ� 100�� �ݺ��� �ȴ�.
		int k = 1;
		while(k<=100) {
			// 3�̹�� Ȥ�� 4�ǹ���̹Ƿ� ��Or�� ���ȴ�.
			if(k%3==0 || k%4==0) {
				total += k;
				System.out.println("k="+ k);
			}
			k++;			
		}
		System.out.println("3�Ǵ�4�ǹ������:"+ total);
		
		/*
		�ó�����] �������� ����ϴ� ���α׷���                  
		while������ �ۼ��Ͻÿ�.
		 */		
		// ���� ǥ���ϴ� ����
		int su = 1;
		// ���� ���� ����(2~9�ܱ���)
		while(su<=9) {
			// ���� ǥ���� ����
			int dan = 2;
			// ���� ���� ����(1~9���� ���� ������ ���¿��� �����Ѵ�)
			while(dan<=9) {
				// �������� ����Ѵ�.
				System.out.printf("%-2d*%-2d=%2d", dan, su, (dan*su));
				// �����ϳ��� ����� �� �����̽�(����)�� ����Ѵ�.
				System.out.printf(" ");
				// ���� ���� ����
				dan++;
			}
			System.out.println();
			// ���� 1���� ��Ų��.
			su++;
		}
		System.out.println("\n=======================================\n");
		
		
		
//		
//		/*
//		�ó�����] �Ʒ��� ���� ����� ����ϴ� while���� �ۼ��Ͻÿ�.
//			��°��
//				1  0  0  0
//				0  1  0  0
//				0  0  1  0
//				0  0  0  1
//		 */		
		int x=1;
		while(x<=4) {
			int y=1;
			while(y<=4) {
				if(x==y) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
				y++;
			}
			System.out.println();
			x++;
		}
	}
}

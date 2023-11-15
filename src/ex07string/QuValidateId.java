//사용자로 부터 아이디를 입력받은 후 다음 조건에 만족하는지 확인할 수 있는 프로그램을 작성하시오.
//아이디는 8~12자 사이로만 사용할 수 있다. (length() 메서드 활용)
//영문과 숫자로만 입력할 수 있다. (charAt() 메서드 활용)
//특수기호, 공백, 그 외 모든 문자는 입력할 수 없다. 
//위 조건에 만족하면 true, 만족하지 않으면 false를 반환한다. 
//메서드명 : boolean idValidate(String inputId)
//힌트 : (idChar>='a' && idChar<='z') 이와 같은 조건을 사용하면 된당^^*
//실행결과]

// !not  else  !not 을 하지 않으면 else를 많이 사용해야해 길어진다.

package ex07string;

import java.util.Scanner;

public class QuValidateId
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("아이디를 입력하세요 : ");
		String id = scan.nextLine();

		boolean idOK = idValidate(id);
		if(idOK==true) {
			System.out.println("아이디사용이 가능");
			
		}else {
			System.out.println("아이디사용이 불가능 ");
		}

	}

	static boolean idValidate(String inputId)
	{

		boolean idOk = true;

		if (inputId.length() >= 8 && inputId.length() <= 12)
		{
			for (int i = 0; i < inputId.length(); i++)
			{
				char idchr = inputId.charAt(i);

				System.out.println("인덱스" + i + "는" + idchr);
				if (!(idchr >= '0' && idchr <= '9') || (idchr >= 'a' && idchr <= 'z') || (idchr >= 'A' && idchr <= 'Z'))
				{

					System.out.println(idchr + "--허용안됨");
					idOk = false;
				}

			}

		} else
		{
			idOk = false; 
		}

		return idOk;
	}

}
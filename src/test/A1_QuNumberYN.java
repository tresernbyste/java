package test;

import java.io.IOException;

public class A1_QuNumberYN
{

	public static void main(String[] args) throws IOException						//예외처리
	{
	System.out.print("하나의 문자를 입력하세요 : ");
	int c = System.in.read();
	
	if (c >='0' && c <= '9')
	{
		System.out.println("숫자입니다.");
		
	} else
	{
		System.out.println("숫자가 아닙니다.");

	}
	
	String str = (c>='0' && c<='9') ? "숫자입니다." : "숫자가아닙니다.";
		System.out.println(c + "는(은)" + str);	
	}
	
	}


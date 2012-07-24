package step1;

import java.util.Scanner;

public class Op {

	/**
	 * 프로그램 명: op
	 * 두 자연수 a,b 를 입력으로 받아 a+b(합),a-b(차),a*b(곱),a/b(몫),a%b(나머지) 를 구하는 프로그램을 작성하시오.
	 * a 가 5 이고 , b 가 3 이면
	 * 
	 * 5+3=8
	 * 5-3=2
	 * 5*3=15
	 * 5/3=1
	 * 5%3=2
	 * 
	 * 입력
	 * 두 수 a,b 는 1000 이하이다.
	 * 
	 * 출력
	 * 숫자와 연산자 사이에 공백이 없이 출력 예의 형식으로 출력한다.
	 * 
	 * 입출력 예
	 * 입력
	 * 3 5
	 * 
	 * 출력
	 * 3+5=8
	 * 3-5=-2
	 * 3*5=15
	 * 3/5=0
	 * 3%5=3
	 */
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		
		int a, b = 0;
		a = key.nextInt();
		b = key.nextInt();

		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"%"+b+"="+(a%b));
	}
}

package step1;

import java.util.Scanner;

public class M2S {

	/**
	 * 프로그램 명: m2s
	 * 분을 입력으로 받아 초로 변환하는 프로그램을 작성하시오.
	 * 입력
	 * 분 m 이 자연수로 주어진다. ( 1 <= m <= 60)
	 * 출력
	 * 변환 된 초를 출력 예의 형식으로 출력한다. 출력을 간단히 하기 위해 1 분도 1 minutes 로 쓰기로 한다.
	 * 
	 * 입출력 예
	 * 2
	 * 2 minutes is 120 seconds.
	 */
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		
		int a = 0;
		a = key.nextInt();
		
		
		
		System.out.println(a  + " minutes is "+ ( a * 60 )+ " seconds.");
	}
}

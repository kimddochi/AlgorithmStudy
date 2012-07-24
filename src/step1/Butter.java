package step1;

import java.util.Scanner;

public class Butter {

	/**
	 * 프로그램 명: butter
	 * n 마리의 쥐가 크기가 같은 n 개의 버터를 먹는데 n 시간이 걸린다고 할 때 , m 마리의 쥐가 m 개의 버터를 먹는데 걸리는 시간을 구하는것이 문제이다.
	 * 입력
	 * 차례대로 n,m 이 주어진다. 각 수는 1000 이하의 자연수 이다.
	 * 출력
	 * 시간을 출력한다.
	 * @param args
	 */
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		
		int a, b = 0;
		
		a = key.nextInt();
		b = key.nextInt();
		
		System.out.println( (a * b) / b);
	}
}



/*
930 515
our answer

930


====================================================
n(단위시간)*n(개)/n(마리) = n

이 수식의 의미를 그냥 버터의 수량만 남기고 소거해버려서 버터의 수량이 핵심이라고 오해했어요ㅜ
수식의 의미는 단위 시간에 n마리의 쥐가 n개의 버터를 먹는 양이라는 의미인 것이죠ㅜ
따라서 m마리의 쥐가 m개의 버터를 단위 시간동안 먹는 양은 n(단위시간)*m(개)/m(마리)= n이 되는거죠ㅜ
 */

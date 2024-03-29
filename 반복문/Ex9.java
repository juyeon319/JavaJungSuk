package ch1.반복문;

import java.util.Scanner;

//do-while 문
public class Ex9 {
	public static void main(String[] args) {
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random()*100)+1; //1~100
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요>>");
			input = scan.nextInt();
			
			if(input>answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			}else if(input<answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		} while (input!=answer); //input과 answer가 다를 때까지 반복
		System.out.println("정답입니다.");
	}
}

package ch1.반복문;

import java.util.Scanner;

//while 문
public class Ex8 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요(예:12345)>>");
		
		String tmp = scan.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num!=0) {	//num이 0이 아닐 동안
			//num을 10으로 나눈 나머지를 sum에 더함.
			sum += num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			num /= 10;
		}
		System.out.println("각 자리수의 합 : " + sum);
	}
}

package ch1.반복문;

//임의의 정수 만들기
public class Ex1 {
	public static void main(String[] args) {
		int num = 0;
		
		//괄호{} 안에 내용을 20번 반복한다.
		//Quiz1. 1~10사이의 난수를 20개를 출력하시오.
		//Quiz2. -5~5사이의 난수를 20개를 출력하시오.
		for(int i=1; i<=20; i++) {
//			System.out.println((int)(Math.random()*10)+1); //1~10
			System.out.println((int)(Math.random()*11)-5); //-5~5
		}
	}
}

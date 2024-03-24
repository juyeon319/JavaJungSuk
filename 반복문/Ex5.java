package ch1.반복문;

//중첩 for 문
public class Ex5 {
	public static void main(String[] args) {
		//별찍기
		for(int i=1; i<=5; i++) { //5번 반복한다.
			for(int j=1; j<=10; j++) {	//*을 10개 출력한다.
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=10; i++) { //10번 반복한다.
			for(int j=1; j<=i; j++) {	//*을 1~10 출력
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

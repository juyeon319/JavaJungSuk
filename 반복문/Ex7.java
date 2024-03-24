package ch1.반복문;

//while 문
public class Ex7 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(sum <= 100) {	//sum이 100이하일 때까지
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i;	//sum에 i를 더해라
		}
	}
}

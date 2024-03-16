package ch1.반복문;

//while문
public class Ex6 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while (sum <= 100) {	//sum이 100보다 작을때까지만
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i;	//i를 1씩 증가시켜 sum에 계속 더함
		}
	}
}

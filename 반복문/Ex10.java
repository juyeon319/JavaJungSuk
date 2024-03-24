package ch1.반복문;

//break 문
public class Ex10 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {		//무한 반복문
			if(sum > 100) 	//sum이 100을 초과하면 벗어난다.
				break;
			++i;
			sum += i;		//sum에 i를 더한다.
		}
		
//		while(sum<=100) {
//			++i;
//			sum += i;
//		}
		
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}
}

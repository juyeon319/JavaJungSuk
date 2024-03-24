package ch1.반복문;

//이름 붙은 반복문
public class Ex13 {
	public static void main(String[] args) {
		//for문에 Loop1이라는 이름을 붙였따.
		Loop1 : for(int i=2; i<=9; i++) {
			for(int j=1; j<=10; j++) {
				if(j==5)					//j가 5라면 
//					break Loop1;			//Loop1을 벗어난다. 2*4까지 나옴
//					break; 					//2~9단 4까지 곱한 합이 나온다.
					continue Loop1;			//다음 단으로 넘어간다. 2*4까지 나오고 3단으로 넘어감
//					continue;				//5는 건너뛰고 6~10을 곱한다.(2~9단)
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();
		}
	}
}

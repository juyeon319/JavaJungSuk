package ch1.반복문;

//continue 문
public class Ex11 {
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			if(i%2==0)			//i를 2으로 나눈 나머지가 0이면 
				continue;		//다음 반복으로 넘어간다.(2, 4, 6, 8, 10)
			System.out.println(i);
		}
	}
}

package ch1.반복문;

//임의의 정수 만들기 - Math.random()
public class Ex1 {
	public static void main(String[] args) {
		int num = 0;
		
		for(int i=1; i<=5; i++) {
			num = (int)(Math.random() * 6) + 1;
			System.out.println(num);
		}
	}
}

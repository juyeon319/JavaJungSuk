package ch1.반복문;

//for 문
public class Ex2 {
	public static void main(String[] args) {
		//i = 1, 2, 3
		for(int i=1; i<=3; i++) {
			System.out.println(i);
		}
		
		//i = 1, 3, 5, 7, 9
		for(int i=1; i<=10; i+=2) {
			System.out.println(i);
		}
		
		//i = 1, 2, 4, 8
		for(int i=1; i<=10; i*=2) {
			System.out.println(i);
		}
		
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		for(int i=1, j=10; i<=10; i++, j--) {
			System.out.println("i = " + i + " j = " + j);
		}
	}
}

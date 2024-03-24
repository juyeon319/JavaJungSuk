package ch1.반복문;

//중첩 for 문
public class Ex4 {
	public static void main(String[] args) {
		
		//구구단
		for(int i=2; i<=9; i++) { //2~9
			for(int j=1; j<=9; j++) { //1~9
				System.out.println(i + "*" + j + " = " + (i*j));
			}
			System.out.println();
		}
	}
}

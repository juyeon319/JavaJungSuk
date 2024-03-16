package ch1.반복문;

//while문
public class Ex5 {
	public static void main(String[] args) {
		int i = 5;
		
		while (i--!=0) {	//0이 되면 while문을 벗어남(거짓이니깐)
			System.out.println(i + " I can do it!");
		}
	}
}

package ch1.�ݺ���;

import java.util.Scanner;

//do-while ��
public class Ex9 {
	public static void main(String[] args) {
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random()*100)+1; //1~100
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("1�� 100������ ������ �Է��ϼ���>>");
			input = scan.nextInt();
			
			if(input>answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");
			}else if(input<answer) {
				System.out.println("�� ū ���� �ٽ� �õ��غ�����.");
			}
		} while (input!=answer); //input�� answer�� �ٸ� ������ �ݺ�
		System.out.println("�����Դϴ�.");
	}
}

package ch1.�ݺ���;

import java.util.Scanner;

//while ��
public class Ex8 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���(��:12345)>>");
		
		String tmp = scan.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num!=0) {	//num�� 0�� �ƴ� ����
			//num�� 10���� ���� �������� sum�� ����.
			sum += num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			num /= 10;
		}
		System.out.println("�� �ڸ����� �� : " + sum);
	}
}

package ch1.�ݺ���;

import java.util.Scanner;

//break, continue ��
public class Ex12 {
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {	//���� �ݺ���
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("���ϴ� �޴�(1~3)�� �����ϼ���. (����:0)");
			
			String tmp = scan.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;	//�����.
			}else if(!(1 <= menu && menu <=3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. �ٽ� �����ϼ���.(����:0)");
				continue;	//���� �ݺ����� �Ѿ��.	
			}
			System.out.println("�����Ͻ� �޴��� " + menu + "�� �Դϴ�.");
		}
	}
}

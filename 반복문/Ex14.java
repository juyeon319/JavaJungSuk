package ch1.�ݺ���;

import java.util.Scanner;import javax.print.attribute.standard.Media;

public class Ex14 {
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		
		outer : while(true) {	//���� �ݺ���
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
		
		for(;;) {		//���� �ݺ�
			System.out.print("����� ���� �Է��ϼ���. (��� ����:0, ��ü ����:99)>");
			tmp = scan.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num==0)	//num�� 0�̸� for ���� �����. 
				break;
			
			if(num==99)	//num�� 99�� for, while ���� �����.
				break outer;
			
			switch (menu) {
			case 1:
				System.out.println("result=" + num*num);
				break;
			case 2:
				System.out.println("result=" + Math.sqrt(num));
				break;
			case 3:
				System.out.println("result=" + Math.log(num));
				break;
				}
			}
		}
	}
}

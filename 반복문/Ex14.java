package ch1.반복문;

import java.util.Scanner;import javax.print.attribute.standard.Media;

public class Ex14 {
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		
		outer : while(true) {	//무한 반복문
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0)");
			
			String tmp = scan.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;	//벗어난다.
			}else if(!(1 <= menu && menu <=3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다. 다시 선택하세요.(종료:0)");
				continue;	//다음 반복으로 넘어간다.	
			}
		
		for(;;) {		//무한 반복
			System.out.print("계산할 값을 입력하세요. (계산 종료:0, 전체 종료:99)>");
			tmp = scan.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num==0)	//num이 0이면 for 문을 벗어난다. 
				break;
			
			if(num==99)	//num이 99면 for, while 문을 벗어난다.
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

package ch1.�ݺ���;

//��ø for ��
public class Ex5 {
	public static void main(String[] args) {
		//�����
		for(int i=1; i<=5; i++) { //5�� �ݺ��Ѵ�.
			for(int j=1; j<=10; j++) {	//*�� 10�� ����Ѵ�.
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=10; i++) { //10�� �ݺ��Ѵ�.
			for(int j=1; j<=i; j++) {	//*�� 1~10 ���
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

package ch1.�ݺ���;

//while��
public class Ex6 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while (sum <= 100) {	//sum�� 100���� ������������
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i;	//i�� 1�� �������� sum�� ��� ����
		}
	}
}

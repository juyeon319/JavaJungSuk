package ch1.�ݺ���;

//continue ��
public class Ex11 {
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			if(i%2==0)			//i�� 2���� ���� �������� 0�̸� 
				continue;		//���� �ݺ����� �Ѿ��.(2, 4, 6, 8, 10)
			System.out.println(i);
		}
	}
}

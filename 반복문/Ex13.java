package ch1.�ݺ���;

//�̸� ���� �ݺ���
public class Ex13 {
	public static void main(String[] args) {
		//for���� Loop1�̶�� �̸��� �ٿ���.
		Loop1 : for(int i=2; i<=9; i++) {
			for(int j=1; j<=10; j++) {
				if(j==5)					//j�� 5��� 
//					break Loop1;			//Loop1�� �����. 2*4���� ����
//					break; 					//2~9�� 4���� ���� ���� ���´�.
					continue Loop1;			//���� ������ �Ѿ��. 2*4���� ������ 3������ �Ѿ
//					continue;				//5�� �ǳʶٰ� 6~10�� ���Ѵ�.(2~9��)
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();
		}
	}
}

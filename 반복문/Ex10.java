package ch1.�ݺ���;

//break ��
public class Ex10 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {		//���� �ݺ���
			if(sum > 100) 	//sum�� 100�� �ʰ��ϸ� �����.
				break;
			++i;
			sum += i;		//sum�� i�� ���Ѵ�.
		}
		
//		while(sum<=100) {
//			++i;
//			sum += i;
//		}
		
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}
}

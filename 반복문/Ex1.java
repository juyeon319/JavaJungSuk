package ch1.�ݺ���;

//������ ���� �����
public class Ex1 {
	public static void main(String[] args) {
		int num = 0;
		
		//��ȣ{} �ȿ� ������ 20�� �ݺ��Ѵ�.
		//Quiz1. 1~10������ ������ 20���� ����Ͻÿ�.
		//Quiz2. -5~5������ ������ 20���� ����Ͻÿ�.
		for(int i=1; i<=20; i++) {
//			System.out.println((int)(Math.random()*10)+1); //1~10
			System.out.println((int)(Math.random()*11)-5); //-5~5
		}
	}
}

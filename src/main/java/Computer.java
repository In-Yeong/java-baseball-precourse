package main.java;

public class Computer {
	
	int[] com_arr = new int[3];			// 3���� ���� ������ �迭 ����
	
	public int[] make_list() {
	
		for (int i=0; i<3; i++) {
			int random_number = (int) (Math.random() * 9) + 1;			// 1~9 ���� �ѹ��� �����ϰ� �����ϱ� 3�� �ݺ�
			com_arr[i] = random_number;
		}
		
		return com_arr;			// �迭 ����
	}
}

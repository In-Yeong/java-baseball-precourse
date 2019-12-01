package main.java;

public class Matching {
	public int strike(int[] com_arr, int[] user_arr) {
		
		int strike = 0;			// ��Ʈ����ũ �⺻ �� 0���� ����
		
		for (int i=0; i<3; i++) {
			if (user_arr[i] == com_arr[i]) {			// ������ ��ǻ���� ���� �迭 ��ġ�� ���� ���� ������
				strike += 1;			// ��Ʈ����ũ ���� 1 ���ϱ�
			}
		}
		
		return strike;			// ��Ʈ����ũ �� ����
	}
	
	public int ball(int[] com_arr, int[] user_arr) {
		int ball = 0;			// �� �⺻ �� 0���� ����
		int[] com_arr_tmp = com_arr.clone();			// ��ǻ�� �迭�� Ŭ���Ͽ� ���� �ٲ� ������ ���� �ʰ� ��
		int strike = strike(com_arr, user_arr);			// ��Ʈ����ũ �� �ޱ�
		
		for (int i=0; i<3; i++) {
			if (user_arr[0] == com_arr_tmp[i]) {			// ������ ù��° ���� ���� ���� ������
				ball += 1;			// �� ���� 1�� ���ϰ�
				com_arr_tmp[i] = 0;			// ��ǻ�� �迭���� �ش� ���� 0���� �ٲٱ� (�ߺ� ī��Ʈ ����)
				continue;
			}
			if (user_arr[1] == com_arr_tmp[i]) {			// ������ �ι�° ���� ��������
				ball += 1;
				com_arr_tmp[i] = 0;
				continue;
			}
			if (user_arr[2] == com_arr_tmp[i]) {			// ������ ����° ���� ��������
				ball += 1;
				com_arr_tmp[i] = 0;
				continue;
			}
		}
		
		return ball-strike;			// �� ������ ��Ʈ����ũ ���� ���� ���� (���� ��Ʈ����ũ�� �����ϱ� ����)
	}
}

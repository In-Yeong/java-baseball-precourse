package main.java;

public class Userhelp {
	
	
	public int exception(int number) {			// ����(����)ó��
		int error = 0;			// ���� �⺻�� 0 (���� ����)
		
		if (number < 111 || number > 999) {			// 1���� 9������ ���ڸ� ���� �ƴ� ���
			error = 1;
		}
		if (Integer.toString(number).indexOf("0") != -1) {			// ���ڿ� 0�� ���Ե� ���
			error = 2;
		}
		
		return error;			// ������ ����
	}
	
	public int[] num_to_arr(int num) {			// ���ڸ� array ���·� ��ȯ
		
		int[] user_arr = new int[3];			// ���ο� array ����
		int div_num = 100;			// ������ �� 100���� �⺻ ����
	
		for (int i=0; i<3; i++) {
			user_arr[i] = num / div_num;			// ���ڸ� div_num���� ���� �� ����
			num -= user_arr[i]*div_num;			// ���ڿ��� ���� �� ����
			div_num /= 10;			// div_num 10���� ���� �ڸ��� �ű��
		}
		return user_arr;			// array ����
	}
}
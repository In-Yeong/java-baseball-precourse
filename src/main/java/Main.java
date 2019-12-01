package main.java;

public class Main {
	public static void main (String[] args) {
		Computer computer = new Computer();
		User user = new User();
		Matching matching = new Matching();
		Result result = new Result();
		
		int[] target = computer.make_list();			// ���� �ѹ�(3��)�� array�� ������
		int[] success = new int[2];			// [��������, ����ۿ���]
		
		while (true) {
			int[] answer = user.input();			// ����ڰ� ���� ����
			
			int strike = matching.strike(target, answer);			// ��Ʈ����ũ ����
			int ball = matching.ball(target, answer);			// �� ����
			
			success = result.release(strike, ball);			// ��� ����
			
			if (success[0] == 1) {
				break;			// �������ΰ� 1�϶� ���� ���� ���̸�, while ��������
			}
		}
		
		if (success[1] == 1) {
			main(args);			// ����ۿ��ΰ� 1�϶� ������� �ǹ��ϸ�, main���� ���ư��� ������ �������
		}
	}
	
}

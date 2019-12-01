package main.java;

import java.util.Scanner;

public class Result {
	public int[] release(int strike, int ball) {
		
		int[] check_and_decision = new int[2];			// [��������, ����ۿ���]
		int check = 0;			// �������� �⺻�� 0 (����)
		int decision = 0;			// ����ۿ��� �⺻�� 0 (�Ұ���)
		if (strike != 3) {			// ���� ������ ������ ��
			
			if (strike != 0) {			// ��Ʈ����ũ ���� ���
				System.out.print(strike + "��Ʈ����ũ ");
			}
			
			if (ball != 0) {			// �� ���� ���
				System.out.print(ball + "�� ");
			}
			
			if (strike == 0 && ball == 0) {			// ������ �� ���
				System.out.print("����");
			}
			System.out.println();
		}else {			// ���� ������ ��
			System.out.println("3���� ���ڸ� ��� �����̽��ϴ�! ���� ����");
			
			while (decision != 1 && decision != 2) {			// ����ۿ��� �ùٸ� �� �ޱ�
				decision = restart();
			}
			
			check = 1;			// �������� 1���� ���� (����)
		}
		check_and_decision[0] = check;			// �������� �ݿ�
		check_and_decision[1] = decision;			// ����ۿ��� �ݿ�
		
		return check_and_decision;			// [��������, ����ۿ���] ����
		
	}
	
	
	public int restart() {			// ����ۿ��� �� �ޱ�
		System.out.println("������ ���� �����Ϸ��� 1, �����Ϸ��� 2�� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		int start_or_not = scanner.nextInt();
		
		return start_or_not;
	}
}

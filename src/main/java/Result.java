package main.java;

import java.util.Scanner;

public class Result {
	public int[] release(int strike, int ball) {
		
		int[] check_and_decision = new int[2];
		int check = 0;
		int decision = 0;
		if (strike != 3) {
			
			if (strike != 0) {
				System.out.print(strike + "��Ʈ����ũ ");
			}
			
			if (ball != 0) {
				System.out.print(ball + "�� ");
			}
			
			if (strike == 0 && ball == 0) {
				System.out.print("����");
			}
			System.out.println();
		}else {
			System.out.println("3���� ���ڸ� ��� �����̽��ϴ�! ���� ����");
			
			while (decision != 1 && decision != 2) {
				decision = restart();
			}
			
			check = 1;
		}
		check_and_decision[0] = check;
		check_and_decision[1] = decision;
		
		return check_and_decision;
		
	}
	
	
	public int restart() {
		System.out.println("������ ���� �����Ϸ��� 1, �����Ϸ��� 2�� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		int start_or_not = scanner.nextInt();
		
		return start_or_not;
	}
}

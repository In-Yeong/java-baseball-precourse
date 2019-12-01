package main.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
	Scanner scanner = new Scanner(System.in);
	int input_num = 0;			// �������� ���� �� ����. �⺻�� 0
	int[] result;			// ����� ���� �� array ����
	Userhelp userhelp = new Userhelp();
	
	public int[] input() {
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		try {
			
			input_num = scanner.nextInt();			// �������� ���� ����
			
		} catch(InputMismatchException ime) {			// ���ڸ� ������ ���� �Է��� ��� ����ó��
			
		    System.out.println("���ڸ� �Է� �����մϴ�.");
		    scanner = new Scanner(System.in);			// ��ĳ�� �� ���� �� �ٽ� ����
		    input();
		}
		
		int error_num = userhelp.exception(input_num);			// ���� �� �ޱ� (0-��������, 1,2-��������)
		
		
		if (error_num == 0) {			// ���� ���� ���
			result = userhelp.num_to_arr(input_num);			// int ���� array�� ����
			
		}else {			// ���� ���� ���
			System.out.println("1~9�� �̷���� 3�ڸ� ���ڸ� �Է� �����մϴ�.");
			scanner = new Scanner(System.in);			// ��ĳ�� �� ���� �� �ٽ� ����
			input();
		}
		return result;			// ���� array �� ����
		
	}

}

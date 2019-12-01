package main.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
	Scanner scanner = new Scanner(System.in);
	int input_num = 0;
	int[] result;
	Userhelp userhelp = new Userhelp();
	
	public int[] input() {
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		try {
			
			input_num = scanner.nextInt();
			
		} catch(InputMismatchException ime) {
			
		    System.out.println("���ڸ� �Է� �����մϴ�.");
		    scanner = new Scanner(System.in);
		    input();
		}
		
		int error_num = userhelp.exception(input_num);
		
		
		if (error_num == 0) {
			result = userhelp.num_to_arr(input_num);
			
		}else {
			System.out.println("1~9�� �̷���� 3�ڸ� ���ڸ� �Է� �����մϴ�.");
			scanner = new Scanner(System.in);
			input();
		}
		return result;
		
	}

}

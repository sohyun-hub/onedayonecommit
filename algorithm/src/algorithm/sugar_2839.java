package algorithm;

import java.util.Scanner;

public class sugar_2839 {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.print("�Է��� �ּ���: ");
			int input = sc.nextInt();
			int etc = 0; 	//3�� ����� �Ǵ� ����
			
			if(3 <=input || input <= 5000) {
				while(true) {
					
					if(input % 5 == 0) {
						System.out.println(input/5+etc);
						return;
					} else if(input % 5 < 0) {
						System.out.println(-1);
					}
					
					input -= 3;
					etc++;
				}
			} else {
				System.out.println("�ٽ� �Է��� �ּ���. (3 <= N <= 5000)");
			}
			
	}

}

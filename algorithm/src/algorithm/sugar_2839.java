package algorithm;

import java.util.Scanner;

public class sugar_2839 {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.print("입력해 주세요: ");
			int input = sc.nextInt();
			int etc = 0; 	//3의 배수가 되는 변수
			
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
				System.out.println("다시 입력해 주세요. (3 <= N <= 5000)");
			}
			
	}

}

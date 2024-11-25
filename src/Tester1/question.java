package Tester1;

import java.util.Scanner;

public class question {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = 1;
		float average = 0;
		int sum = 0;
		int a = 0;
		int s = 0;
		int averageResult;
		int sumResult;
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println(n + ". Enter the number : ");
			n++;
			int num = scan.nextInt();
			
			if(num > 0) {
				average += num;
				a++;
			}else if (num < 0) {
				sum += num;
				s++;
			}
		}
		if (s == 0) {
			System.out.println("There is no negative number!");
		}else if (a == 0) {
			System.out.println("There is no positive number!");
		}
		System.out.println("Average of positive numbers : " + average / a);
		System.out.println("Sum of negative numbers : " + sum / s);
	}
}

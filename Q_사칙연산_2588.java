package ProblemYeah;

import java.util.Scanner;

public class Q_사칙연산_2588 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(a * (b % 10));
		System.out.println(a * (b/10 % 10));
		System.out.println(a * (b/100 % 10));
		System.out.println(a * b);
	}

}

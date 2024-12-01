package interview_prep;

import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("program staets");
		System.out.println("enter the first number");
		int num1 = sc.nextInt();
		System.out.println("enter thye sewcond numnber");
		int num2 = sc.nextInt();
		try {
			int result=num1/num2;
			System.out.println("1st try");
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
			//System.out.println(e);
			System.out.println("arithmetic exzception");
		}
		System.out.println("programs ends ");

	}

}


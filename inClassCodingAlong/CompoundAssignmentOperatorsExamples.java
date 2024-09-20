/**
 * 
 */
package inClassCodingAlong;

import java.util.Scanner;

/**
 * 
 */
public class CompoundAssignmentOperatorsExamples {

	/**
	 * Entry point to the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		num = sc.nextInt();
		num *= 4;
		
		System.out.println("Output a: " + ++num);
		System.out.println("Output b: " + num--);
		System.out.println("Output c: " + num);
		
		sc.close();
	}
		
}

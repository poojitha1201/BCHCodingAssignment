package com.fibonocci;

import java.util.Scanner;
/**
 * 
 * @author Poojitha_Alla
 *
 */
public class Fibonocci {

	public static void main(String[] args) {
		
		System.out.println("Enter number upto which Fibonacci series should print");
		Scanner scan=new Scanner(System.in);
		int fibCount=scan.nextInt();
		scan.close();
		System.out.println("The fibonocci series of first " +fibCount+ " numbers using recursion is"); 
        for (int i = 1; i <= fibCount; i++)
        System.out.print(getFibonacci(i) +" ");
        fibonacci(fibCount);
    }
        
	/**
	 * 
	 * @param number
	 * @return returns a fibonocci series using recursion
	 */
	public static int getFibonacci(int n) { 
		if (n == 1) {
			return 1; 
			} 
		if (n == 2) {
			return 1; 
			}
		return getFibonacci(n - 1) + getFibonacci(n - 2); }

	 /**
	  * 
	  * @param number
	  */

	 public static void fibonacci(int number) {
		 int fibo1 = 1; int fibo2 = 1; 
		 System.out.printf("\n Fibonacci series of %d numbers using for loop are : \n", number); 
		 System.out.printf("%d ", fibo1);
		 System.out.printf("%d ", fibo2); 
		 for (int i = 2; i < number; i++) {
			 int fibonacci = fibo1 + fibo2;
			 System.out.printf("%d ", fibonacci); 
			 fibo2 = fibo1; fibo1 = fibonacci;
			 }
	 
	 }

	 
	 }


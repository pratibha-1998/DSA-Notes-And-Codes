package com.striver.bitmanipulation;

public class DivideTwoIntegerWithoutMultiplicationDivisonOperator {
	
	public static void main(String[] args) {
		
		int dividend = 22;
		int divisor = 3;
		
		int sum = 0;
		int count = 0;
		
		while (sum + divisor <= dividend)  // Ensure sum never exceeds dividend
		{
			sum += divisor;
			count++;
		}
		
		System.out.println("Quotient: " + count);
	}
}

package com.htd.assignment1;

import java.util.Scanner;

public class Assignement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 Numbers: ");
		float firstNumber = scan.nextFloat();
		float secondNumber = scan.nextFloat();
		System.out.println(
				"The Addition of " + firstNumber + " and " + secondNumber + " is: " + (firstNumber + secondNumber));
		System.out.println(
				"The Substraction of " + firstNumber + " and " + secondNumber + " is: " + (firstNumber - secondNumber));
		System.out.println("The Multiplication of " + firstNumber + " and " + secondNumber + " is: "
				+ (firstNumber * secondNumber));
		System.out.println(
				"The Division of " + firstNumber + " and " + secondNumber + " is: " + (firstNumber / secondNumber));
		System.out.println(
				"The Reminder for " + firstNumber + " / " + secondNumber + " is: " + (firstNumber % secondNumber));
		scan.close();
	}

}

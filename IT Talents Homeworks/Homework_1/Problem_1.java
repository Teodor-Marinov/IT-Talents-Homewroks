package Problem_1;

import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {

		// Задача 1:
		// Да се изведат съобщения към потребителя и да се прочетат 2 числа от
		// клавиатурата A и B (може да са с плаваща запетая – double).
		// После да се прочете 3-то число C и да се провери дали то е м/у A  и B.
		// Да се изведе подходящо съобщение за това дали C е между A и B.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number A:");
		double numA = sc.nextDouble();
		System.out.println("Enter Number B:");
		double numB = sc.nextDouble();
		System.out.println("Enter Number C:");
		double numC = sc.nextDouble();
		if (((numC > numA) && (numC < numB)) || ((numC > numB) && (numC < numA))) {
			System.out.println("Number C is in the range between " + numA +" & "+numB);
		} else {
			System.out.println("Number C is not in the range between " + numA +" & "+numB);
		}
	}

}

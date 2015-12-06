import java.util.Scanner;

public class Problem_5 {

	public static void main(String[] args) {
		// Задача 5:
		// Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ
		// ред.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number A:");
		int numA = sc.nextInt();
		System.out.println("Enter Number B:");
		int numB = sc.nextInt();
		System.out.println("Enter Number C:");
		int numC = sc.nextInt();
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		if ((numA <= numB) && (numA <= numC)) {
			 num1 = numA;
			if (numB <= numC) {
				 num2 = numB;
				 num3 = numC;
			} else {
				 num2 = numC;
				 num3 = numB;
			}
		} else {
			if ((numB <= numA) && (numB <= numC)) {
				 num1 = numB;
				if (numA <= numC) {
					 num2 = numA;
					 num3 = numC;
				} else {
					 num2 = numC;
					 num3 = numA;

				}
			} else {
				 num1 = numC;
				if (numA <= numB) {
					 num2 = numA;
					 num3 = numB;
				} else {
					 num2 = numB;
					 num3 = numA;
				}

			}
		}
		System.out.println(num1 +" "+num2+" "+ num3);

	}
}

import java.text.BreakIterator;
import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {

		// Задача 2:
		// Въведете 2 различни целочислени числа от конзолата. Запишете
		// тяхната сума, разлика, произведение, остатък от деление и
		// целочислено деление в отделни променливи и разпечатайте тези
		// резултати в конзолата. Опитайте същото с числа с плаваща запетая.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number A:");
		int numA = sc.nextInt();
		System.out.println("Enter Number B:");
		
		int numB = sc.nextInt();
		int sum = numA + numB;
		int substract = numA - numB;
		int product = numA * numB;
		System.out.println("sum = " + sum);
		System.out.println("substract = " + substract);
		System.out.println("product = " + product);

		if (numB == 0) {
			System.out.println("division by 0 is not possible");
		} else {
			int div = numA / numB;
			int mod = numA % numB;
			System.out.println("div = " + div);
			System.out.println("mod = " + mod);			

		}

	}
}

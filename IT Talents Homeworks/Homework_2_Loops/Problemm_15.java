import java.util.Scanner;

public class Problemm_15 {

	public static void main(String[] args) {
		// Задача 15: Да се състави програма, която да изчисли сумата на
		// всички числа от 1 до въведено число N.
		// Пример: 5
		// Изход: 15
		// Използвайте цикъл do-while.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number N");
		int num = sc.nextInt();
		int sum = 0;
		int nextNumber = 1;
		do {
			sum = sum + nextNumber;
			nextNumber++;
		} while (nextNumber <= num);
		System.out.println(sum);

	}
}

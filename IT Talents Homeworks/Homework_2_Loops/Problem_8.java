import java.util.Scanner;

public class Problem_8 {

	public static void main(String[] args) {

		// Задача 8: По зададено число n, да се изведе на екрана таблица по
		// следния начин:
		// Пример:

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number N:");
		int numN = sc.nextInt();
		int print=numN-1;

		for (int i = 0; i < numN; i++) {
			for (int j = 0; j < numN; j++) {
				System.out.print(print);
			}
			print+=2;
			System.out.println();
		}
	}

}


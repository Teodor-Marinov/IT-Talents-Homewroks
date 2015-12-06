import java.util.Scanner;

public class Problemm_14 {

	public static void main(String[] args) {
		// Задача 14: Да се състави програма, която по въведено
		// естествено число N от интервала [10..200] извежда в обратен
		// ред всички числа, които са кратни на 7 и са по-малки от N.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number N(10 to 200)");
		int num = sc.nextInt();
		if ((num <= 200) && (num >= 10)) {
			for (int i = num-1; i >=10; i--) {

				if(i%7==0) {
					System.out.print(i + ", ");
				}
			}

		} else {
			System.out.println("Invalid value for sum(2 to 27)");
		}
	}

}

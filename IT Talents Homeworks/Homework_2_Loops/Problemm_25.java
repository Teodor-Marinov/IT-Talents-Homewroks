import java.util.Scanner;

public class Problemm_25 {

	public static void main(String[] args) {
		// Задача 25:
		// Да се направи програма, която по дадено число N, да изчислява
		// N!, т.е. 1*2*3*4...*N.
		// Пример: 5
		// Изход: 120

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number N");
		int numN = sc.nextInt();
		if (numN > 0) {
			int i = 1;
			int nFact = 1;
			do {
				nFact = nFact * i;
				i++;
			} while (i <= numN);
			System.out.println("N!=" + nFact);
		} else {
			System.out.println("Not a valid value");
		}
	}

}

import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		// Задача 2:
		// Нека по въведен масив да се конструира нов, като половината му
		// елементи са точно като на оригиналния, а другите да са тези
		// елементи, но в обратен ред. Последно, да се изведе новия масив
		// на екрана.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int numN = sc.nextInt();

		int arr[] = new int[numN];
		int newArr[] = new int[numN];
		int newArr2[] = new int[numN];
		
		//newArr - с втора половина запълнена с елементите в обратен ред от втората половина на оригиналния масив
		//newArr2 - с втора половина запълнена с елементите в обратен ред от първата половина на оригиналния масив

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element " + i);
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (i < numN / 2 + numN % 2) {
				newArr[i] = arr[i];
			} else {
				newArr[i] = arr[numN - i + numN / 2 - 1 + numN % 2];
			}

		}
		for (int i = 0; i < arr.length; i++) {
			if (i < numN / 2) {
				newArr2[i] = arr[i];
			} else {
				newArr2[i] = arr[numN-1 - i];
			}
		}

		System.out.println();
		System.out.print("INPUT:   ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print( arr[i]+", ");
		}
		System.out.println();
		System.out.print("newArr:  ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print( newArr[i]+", ");

		}
		System.out.println();
		System.out.print("NewArr2: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(newArr2[i]+", ");
		}
	}
}

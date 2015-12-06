import java.util.Scanner;

public class Problem_9 {

	public static void main(String[] args) {
		// Задача 9:
		// Напишете програма, в която потребителя въвежда масив, след което
		// елементите на масива се обръщат в обратен ред (Целта не е масива да
		// се отпечата в обратен ред, ами първо да се обърне, след което да се
		// отпечата в нормален ред). Пробвайте да решите задачата първо с един
		// допълнителен масив и после без да използвате друг масив.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int numN = sc.nextInt();

		int arr[] = new int[numN];
		int newArr[] = new int[numN];
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element " + i);
			arr[i] = sc.nextInt();
		}
		// for (int i = 0; i < newArr.length; i++) {
		// newArr[numN - 1 - i] = arr[i];
		// }
		
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}

		// for (int i = 0; i < arr.length; i++) {
		// System.out.print(newArr[i]+", ");
		// }
	}

}

import java.util.Scanner;

public class Problem_4 {

	public static void main(String[] args) {
		// Задача 4:
		// Да се прочете масив и да се отпечата дали е огледален.
		// Следните масиви са огледални:
		// [3 7 7 3]
		// [4]
		// [1 55 1]
		// [6 27 -1 5 7 7 5 -1 27 6]

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int numN = sc.nextInt();
		boolean flag = true;
		int arr[] = new int[numN];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element " + i);
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
			
		}
		System.out.println();
		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] != arr[arr.length-1 - i]) {
				System.out.println("Масивът не е огледален.");
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Масивът е огледален.");
		}
	}

}

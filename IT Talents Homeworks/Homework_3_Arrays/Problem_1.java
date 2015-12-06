import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		// Задача 1:
		// Да се прочете масив и да се намери най-малкото число кратно на
		// 3 от масива.
		// 10, 3, 5, 8, 6, -3, 7
		// Най-малкото число кратно на 3 е -3

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int numN = sc.nextInt();

		int arr[] = new int[numN];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element " + i);
			arr[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] <= min)&&(arr[i]%3==0)) {
				min = arr[i];
			}

		}
		if(min%3==0){
		System.out.println("Най-малката въведена стойност, кратна на 3 е: "+min);
		} else{
			System.out.println("В масива не е въведена стойност кратна на 3");
		}
	}
}
import java.util.Arrays;
import java.util.Scanner;

public class Problemm_12 {
	// ������ 12:
	// �� �� ������� �����, ����� ������ �� ������ ����� ����� N �
	// ����� ����� �� ����� � ������� N, ����� ������� ������ �����
	// �� 1 �� N.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println(Arrays.toString(arrayCreation(num)));

	}

	static int[] arrayCreation(int num) {
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}

}

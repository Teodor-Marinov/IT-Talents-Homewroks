import java.util.Scanner;

public class Problem_4 {

	public static void main(String[] args) {
		// ������ 4:
		// �������� 2 �������� ����� �� ��������� � �� ������������ �
		// ��������� ���.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number A:");
		int numA = sc.nextInt();
		System.out.println("Enter Number B:");
		int numB = sc.nextInt();

		if (numA != numB) {
			if (numA < numB) {
				System.out.println(numA + " " + numB);
			} else {
				System.out.println(numB + " " + numA);
			}
		} else {
			System.out.println(numA + " " + numB);
		}

	}

}

import java.util.Scanner;

public class Problem_6 {

	public static void main(String[] args) {
		// ������ 6: �� �� ������� ����� �� ������(���������) � �� ��
		// ������ ����� �� ������ ����� ����� 1 � ���������� �����.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number A:");
		int numA = sc.nextInt();

		int sum = 0;

		if (numA <= 0) {
			for (int i = numA; i <= 1; i++) {
				sum = sum + i;
			}
		} else {
			for (int i = 1; i <= numA; i++) {
				sum = sum + i;

			}
		}
		System.out.println(sum);
	}
}
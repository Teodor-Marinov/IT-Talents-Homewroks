import java.util.Scanner;

public class Problemm_15 {

	public static void main(String[] args) {
		// ������ 15: �� �� ������� ��������, ����� �� ������� ������ ��
		// ������ ����� �� 1 �� �������� ����� N.
		// ������: 5
		// �����: 15
		// ����������� ����� do-while.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number N");
		int num = sc.nextInt();
		int sum = 0;
		int nextNumber = 1;
		do {
			sum = sum + nextNumber;
			nextNumber++;
		} while (nextNumber <= num);
		System.out.println(sum);

	}
}

import java.util.Scanner;

public class Problemm_16 {

	public static void main(String[] args) {
		// ������ 16:
		// �� �� ������� ��������, ���� ����� �� �������� 2 ����������
		// ����� N, M �� ��������� [10..5555].
		// ����������, ���� ����� for, �� ������� ������ ����� ��
		// ���������, ����� �� ������ �� 50 � �������� ���.
		// ������: 25,249
		// �����: 200,150,100, 50.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number A(10 to 5555)");
		int numA = sc.nextInt();
		System.out.println("Enter number B(10 to 5555)");
		int numB = sc.nextInt();
		if (numA <= numB) {
			for (int i = numB; i >= numA; i--) {
				if (i % 50 == 0) {
					System.out.print(i + ", ");
				}

			}
		} else {
			for (int i = numA; i >= numB; i--) {
				if (i % 50 == 0) {
					System.out.print(i + ", ");
				}

			}
		}

	}

}
